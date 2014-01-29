package org.apache.jsp.setting;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class mastermaint_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>マスターメンテナンス</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/safna/css/main.css\" type=\"text/css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/safna/css/setting.css\" type=\"text/css\">\n");
      out.write("<link rel=\"shortcut icon\" href=\"img/favicon.ico\">\n");
      out.write("<script\n");
      out.write("\tsrc=\"http://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js\"></script>\n");
      out.write("<script src=\"/safna/src/nav.js\"></script>\n");
      out.write("<script src=\"/safna/src/setting.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"container\">\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "..//menu.jsp", out, false);
      out.write("\n");
      out.write("\t\t<section id=\"mainContainer\">\n");
      out.write("\t\t\t<section id=\"main\">\n");
      out.write("\t\t\t\t<h1>マスターメンテナンス</h1>\n");
      out.write("\t\t\t\t<section id=\"selectMenu\">\n");
      out.write("\t\t\t\t\t<form action=\"/safna/MaintServlet\" method=\"GET\">\n");
      out.write("\t\t\t\t\t\t<select name=\"menuName\">\n");
      out.write("\t\t\t\t\t\t\t<option value=\"ユーザ\">ユーザ</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"団体\">団体</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"ユーザ管理\">ユーザ管理</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"権限\">権限</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"ニュース\">ニュース</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"商品\">商品</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"商品管理\">商品管理</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"キャッチコピー\">キャッチコピー</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"CM大会動画\">CM大会動画</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"活動カテゴリ\">活動カテゴリ</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"写真\">写真</option>\n");
      out.write("\t\t\t\t\t\t</select> <input type=\"submit\">\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</section>\n");
      out.write("\t\t\t\t<form action=\"/safna/MaintChangeServlet\" method=\"POST\" id=\"dataForm\">\n");
      out.write("\t\t\t\t\t<table class=\"Table1\" width=\"1000px\">\n");
      out.write("\t\t\t\t\t\t");
 
						if(session.getAttribute("DATALIST") != null){
							ArrayList<String[]> dataList = (ArrayList<String[]>)session.getAttribute("DATALIST");
							boolean flag=false;
							int j=0;
							for(String[] data:dataList){
								j++;
								out.print("<tr name='tableRow' id=" + j + ">");
								if(flag==false){
									for(int i=-1;i < data.length;i++){
										out.print("<th>");
										if(i ==-1){
											out.print("チェック");
										}else{
											out.print(data[i]);
										}
										out.print("</th>");
									}
									flag=true;
								}else{
									for(int i=-1;i < data.length;i++){
										out.print("<td>");
										if(i ==-1){
											out.print("<input type='checkbox' name='" + j +"'>");
										}else if(i ==0){
											out.print("<input class='formIDbutton' type='submit' value='" + data[i] +"'>");
										}else{
											out.print(data[i]);
										}
										out.print("</td>");
									}
								}
								out.print("</tr>");
							}
							flag=false;
						}
					
      out.write("\n");
      out.write("\t\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t</form>\n");
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
      out.write("\n");

	session.setAttribute("DATALIST",null);

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
