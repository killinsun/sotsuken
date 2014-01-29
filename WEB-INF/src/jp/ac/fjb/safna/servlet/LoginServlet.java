package jp.ac.fjb.safna.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.safna.bean.UserBean;
import jp.ac.fjb.safna.model.LoginModel;
import jp.ac.fjb.safna.util.SafePassword;

public class LoginServlet extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//文字コードの指定
		resp.setContentType("text/html; charset=UTF-8");
		req.setCharacterEncoding("UTF-8");

		HttpSession s = req.getSession();	// セッション
		String jspName = "";				// 遷移先JSP名

		// IDとパスワードを取得
		String userId = req.getParameter("id");
		String password = req.getParameter("pass");

		//入力されたパスワードをIDとのsalt値をとってSHA256化する
		SafePassword safepass = new SafePassword();
		password = safepass.getStretchedPassword(password, userId);

		System.out.println("ユーザID:"   + userId);
		System.out.println("パスワード:" + password);


		boolean flag = false;
		if(userId.length() > 7 ){
			s.setAttribute("ERROR_LOGIN", "IDの入力文字許容数を超えています");
			flag = true;
		}


		//入力チェックに引っかからなければ、スタート
		if(!flag){
			// 【モデルの呼び出し】ログイン判定
			LoginModel model = new LoginModel();
			UserBean user = model.getUser(userId, password);

			if ( user == null ) {
				// ユーザを取得出来なかった場合、エラーメッセージをセット
				s.setAttribute("ERROR_LOGIN", "IDまたはパスワードが違います");

			} else {
				// ユーザを取得できた場合、ユーザ情報をセッションにセット
				s.setAttribute("LOGIN_USER", user);

			}
		}
		//処理に関係なく、トップページを再表示
		jspName = "index.jsp";


		// 【ビューの呼び出し】
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
	}

}