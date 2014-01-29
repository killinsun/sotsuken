package jp.ac.fjb.safna.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.safna.bean.UserBean;
import jp.ac.fjb.safna.model.ActivityModel;

public class CatchcopyVoteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {


		//文字コードの指定
		resp.setContentType("text/html; charset=UTF-8");
		req.setCharacterEncoding("UTF-8");

		HttpSession s = req.getSession();	// セッション
		UserBean uData = (UserBean)s.getAttribute("LOGIN_USER");
		String jspName = "CatchcopyServlet";				// 遷移先JSP名
		
		String cpId = req.getParameter("cpId");
		
		ActivityModel actModel = new ActivityModel();
		actModel.voteCP(cpId, uData.getUserId());
		
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
		
	}

}
