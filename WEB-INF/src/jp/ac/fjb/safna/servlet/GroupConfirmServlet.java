package jp.ac.fjb.safna.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.safna.bean.GroupBean;
import jp.ac.fjb.safna.model.SignupModel;

public class GroupConfirmServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

			HttpSession s = req.getSession();
			String jspName = "";				// 遷移先JSP名
			// 【モデルの呼び出し】ログイン判定
			GroupBean gData = (GroupBean)s.getAttribute("ADD_G_CONFIRM");
			SignupModel model = new SignupModel();
			Boolean insertCheck = model.addGroup(gData.getGroupId(),gData.getGroupName(),
												gData.getGroupCategory(),gData.getLeaderId());


			if ( !insertCheck ) {
				// ユーザを取得出来なかった場合、エラーメッセージをセット
				s.setAttribute("ERROR", "登録ができませんでした。");
	
			}

			//authority =2 ...責任者なので
			model.insertUserkanri(gData.getLeaderId(),gData.getGroupId() ,2) ;
			jspName = "/setting/compGroup.jsp";
			RequestDispatcher dp = req.getRequestDispatcher(jspName);
			dp.forward(req, resp);

	}
}


