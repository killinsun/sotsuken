package jp.ac.fjb.safna.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.safna.bean.GroupBean;
import jp.ac.fjb.safna.bean.UserBean;
import jp.ac.fjb.safna.model.ProfileModel;

public class GroupProfileServlet  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//文字コードの指定
		resp.setContentType("text/html; charset=UTF-8");
		req.setCharacterEncoding("UTF-8");

		HttpSession s = req.getSession();
		
		UserBean uData = (UserBean)s.getAttribute("LOGIN_USER");

		String jspName = "/setting/setGroupProfile.jsp";
		
		ProfileModel pModel = new ProfileModel();
		GroupBean gb = pModel.getGroupData(uData.getGroupId());
		ArrayList<String[]> dataList = pModel.getGroupMember(uData.getGroupId());
		
		s.setAttribute("LOGIN_GROUP",gb);
		s.setAttribute("GROUP_MEMBER",dataList);

		// 【ビューの呼び出し】
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);

	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//文字コードの指定
		resp.setContentType("text/html; charset=UTF-8");
		req.setCharacterEncoding("UTF-8");

		HttpSession s = req.getSession();	// セッション

		String jspName = "/setting/compSetGroupProfile.jsp";				// 遷移先JSP名
		UserBean uData	= (UserBean)s.getAttribute("LOGIN_USER");
		String groupId	= uData.getGroupId();								//設定している団体ID
		String groupName = req.getParameter("groupName"); 					//変更したい団体名(inputパラメータから取得したのは、変更されている可能性があるため）
		String addUsers = req.getParameter("addUsers");						//追加するユーザ（カンマ区切り)

		//モデルの呼び出しと値のセット
		ProfileModel profileModel = new ProfileModel();
		Map<Integer, String> checkList = profileModel.changeGroupProfile(groupId, groupName, addUsers);
		
		//登録できなかった値をセット
		s.setAttribute("CHECKLIST", checkList);

		// 【ビューの呼び出し】
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);

	}

}
