package jp.ac.fjb.safna.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.safna.model.MaintModel;

public class MaintChangeServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//文字コードの指定
		resp.setContentType("text/html; charset=UTF-8");
	    req.setCharacterEncoding("UTF-8");

		HttpSession s = req.getSession();	// セッション
		s.setAttribute("DATALIST", null);

		String jspName = "/setting/changeData.jsp";				// 遷移先JSP名
		

		// 【ビューの呼び出し】
		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);
		
		
	}

}
