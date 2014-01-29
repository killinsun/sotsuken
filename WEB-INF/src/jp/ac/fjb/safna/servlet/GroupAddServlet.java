package jp.ac.fjb.safna.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.safna.bean.GroupBean;
import jp.ac.fjb.safna.util.SqlTool;

public class GroupAddServlet extends HttpServlet {

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
		//<td>の数だけ取得し、それぞれArrayListに格納する
	
		String groupId;
		String groupName = req.getParameter("groupName");
		String category = req.getParameter("category");
		String leader = req.getParameter("leader");
		
		//sqlで使うツールのセット
		SqlTool sqltool = new SqlTool();

		//責任者IDがデータベースに存在するか確認------------------------------
		if(sqltool.searchUser(leader)){
			s.setAttribute("ERROR", "入力された責任者IDは、safnaにユーザー登録されていません。");
			System.out.println("責任者名エラー");
		}

		//グループの件数取得とグループID生成---------------------------------
		groupId = "d" + sqltool.getRow("団体",2);


		//既存グループの検索---------------------------------
		if(!sqltool.searchGroup(groupName)){
			//すでにユーザIDが登録されている場合の処理をここに書く
			s.setAttribute("ERROR", "入力された団体名は既に登録されていませんか？");
			System.out.println("グループ名エラー");
		}
		
		//ここまででエラーがなければ登録確認ページへ
		if(s.getAttribute("ERROR") == null){
			GroupBean groupBean = new GroupBean();
			groupBean.setGroupId(groupId);
			groupBean.setGroupName(groupName);
			groupBean.setGroupCategory(category);
			groupBean.setLeaderId(leader);
			s.setAttribute("ADD_G_CONFIRM", groupBean);
			jspName = "/setting/addGroupConfirm.jsp";
			// 【ビューの呼び出し】
			RequestDispatcher dp = req.getRequestDispatcher(jspName);
			dp.forward(req, resp);
		} else{
			jspName ="/safna/setting/addGroup.jsp";
			resp.sendRedirect(jspName);
		}


	}

}