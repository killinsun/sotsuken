package jp.ac.fjb.safna.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.safna.bean.MovieBean;
import jp.ac.fjb.safna.model.ActivityModel;

public class CmViewServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//文字コードの指定
		resp.setContentType("text/html; charset=UTF-8");
		req.setCharacterEncoding("UTF-8");		
		HttpSession s = req.getSession();
		String jspName = "/activity/cm.jsp";				// 遷移先JSP名
		
		ActivityModel acModel = new ActivityModel();
		
		//動画データの取得
		ArrayList<MovieBean> mvList = acModel.getMovieData();
		s.setAttribute("MOVIE_DATA", mvList);

		RequestDispatcher dp = req.getRequestDispatcher(jspName);
		dp.forward(req, resp);

	}


}
