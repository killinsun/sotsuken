package org.apache.jsp.activity;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class compCm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>写真集</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/safna/css/main.css\" type=\"text/css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/safna/css/activity.css\" type=\"text/css\">\n");
      out.write("<link rel=\"shortcut icon\" href=\"/safna/img/favicon.ico\">\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.9.1.min.js\"></script>\n");
      out.write("<script src=\"/safna/src/nav.js\"></script>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("section#main {\n");
      out.write("\tmargin: 0 auto;\n");
      out.write("\tmargin-bottom: 50px;\n");
      out.write("\twidth: 900px;\n");
      out.write("\theight: 100%;\n");
      out.write("\tfloat: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("section#mainContainer img {\n");
      out.write("\tclear: both;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!-- header -->\n");
      out.write("\t<div id=\"container\">\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "..//menu.jsp", out, false);
      out.write("\n");
      out.write("\t\t<section id=\"mainContainer\">\n");
      out.write("\t\t\t<section id=\"main\">\n");
      out.write("\t\t\t\t<h1>CM大会 動画のアップロード完了</h1>\n");
      out.write("\t\t\t\t<div id=\"wrapper\">\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t動画のアップロードが完了しました。<br/>\n");
      out.write("\t\t\t\t\t\t<a href=\"/safna/activity/cm.jsp\">動画一覧へ戻る</a>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t\t<article>\n");
      out.write("\t\t\t\t<h1>エントリ</h1>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li>3G1 - ユニバーサル小野沢じゃぱん</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</article>\n");
      out.write("\n");
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
