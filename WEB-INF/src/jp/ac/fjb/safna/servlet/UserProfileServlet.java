package jp.ac.fjb.safna.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.safna.bean.UserBean;
import jp.ac.fjb.safna.bean.UserGroupBean;
import jp.ac.fjb.safna.model.LoginModel;
import jp.ac.fjb.safna.model.ProfileModel;

public class UserProfileServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//文字コードの指定
		resp.setContentType("text/html; charset=UTF-8");
		req.setCharacterEncoding("UTF-8");

		HttpSession s = req.getSession();	// セッション
		String jspName = "/setting/setprofile.jsp";				// デフォルト遷移先JSP名

		UserBean uData = (UserBean)s.getAttribute("LOGIN_USER");

		//GETのIDによって処理を変える。
		String type = req.getParameter("type");
		if(type.equals("1")){
			LoginModel lModel = new LoginModel();
			String cGroupId = req.getParameter("groupId"); //変更したいグループID
			lModel.setLoginGroup(uData, cGroupId);
			jspName = "index.jsp";				// デフォルト遷移先JSP名
		}
		ProfileModel pModel = new ProfileModel();
		ArrayList<UserGroupBean> gbList = pModel.getUserGroupData(uData.getUserId());
		s.setAttribute("GROUP_LIST", gbList);


		// 【ビューの呼び出し】
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
	}

}
