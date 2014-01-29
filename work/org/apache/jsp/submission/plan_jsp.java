package org.apache.jsp.submission;

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

public final class plan_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>企画書の提出</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/main.css\" type=\"text/css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/submission.css\" type=\"text/css\">\n");
      out.write("<link rel=\"shortcut icon\" href=\"../img/favicon.ico\">\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.9.1.min.js\"></script>\n");
      out.write("<script src=\"../src/nav.js\"></script>\n");
      out.write("<script src=\"../src/estimate.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"container\">\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "..//menu.jsp", out, false);
      out.write("\n");
      out.write("\t\t<section id=\"mainContainer\">\n");
      out.write("\t\t\t<section id=\"main\">\n");
      out.write("\t\t\t\t<h1>企画書の提出</h1>\n");
      out.write("\t\t\t\t<form onsubmit=\"return false\" name=\"calc\">\n");
      out.write("\t\t\t\t\t<table class=\"Table1\">\n");
      out.write("\t\t\t\t\t\t<colgroup span=\"1\" class=\"midashi\"></colgroup>\n");
      out.write("\t\t\t\t\t\t<colgroup span=\"1\" width=\"100px\"></colgroup>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th rowspan=\"2\">団体責任者:</th>\n");
      out.write("\t\t\t\t\t\t\t<td><select name=\"subject\" id=\"subject\" required>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"ITエンジニア科\">ITエンジニア科</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"情報処理科\">情報処理科</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"情報ネットワーク科\">情報ネットワーク科</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"ビジネスライセンス科\">ビジネスライセンス科</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"WEBクリエイター科\">WEBクリエイター科</option>\n");
      out.write("\t\t\t\t\t\t\t</select></td>\n");
      out.write("\t\t\t\t\t\t\t<td><select name=\"year\" id=\"year\" required>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"1\">1</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"2\">2</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"3\">3</option>\n");
      out.write("\t\t\t\t\t\t\t</select> 年</td>\n");
      out.write("\t\t\t\t\t\t\t<td><select name=\"class\" id=\"class\" required>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"1\">1</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"2\">2</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"3\">3</option>\n");
      out.write("\t\t\t\t\t\t\t</select> 組</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>氏名:</th>\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\"><input size=\"30\" type=\"text\" name=\"leader\"\n");
      out.write("\t\t\t\t\t\t\t\tautofocus required></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>団体名:</th>\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"3\"><input size=\"100\" type=\"text\" name=\"group\"\n");
      out.write("\t\t\t\t\t\t\t\trequired>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>クラス人数:</th>\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"3\"><input type=\"number\" max=\"50\" min=\"0\"\n");
      out.write("\t\t\t\t\t\t\t\tid=\"memberNum\"></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>場所:</th>\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"3\"><select name=\"place\" id=\"place\" required>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"aaa\">aaaa</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"bbb\">bbbb</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"ccc\">cccc</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"ddd\">dddd</option>\n");
      out.write("\t\t\t\t\t\t\t</select></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>企画内容:</th>\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"3\"><textarea id=\"plan\" name=\"plan\" cols=\"75\"\n");
      out.write("\t\t\t\t\t\t\t\t\trows=\"10\"></textarea></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>使用するレンタル器材:</th>\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\">外部から</br> <select name=\"rental\" id=\"rental\"\n");
      out.write("\t\t\t\t\t\t\t\tmultiple>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"aaa\">aaaa</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"bbb\">bbbb</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"ccc\">cccc</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"ddd\">dddd</option>\n");
      out.write("\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td>団体持参</br> <textarea id=\"bring\" name=\"bring\" cols=\"40\"\n");
      out.write("\t\t\t\t\t\t\t\t\trows=\"4\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>使用したい構内設備や機材</th>\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"3\"><select size=\"7\" id=\"fjbRental\"\n");
      out.write("\t\t\t\t\t\t\t\tname=\"fjbRental\" multiple>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"aaa\">aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"bbb\">bbbb</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"ccc\">cccc</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"ddd\">dddd</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"ddd\">dddd</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"ddd\">dddd</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"ddd\">dddd</option>\n");
      out.write("\t\t\t\t\t\t\t</select></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>仮申請</th>\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"3\"><input type=\"submit\" value=\"仮申請\"></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\n");
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
