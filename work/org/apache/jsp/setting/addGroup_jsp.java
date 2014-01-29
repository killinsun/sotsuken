package org.apache.jsp.setting;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.SkipPageException;

public final class addGroup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\n");
      out.write("    <title>団体の追加</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/main.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/setting.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"shortcut icon\" href=\"img/favicon.ico\">\n");
      out.write("    <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js\"></script>\n");
      out.write("    <script src=\"../src/nav.js\"></script>\n");
      out.write("    <script src=\"../src/setting.js\"></script>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("  <div id=\"container\">\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "..//menu.jsp", out, false);
      out.write("   \n");
      out.write("    <section id=\"mainContainer\">\n");
      out.write("      <section id=\"main\">\n");
      out.write("        <h1>団体の追加</h1>\n");
      out.write("        <form method=\"POST\" action=\"/safna/GroupAddServlet\">\n");
      out.write("          <datalist id=\"idType\">\n");
      out.write("          </datalist>\n");
      out.write("          <table class=\"Table1 addGroupT edit-table\" width=\"1000px\">\n");
      out.write("            <tr>\n");
      out.write("              <th>団体名</th>\n");
      out.write("              <th>団体カテゴリ</th>\n");
      out.write("              <th>団体責任者</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <td id=\"name001\"><input type=\"text\" name=\"groupName\"></td>\n");
      out.write("              <td><select name=\"category\"><option>クラス</option><option>有志</option></select></td>\n");
      out.write("              <td><input type=\"text\" list=\"idType\" autocomplete=\"on\" name=\"leader\"></td>\n");
      out.write("            </tr>\n");
      out.write("          </table>\n");
      out.write("          <input type=\"submit\" value=\"送信\">\n");
      out.write("        </form>\n");
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
