package jp.ac.fjb.safna.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.safna.bean.ProductBean;
import jp.ac.fjb.safna.bean.UserBean;
import jp.ac.fjb.safna.model.AccountingModel;
import jp.ac.fjb.safna.util.CreateJson;

public class AccountingViewServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//文字コードの指定
		resp.setContentType("text/html; charset=UTF-8");
	    req.setCharacterEncoding("UTF-8");		
		HttpSession s = req.getSession();
		String jspName = "";				// 遷移先JSP名
		
		UserBean uData = (UserBean)s.getAttribute("LOGIN_USER");
		String groupId = uData.getGroupId();

		AccountingModel acModel = new AccountingModel();
		ArrayList<ProductBean> pbList = acModel.getProduct(groupId);
		s.setAttribute("PRODUCT_DATA", pbList);
		
		//商品情報をJSONにする
		HashMap<String,Object> valueMap = new HashMap<String,Object>();
		valueMap.put("Product",pbList);
		CreateJson cj = new CreateJson();
		String jsonString = cj.makeJSONString(valueMap);
		s.setAttribute("PRODUCT_JSON", jsonString);


		jspName = "/accounting/accounting.jsp";
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//文字コードの指定
		resp.setContentType("text/html; charset=UTF-8");
	    req.setCharacterEncoding("UTF-8");		
		HttpSession s = req.getSession();
		String jspName = "";				// 遷移先JSP名
		
		UserBean uData = (UserBean)s.getAttribute("LOGIN_USER");
		String groupId = uData.getGroupId();

		AccountingModel acModel = new AccountingModel();
		ArrayList<ProductBean> pbList = acModel.getProduct(groupId);
		s.setAttribute("PRODUCT_DATA", pbList);
		
		//商品情報をJSONにする
		HashMap<String,Object> valueMap = new HashMap<String,Object>();
		valueMap.put("Product",pbList);
		CreateJson cj = new CreateJson();
		String jsonString = cj.makeJSONString(valueMap);
		s.setAttribute("PRODUCT_JSON", jsonString);


		jspName = "/accounting/accounting.jsp";
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
		
	}

}
