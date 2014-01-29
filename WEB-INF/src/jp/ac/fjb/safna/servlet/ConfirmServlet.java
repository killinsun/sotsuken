package jp.ac.fjb.safna.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.safna.bean.ConfirmBean;
import jp.ac.fjb.safna.model.SignupModel;

public class ConfirmServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

			HttpSession s = req.getSession();
			String jspName = "";				// 遷移先JSP名
			// 【モデルの呼び出し】ログイン判定
			ConfirmBean uData = (ConfirmBean)s.getAttribute("SIGNUPDATA");
			SignupModel model = new SignupModel();
			Boolean insertCheck = model.addUser(uData.getUserName(),
												uData.getUserId(), 
												uData.getPassWord(),
												uData.getBirthDay(),
												uData.getUserClass());

			if ( !insertCheck ) {
				// ユーザを取得出来なかった場合、エラーメッセージをセット
				s.setAttribute("ERROR", "登録ができませんでした。");
	
			}
			jspName = "compRegist.jsp";
			RequestDispatcher dp = req.getRequestDispatcher(jspName);
			dp.forward(req, resp);

	}
}


