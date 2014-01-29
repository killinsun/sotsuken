package org.apache.jsp.setting;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.safna.bean.UserBean;
import jp.ac.fjb.safna.bean.UserGroupBean;
import java.util.ArrayList;

public final class setprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

	UserBean uData = (UserBean) session.getAttribute("LOGIN_USER");
	ArrayList<UserGroupBean> gbList = (ArrayList<UserGroupBean>) session
			.getAttribute("GROUP_LIST");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>個人プロファイルの設定</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/safna/css/main.css\" type=\"text/css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/safna/css/setting.css\" type=\"text/css\">\n");
      out.write("<link rel=\"shortcut icon\" href=\"img/favicon.ico\">\n");
      out.write("<script\n");
      out.write("\tsrc=\"http://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js\"></script>\n");
      out.write("<script src=\"/safna/src/nav.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"container\">\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "..//menu.jsp", out, false);
      out.write("\n");
      out.write("\t\t<section id=\"mainContainer\">\n");
      out.write("\t\t\t<section id=\"main\">\n");
      out.write("\t\t\t\t<h1>個人プロファイルの設定</h1>\n");
      out.write("\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t<table class=\"Table1\" width=\"1000px\">\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>ユーザーID</th>\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(uData.getUserId());
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>パスワード</th>\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"password\" id=\"password\"></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>パスワード(確認)</th>\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"password\" id=\"password2\"></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>氏名</th>\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" id=\"userName\"\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print(uData.getUserName());
      out.write("\"></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>生年月日</th>\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"date\" id=\"birthday\"\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print(uData.getBirthDay());
      out.write("\"></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>クラス</th>\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(uData.getUserClass());
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>現在設定している団体</th>\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(uData.getGroupName());
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>権限</th>\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(uData.getPermit());
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"変更\">\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t\t<h1>所属している団体を変更する</h1>\n");
      out.write("\t\t\t\t<table class=\"Table1\" width=\"1000px\">\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th>団体ID</th>\n");
      out.write("\t\t\t\t\t\t<th>団体名</th>\n");
      out.write("\t\t\t\t\t\t<th>責任者</th>\n");
      out.write("\t\t\t\t\t\t<th>カテゴリ</th>\n");
      out.write("\t\t\t\t\t\t<th>あなたの権限</th>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t");

						for (UserGroupBean gb : gbList) {
							out.print("<tr>");
							out.print("<td><a href='/safna/UserProfileServlet?type=1&groupId="+gb.getGroupId()+"'>" + gb.getGroupId() + "</a></td>");
							out.print("<td>" + gb.getGroupName() + "</td>");
							out.print("<td>" + gb.getLeaderId() + "</td>");
							out.print("<td>" + gb.getGroupCategory() + "</td>");
							out.print("<td>" + gb.getPermit() + "</td>");
							out.print("</tr>");
						}
					
      out.write("\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t</section>\n");
      out.write("\n");
      out.write("\t\t<footer>\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\t<small>Copyright&copy; 2013 Kill_In_Sun All rights reserved</small>\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t</footer>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");

	session.setAttribute("GROUP_LIST",null);

      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
