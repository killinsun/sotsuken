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

public final class estimate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>見積書の提出</title>\n");
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
      out.write("\t\t\t\t<h1>見積書の提出</h1>\n");
      out.write("\t\t\t\t<div id=\"registForm\">\n");
      out.write("\t\t\t\t\t<form onsubmit=\"return false\" name=\"calc\">\n");
      out.write("\t\t\t\t\t\t<table class=\"Table1\">\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<th>団体責任者:\n");
      out.write("\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>竹内涼太</td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<th>団体名:\n");
      out.write("\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>ユニバーサルおのざわジャパン\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<th>販売予定商品:\n");
      out.write("\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td><textarea name=\"goods1\" cols=\"45\" rows=\"2\"></textarea></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<th>販売予定商品2:\n");
      out.write("\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td><textarea name=\"goods1\" cols=\"45\" rows=\"2\"></textarea></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t<div id=\"costTables\">\n");
      out.write("\t\t\t\t\t\t\t<table id=\"MaterialTable\" class=\"Table2\">\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th colspan=\"4\">材料費</th>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>品名</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>単価</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>個数</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>金額</th>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input size=\"30\" type=\"text\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"number\" name=\"price1_1\" id=\"price1_1\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"0\" oninput=\"formCalc(1,1)\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"number\" name=\"numArt1_1\" id=\"numArt1_1\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"0\" oninput=\"formCalc(1,1)\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><output name=\"amount1_1\" for=\"price1_1 numArt1_1\">0</output></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input size=\"30\" type=\"text\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"number\" name=\"price1_2\" id=\"price1_2\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"0\" oninput=\"formCalc(1,2)\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"number\" name=\"numArt1_2\" id=\"numArt1_2\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"0\" oninput=\"formCalc(1,2)\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><output name=\"amount1_2\" for=\"price1_2 numArt1_2\">0</output></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input size=\"30\" type=\"text\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"number\" name=\"price1_3\" id=\"price1_3\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"0\" oninput=\"formCalc(1,3)\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"number\" name=\"numArt1_3\" id=\"numArt1_3\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"0\" oninput=\"formCalc(1,3)\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><output name=\"amount1_3\" for=\"price1_3 numArt1_3\">0</output></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td colspan=\"2\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>小計</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><output name=\"subTotal1\" for=\"amount*\">0</output></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</table>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<table id=\"CostTable\" class=\"Table2\">\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th colspan=\"4\">設備費</th>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>品名</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>単価</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>個数</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>金額</th>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input size=\"30\" type=\"text\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"number\" name=\"price2_1\" id=\"price2_1\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"0\" oninput=\"formCalc(2,1)\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"number\" name=\"numArt2_1\" id=\"numArt2_1\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"0\" oninput=\"formCalc(2,1)\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><output name=\"amount2_1\" for=\"price2_1 numArt2_1\">0</output></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input size=\"30\" type=\"text\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"number\" name=\"price2_2\" id=\"price2_2\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"0\" oninput=\"formCalc(2,2)\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"number\" name=\"numArt2_2\" id=\"numArt2_2\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"0\" oninput=\"formCalc(2,2)\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><output name=\"amount2_2\" for=\"price2_2 numArt2_2\">0</output></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input size=\"30\" type=\"text\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"number\" name=\"price2_3\" id=\"price2_3\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"0\" oninput=\"formCalc(2,3)\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"number\" name=\"numArt2_3\" id=\"numArt2_3\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"0\" oninput=\"formCalc(2,3)\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><output name=\"amount2_3\" for=\"price2_3 numArt2_3\">0</output></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td colspan=\"2\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>小計</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><output name=\"subTotal2\" for=\"amount*\">0</output></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t<table id=\"DecorationTable\" class=\"Table2\">\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th colspan=\"4\">装飾費</th>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>品名</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>単価</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>個数</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>金額</th>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input size=\"30\" type=\"text\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"number\" name=\"price3_1\" id=\"price3_1\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"0\" oninput=\"formCalc(3,1)\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"number\" name=\"numArt3_1\" id=\"numArt3_1\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"0\" oninput=\"formCalc(3,1)\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><output name=\"amount3_1\" for=\"price3_1 numArt3_1\">0</output></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input size=\"30\" type=\"text\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"number\" name=\"price3_2\" id=\"price3_2\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"0\" oninput=\"formCalc(3,2)\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"number\" name=\"numArt3_2\" id=\"numArt3_2\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"0\" oninput=\"formCalc(3,2)\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><output name=\"amount3_2\" for=\"price3_2 numArt3_2\">0</output></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input size=\"30\" type=\"text\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"number\" name=\"price3_3\" id=\"price3_3\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"0\" oninput=\"formCalc(3,3)\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"number\" name=\"numArt3_3\" id=\"numArt3_3\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"0\" oninput=\"formCalc(3,3)\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><output name=\"amount3_3\" for=\"price3_3 numArt3_3\">0</output></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td colspan=\"2\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>小計</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><output name=\"subTotal3\" for=\"amount*\">0</output></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<table id=\"totalTable\" class=\"Table2 Table3\">\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>合計</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><output name=\"Total\" for=\"subTotal1-3\">0</output></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t\t\t\t\t<div id=\"submit\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"送信\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
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
