package jp.ac.fjb.safna.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.safna.bean.UserBean;
import jp.ac.fjb.safna.model.AccountingModel;

public class AccountingServlet  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//文字コードの指定
		resp.setContentType("text/html; charset=UTF-8");
	    req.setCharacterEncoding("UTF-8");		
		HttpSession s = req.getSession();
		String jspName = "AccountingViewServlet";				// 遷移先JSP名
		
		//使わないデータは一旦削除しておく
		s.setAttribute("PRODUCT_DATA", null);
		s.setAttribute("PRODUCT_JSON", null);
		UserBean uData = (UserBean)s.getAttribute("LOGIN_USER");
		
		String jsonString =req.getParameter("hiddenParm");
		AccountingModel acModel = new AccountingModel();
		//JSON文字列を元に、会計ログテーブルへデータを追加する
		acModel.addLog(jsonString,uData.getGroupId(),uData.getUserId());

		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);

		
	}

}
