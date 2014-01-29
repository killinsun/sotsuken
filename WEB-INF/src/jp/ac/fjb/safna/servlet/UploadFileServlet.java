
package jp.ac.fjb.safna.servlet;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.fjb.safna.bean.UserBean;
import jp.ac.fjb.safna.model.ActivityModel;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadFileServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		//文字コードの指定
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		HttpSession s = request.getSession();	// セッション

		UserBean uData = (UserBean)s.getAttribute("LOGIN_USER");
		String groupId = uData.getGroupId();

		if (ServletFileUpload.isMultipartContent(request)) {

			// ファクトリー生成
			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setSizeThreshold(1426);

			// 一時的に保存する際のディレクトリ
			factory.setRepository(new File(getServletContext().getRealPath("data") + "/tmp/"));

			// アップロード可能なファイルサイズの設定
			ServletFileUpload upload = new ServletFileUpload(factory);
			upload.setSizeMax(-1);
			upload.setFileSizeMax(-1);

			List items;
			try {
				items = upload.parseRequest(request);
			} catch (FileUploadException e) {
				throw new ServletException(e);
			}

			String[] formData;  //[0]:フィールド名 [1]:フィールドの中身
			ArrayList<String[]> formDataList = new ArrayList<String[]>(); //フォームパラメータとデータの組み合わせ
			String hiddenData = ""; //後に処理を分ける用

			// 全フィールドに対するループ
			for (Object val : items) {
				FileItem item = (FileItem) val;
				if (item.isFormField()) {
					// type="file"以外のフィールド
					formData = processFormField(item);
					if(formData[0].equals("hiddenData")){
						hiddenData = formData[1];
					}
					formDataList.add(formData);
				} else {
					// type="file"のフィールド
					String filename = processUploadedFile(item);
					formData = new String[2];
					formData[0] = "fileName";
					formData[1] = filename;
					formDataList.add(formData);
				}
			}
			
			
			//参照元によって処理を変える
			ActivityModel acModel = new ActivityModel();
			if(hiddenData.equals("cmUpload")){
				acModel.UploadMovie(formDataList, groupId);
			}
		}

		// 自画面を再表示
		RequestDispatcher dispatcher = request.getRequestDispatcher("upFile.jsp");
		dispatcher.forward(request, response);
	}

	private String processUploadedFile(FileItem item) throws IOException,
			ServletException {
		File f = new File(item.getName());
		try {
			item.write(new File(getServletContext().getRealPath("data") + "/movie/", f.getName()));
			System.out.println(item.getName());
			return item.getName();
		} catch (IOException e) {
			throw e;
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	@SuppressWarnings("finally")
	private String[] processFormField(FileItem item) throws ServletException {

		String[] formData = new String[2];
		//パラメーターフィールド名
		formData[0] = item.getFieldName();
		System.out.println(item.getFieldName());
		try {
			//フィールドの中身
			System.out.println(item.getString("UTF-8"));
			formData[1] = item.getString("UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new ServletException(e);
		}finally{
			return formData;
		}
	}
}
