package jp.ac.fjb.safna.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.safna.bean.CpBean;
import jp.ac.fjb.safna.bean.UserBean;
import jp.ac.fjb.safna.model.ActivityModel;

public class CatchcopyServlet extends HttpServlet{

	//表示する際
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//文字コードの指定
		resp.setContentType("text/html; charset=UTF-8");
		req.setCharacterEncoding("UTF-8");

		HttpSession s = req.getSession();	// セッション
		UserBean uData = (UserBean)s.getAttribute("LOGIN_USER");
		String jspName = "/activity/catchcopy.jsp";				// 遷移先JSP名
		
		ActivityModel actModel = new ActivityModel();
		boolean cpExist = actModel.isCPexist(uData.getGroupId());
		ArrayList<CpBean> cpList = actModel.getCP();
		
		s.setAttribute("ISEXIST", cpExist);
		s.setAttribute("CPDATA",cpList);
		
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
		
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//文字コードの指定
		resp.setContentType("text/html; charset=UTF-8");
		req.setCharacterEncoding("UTF-8");

		HttpSession s = req.getSession();	// セッション
		UserBean uData = (UserBean)s.getAttribute("LOGIN_USER");
		String jspName = "/CatchCopyServlet";				// 遷移先JSP名
		
		String catchcopy = req.getParameter("catchcopy");
		String groupId = uData.getGroupId();
		
		ActivityModel actModel = new ActivityModel();
		
		actModel.addCP(groupId, catchcopy);
		
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
	}

}
