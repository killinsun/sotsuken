package jp.ac.fjb.safna.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.safna.bean.UserBean;
import jp.ac.fjb.safna.model.AccountingModel;
import jp.ac.fjb.safna.util.SqlTool;

public class ProductServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//文字コードの指定
		resp.setContentType("text/html; charset=UTF-8");
		req.setCharacterEncoding("UTF-8");

		HttpSession s = req.getSession();	// セッション
		String jspName = "InventryManagementServlet";				// 遷移先JSP名
		String code = req.getParameter("code");
		String type = req.getParameter("type");
		UserBean uData = (UserBean)s.getAttribute("LOGIN_USER");
		String groupId = uData.getGroupId();
		
		AccountingModel acModel = new AccountingModel();
		if(type.equals("del")){
			acModel.deleteProduct(code, groupId);
			resp.sendRedirect(jspName);
		}else{
			resp.sendRedirect(jspName);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//文字コードの指定
		resp.setContentType("text/html; charset=UTF-8");
		req.setCharacterEncoding("UTF-8");

		HttpSession s = req.getSession();	// セッション
		String jspName = "InventryManagementServlet";				// 遷移先JSP名

		UserBean uData = (UserBean)s.getAttribute("LOGIN_USER");
		String groupId = uData.getGroupId();
		
		String code = req.getParameter("hiddenCode");
		String name = req.getParameter("hiddenName");
		String category = req.getParameter("hiddenCategory");
		int genka;
		int teika;
		int baika;
		int kosu;
		if(req.getParameter("hiddenGenka").equals("")){
			genka = 0;
		}else{
			genka = Integer.parseInt(req.getParameter("hiddenGenka"));
		}

		if(req.getParameter("hiddenTeika").equals("")){
			teika = 0;
		}else{
			teika = Integer.parseInt(req.getParameter("hiddenTeika"));
		}

		if(req.getParameter("hiddenBaika").equals("")){
			baika = 0;
		}else{
			baika = Integer.parseInt(req.getParameter("hiddenBaika"));
		}

		if(req.getParameter("hiddenKosu").equals("")){
			kosu = 0;
		}else{
			kosu = Integer.parseInt(req.getParameter("hiddenKosu"));
		}
		String ifFrom = req.getParameter("from");
		
		AccountingModel acModel = new AccountingModel();

		//商品確認画面から遷移
		if(ifFrom.equals("regist")){

			int modifyCheck = acModel.modifyProduct(code, name, category, genka, teika, baika, kosu);
			if(modifyCheck == 0){
				System.out.println("商品登録の際にエラーが発生しました");
				s.setAttribute("ERROR", "商品登録エラーが発生しました。");
			}
			
		//商品カテゴリ追加から遷移
		}else{

			String categoryName = req.getParameter("inputCategoryName");

			SqlTool sqlTool = new SqlTool();
			String categoryCode = sqlTool.getRow("商品カテゴリ", 2);
			Boolean insertCheck = acModel.addCategory(categoryCode,categoryName);
			if(!insertCheck){
				System.out.println("カテゴリの追加時にエラーが発生しました。");
				s.setAttribute("ERROR", "カテゴリ追加時にエラーが発生しました。");
			}
			
			String[] inputData = new String[7];
			inputData[0] = code;
			inputData[1] = name;
			inputData[2] = category;
			inputData[3] = String.valueOf(genka);
			inputData[4] = String.valueOf(teika);
			inputData[5] = String.valueOf(baika);
			inputData[6] = String.valueOf(kosu);
			
			System.out.println("registservlet"+inputData[0]);
			s.setAttribute("INPUT_DATA", inputData);
			
		}
		resp.sendRedirect(jspName);


	}

}

