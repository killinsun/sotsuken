package jp.ac.fjb.safna.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.safna.bean.ConfirmBean;
import jp.ac.fjb.safna.util.SafePassword;
import jp.ac.fjb.safna.util.SqlTool;

public class SignupServlet extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//文字コードの指定
		resp.setContentType("text/html; charset=UTF-8");
	    req.setCharacterEncoding("UTF-8");

		HttpSession s = req.getSession();	// セッション
		String jspName = "";				// 遷移先JSP名
		s.setAttribute("ERROR", null);

		// フォームの値を取得 
		String userName = req.getParameter("commonName");
		String userId = req.getParameter("departId");
		String password = req.getParameter("password");
		String password2 = req.getParameter("password2");
		String birthday  = req.getParameter("birthday");
		String schoolYear = req.getParameter("schoolYear");
		String department = req.getParameter("Department");
		String schoolClass = req.getParameter("Class");

		//パスワードのチェック
		if ( !password.equals(password2) ) {
			s.setAttribute("ERROR", "パスワードが一致しません");
			System.out.println("パスワード一致エラー");
			System.out.println(password + "== " + password2);

		}
		//パスワードを暗号化する
		SafePassword utilSafe = new SafePassword();
		password= utilSafe.getStretchedPassword(password,userId);


		//既存ユーザの検索---------------------------------
		SqlTool sqltool = new SqlTool();
		if(!sqltool.searchUser(userId)){
			//すでにユーザIDが登録されている場合の処理をここに書く
			s.setAttribute("ERROR", "入力されたユーザーIDはすでに使用されています。");
			System.out.println("ゆーざーIDエラー");
		}
		
		//ここまででエラーがなければ登録確認ページへ
		if(s.getAttribute("ERROR") == null){
			
			String userClass = schoolYear + department + schoolClass;
			
			ConfirmBean confirmBean = new ConfirmBean();
			confirmBean.setUserId(userId);
			confirmBean.setUserName(userName);
			confirmBean.setBirthDay(birthday);
			confirmBean.setPassWord(password);
			confirmBean.setUserClass(userClass);

			s.setAttribute("SIGNUPDATA", confirmBean);
			jspName = "signupConfirm.jsp";
			// 【ビューの呼び出し】
			RequestDispatcher dp = req.getRequestDispatcher(jspName);
			dp.forward(req, resp);
			
		} else{
			jspName ="signup.jsp";
			resp.sendRedirect(jspName);
		}


	}

}