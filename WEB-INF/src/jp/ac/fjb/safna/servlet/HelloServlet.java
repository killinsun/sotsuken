package jp.ac.fjb.safna.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.ac.fjb.safna.model.TestModel;


public class HelloServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("Hello");

		TestModel testm = new TestModel();
		testm.testInsert();
		req.getRequestDispatcher("index.jsp").forward(req, resp);

	}

}
