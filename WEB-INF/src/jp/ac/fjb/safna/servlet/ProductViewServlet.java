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

public class ProductViewServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//文字コードの指定
		resp.setContentType("text/html; charset=UTF-8");
		req.setCharacterEncoding("UTF-8");

		String code = req.getParameter("code");
		HttpSession s = req.getSession();	// セッション

		AccountingModel acModel = new AccountingModel();
		UserBean uData = (UserBean)s.getAttribute("LOGIN_USER");
		String groupId = uData.getGroupId();

		ArrayList<String> cateList = acModel.getCategory();
		ProductBean pb = acModel.getProductOnce(code,groupId);
		s.setAttribute("PRODUCT_DATA", pb);
		s.setAttribute("CATEGORY_DATA", cateList);
		
		// 【ビューの呼び出し】
		String jspName = "/accounting/productView.jsp";				// 遷移先JSP名
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
	}

}
