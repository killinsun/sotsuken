package jp.ac.fjb.safna.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.safna.bean.NewsBean;
import jp.ac.fjb.safna.model.NewsModel;

public class NewsServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

			//文字コードの指定
			resp.setContentType("text/html; charset=UTF-8");
		    req.setCharacterEncoding("UTF-8");

			HttpSession s = req.getSession();
			String jspName = "/news/news.jsp";				// 遷移先JSP名
			
			NewsModel newsModel = new NewsModel();
			//ニュースのデータを取得
			ArrayList<NewsBean> newses = newsModel.getNews();
			s.setAttribute("NEWS_DATA", newses); //セッションに格納
			
			//jspの表示
			RequestDispatcher dp = req.getRequestDispatcher(jspName);
			dp.forward(req, resp);
			
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
			//文字コードの指定
			resp.setContentType("text/html; charset=UTF-8");
		    req.setCharacterEncoding("UTF-8");

			HttpSession s = req.getSession();
			String jspName = "/news/news.jsp";				// 遷移先JSP名
			
			NewsModel newsModel = new NewsModel();
			//ニュースのデータを取得
			ArrayList<NewsBean> newses = newsModel.getNews();
			s.setAttribute("NEWS_DATA", newses); //セッションに格納
			
			//jspの表示
			RequestDispatcher dp = req.getRequestDispatcher(jspName);
			dp.forward(req, resp);
	}
	
	private void action(){
		
	}

}
