package jp.ac.fjb.safna.servlet;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class CmUpServlet  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		if (ServletFileUpload.isMultipartContent(request)) {

			// ファクトリー生成
			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setSizeThreshold(1426);

			// 一時的に保存する際のディレクトリ
			factory.setRepository(new File("/Users/takeuchiryouta/Documents/data/tmp"));

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

			// 全フィールドに対するループ
			System.out.println("ループ前");
			for (Object val : items) {
				System.out.println("ループ後");
				FileItem item = (FileItem) val;
				if (item.isFormField()) {
					// type="file"以外のフィールド
					processFormField(item);
				} else {
					// type="file"のフィールド
					processUploadedFile(item);
				}
			}
		}

		// 自画面を再表示
		RequestDispatcher dispatcher = request.getRequestDispatcher("/activity/compCm.jsp");
		dispatcher.forward(request, response);
	}

	private void processUploadedFile(FileItem item) throws IOException,
			ServletException {
		File f = new File(item.getName());
		try {
			item.write(new File("/Users/takeuchiryouta/Documents/data", f.getName()));
		} catch (IOException e) {
			throw e;
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	private void processFormField(FileItem item) throws ServletException {

		System.out.println(item.getFieldName());
		try {
			System.out.println(item.getString("MS932"));
		} catch (UnsupportedEncodingException e) {
			throw new ServletException(e);
		}
	}

}

