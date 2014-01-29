package jp.ac.fjb.safna.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.safna.bean.UserBean;
import jp.ac.fjb.safna.model.NewsModel;

public class NewsSubmitServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

			//文字コードの指定
			resp.setContentType("text/html; charset=UTF-8");
		    req.setCharacterEncoding("UTF-8");

			HttpSession s = req.getSession();
			String jspName = "";				// 遷移先JSP名
			
			String title = req.getParameter("hiddenTitle");
			String body  = req.getParameter("hiddenBody");
			UserBean uData = (UserBean)s.getAttribute("LOGIN_USER");
			String user = uData.getUserId();
			
			// 【モデルの呼び出し】
			NewsModel newsModel = new NewsModel();
			int insNum = newsModel.addNews(title, body,user);
			if(insNum == 0){
				s.setAttribute("ERROR", "データの挿入に失敗しました");
			}
			
			jspName = "NewsServlet";
			RequestDispatcher dp = req.getRequestDispatcher(jspName);
			dp.forward(req, resp);

	}
}


