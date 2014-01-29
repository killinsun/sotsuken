package jp.ac.fjb.safna.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//文字コードの指定
		resp.setContentType("text/html; charset=UTF-8");
	    req.setCharacterEncoding("UTF-8");
	    
	    //セッションの取得→取得したセッションの破棄
	    HttpSession s = req.getSession();
	    s.invalidate();
	    
	    //トップページへ移動させる
		RequestDispatcher dp = req.getRequestDispatcher("/");
		dp.forward(req, resp);

	}

}
