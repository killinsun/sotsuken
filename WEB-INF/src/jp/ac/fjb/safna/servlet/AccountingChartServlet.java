package jp.ac.fjb.safna.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.safna.bean.ChartBean;
import jp.ac.fjb.safna.bean.UserBean;
import jp.ac.fjb.safna.model.AccountingModel;

public class AccountingChartServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//文字コードの指定
		resp.setContentType("text/html; charset=UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		HttpSession s = req.getSession();	// セッション
		UserBean uData = (UserBean)s.getAttribute("LOGIN_USER");
		String jspName = "/accounting/chart.jsp";				// 遷移先JSP名

		AccountingModel acModel = new AccountingModel();
		ArrayList<ChartBean> cbList = acModel.getChartData(uData.getGroupId());
		s.setAttribute("CHART_DATA", cbList);

		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
		

	}

}
