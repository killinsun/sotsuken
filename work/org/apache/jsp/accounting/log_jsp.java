package org.apache.jsp.accounting;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.safna.bean.LogBean;
import java.util.ArrayList;

public final class log_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>商品登録画面</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/safna/css/main.css\" type=\"text/css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/safna/css/accounting.css\" type=\"text/css\">\n");
      out.write("<link rel=\"shortcut icon\" href=\"/safna/img/favicon.ico\">\n");
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
      out.write("\t\t\t\t<h1>会計ログ</h1>\n");
      out.write("\n");
      out.write("\t\t\t\t<table class=\"Table1\" width=\"1000px\">\n");
      out.write("        <tr>\n");
      out.write("          <th>商品ID</th>\n");
      out.write("          <th>商品名</th>\n");
      out.write("          <th>カテゴリ</th>\n");
      out.write("          <th>売価</th>\n");
      out.write("          <th>個数</th>\n");
      out.write("          <th>売上金額</th>\n");
      out.write("          <th>時間</th>\n");
      out.write("        </tr>\n");
      out.write("\t\t\t\t");

					ArrayList<LogBean> lbList = (ArrayList<LogBean>)session.getAttribute("LOG_DATA");
					int goukei=0;
					for(LogBean lb:lbList){
						out.println("<tr>");
						out.println("<td>" + lb.getCode()+"</td>");
						out.println("<td>" + lb.getName()+"</td>");
						out.println("<td>" + lb.getCategoryName()+"</td>");
						out.println("<td>" + lb.getBaika()+"</td>");
						out.println("<td>" + lb.getCounter()+"</td>");
						out.println("<td>" + lb.getCounter() * lb.getBaika()+"</td>");
						out.println("<td>" + lb.getDate()+"</td>");
						out.println("</tr>");
						goukei = goukei + lb.getCounter() * lb.getBaika();
					}
					out.println("<tr>");
					out.println("<th>売上合計</th>");
					out.println("<td colspan='6' id='goukeiTd'>"+goukei+"</td>");
					out.println("</tr>");
				
      out.write("\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("      </section>\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("    <footer>\n");
      out.write("      <p><small>Copyright&copy;  2013 Kill_In_Sun All rights reserved</small></p>\n");
      out.write("    </footer>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
