package org.apache.jsp.accounting;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class check_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>会計情報の確認</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/main.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/accounting.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"shortcut icon\" href=\"../img/favicon.ico\">\n");
      out.write("    <script src=\"http://code.jquery.com/jquery-1.9.1.min.js\"></script>\n");
      out.write("    <script src=\"../src/nav.js\"></script>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("  <div id=\"container\">\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "..//menu.jsp", out, false);
      out.write("   \n");
      out.write("    <section id=\"mainContainer\">\n");
      out.write("      <section id=\"main\">\n");
      out.write("        <h1>各団体の会計情報の確認</h1>\n");
      out.write("        \n");
      out.write("        <table class=\"Table1\" width=\"1000px\">\n");
      out.write("        <!-- <tr>セクションがひとつのログとなっているので、jspで繰り返し取得して表示する -->\n");
      out.write("        <tr>\n");
      out.write("          <th>団体ID</th>\n");
      out.write("          <th>団体名</th>\n");
      out.write("          <th>運営</th>\n");
      out.write("          <th>カテゴリ</th>\n");
      out.write("          <th>場所</th>\n");
      out.write("          <th>状況</th>\n");
      out.write("          <th>ログ</th>\n");
      out.write("          <th>チャート</th>\n");
      out.write("        </tr>\n");
      out.write("        <tr class=\"deficit\">\n");
      out.write("          <td>dt001</td>\n");
      out.write("          <td>ユニバーサルおのざわじゃぱん</td>\n");
      out.write("          <td>3G1</td>\n");
      out.write("          <td>縁日・販売</td>\n");
      out.write("          <td>204</td>\n");
      out.write("          <td>赤字</td>\n");
      out.write("          <td>詳細</td>\n");
      out.write("          <td>確認</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>dt002</td>\n");
      out.write("          <td>BandsCollection2013</td>\n");
      out.write("          <td>有志団体</td>\n");
      out.write("          <td>軽音楽部ライブ</td>\n");
      out.write("          <td>５Fホール</td>\n");
      out.write("          <td>-</td>\n");
      out.write("          <td>-</td>\n");
      out.write("          <td>-</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>dt003</td>\n");
      out.write("          <td>団体3</td>\n");
      out.write("          <td>主催元</td>\n");
      out.write("          <td>飲食</td>\n");
      out.write("          <td>場所</td>\n");
      out.write("          <td>黒字</td>\n");
      out.write("          <td>詳細</td>\n");
      out.write("          <td>確認</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>dt004</td>\n");
      out.write("          <td>団体4</td>\n");
      out.write("          <td>主催元</td>\n");
      out.write("          <td>飲食</td>\n");
      out.write("          <td>場所</td>\n");
      out.write("          <td>黒字</td>\n");
      out.write("          <td>詳細</td>\n");
      out.write("          <td>確認</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td>dt005</td>\n");
      out.write("          <td>団体5</td>\n");
      out.write("          <td>主催元</td>\n");
      out.write("          <td>飲食</td>\n");
      out.write("          <td>場所</td>\n");
      out.write("          <td>黒字</td>\n");
      out.write("          <td>詳細</td>\n");
      out.write("          <td>確認</td>\n");
      out.write("        </tr>\n");
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
