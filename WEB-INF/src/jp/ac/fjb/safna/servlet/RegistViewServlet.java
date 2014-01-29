package jp.ac.fjb.safna.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.safna.bean.ProductBean;
import jp.ac.fjb.safna.bean.UserBean;
import jp.ac.fjb.safna.model.AccountingModel;

public class RegistViewServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//文字コードの指定
		resp.setContentType("text/html; charset=UTF-8");
		req.setCharacterEncoding("UTF-8");

		HttpSession s = req.getSession();	// セッション
		UserBean uData = (UserBean)s.getAttribute("LOGIN_USER");
		String groupId = uData.getGroupId();
		
		AccountingModel acModel = new AccountingModel();
		ArrayList<ProductBean> pmList = acModel.getProduct(groupId);
		
		ArrayList<String> cateList = acModel.getCategory();
		
		s.setAttribute("CATEGORY_DATA",cateList);
		s.setAttribute("PRODUCT_DATA", pmList);
		// 【ビューの呼び出し】
		String jspName = "/accounting/regist.jsp";				// 遷移先JSP名
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//文字コードの指定
		resp.setContentType("text/html; charset=UTF-8");
		req.setCharacterEncoding("UTF-8");

		HttpSession s = req.getSession();	// セッション
		UserBean uData = (UserBean)s.getAttribute("LOGIN_USER");
		String groupId = uData.getGroupId();
		
		AccountingModel acModel = new AccountingModel();
		ArrayList<ProductBean> pmList = acModel.getProduct(groupId);
		ArrayList<String> cateList = acModel.getCategory();
		
		s.setAttribute("PRODUCT_DATA", pmList);
		s.setAttribute("CATEGORY_DATA",cateList);
		// 【ビューの呼び出し】
		String jspName = "/accounting/regist.jsp";				// 遷移先JSP名
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
	}

}
