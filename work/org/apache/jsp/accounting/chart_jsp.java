package org.apache.jsp.accounting;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.safna.bean.ChartBean;
import java.util.ArrayList;

public final class chart_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write('\n');

	ArrayList<ChartBean> cbList = (ArrayList) session
			.getAttribute("CHART_DATA");
	ArrayList<String> productNameList = new ArrayList<String>(); //商品名を格納する
	for (ChartBean cb : cbList) {

		//既に同じ名前の商品名がある場合は登録しない
		if (productNameList.indexOf(cb.getName()) == -1) { //-1の場合はproductNameListのインデックス上に無いことを表す
			productNameList.add(cb.getName());
		}
	}

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>商品登録画面</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/safna/css/main.css\" type=\"text/css\">\n");
      out.write("<link rel=\"shortcut icon\" href=\"/safna/img/favicon.ico\">\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.9.1.min.js\"></script>\n");
      out.write("<script src=\"/safna/src/nav.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"container\">\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "..//menu.jsp", out, false);
      out.write("\n");
      out.write("\t\t<section id=\"mainContainer\">\n");
      out.write("\t\t\t<section id=\"main\">\n");
      out.write("\t\t\t\t<h1>チャート</h1>\n");
      out.write("\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<select name=\"charts\">\n");
      out.write("\t\t\t\t\t\t\t<option value=\"uriage\">売上</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"kokyaku\">顧客</option>\n");
      out.write("\t\t\t\t\t\t</select> <input type=\"submit\" value=\"変更\">\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<section id=\"chartImg\">\n");
      out.write("\t\t\t\t\t\t<img\n");
      out.write("\t\t\t\t\t\t\tsrc=\"http://chart.apis.google.com/chart?\n");
      out.write("chtt=商品別売上高\n");
      out.write("&chdl=");
for (String n : productNameList) {
				out.print(n + "|");
			}
      out.write("\n");
      out.write("&chs=500x300\n");
      out.write("&chd=t:");
for (ChartBean cb : cbList) {

			}
      out.write("\n");
      out.write("\n");
      out.write("10,20,30,40,50,60,70,80,90,20\n");
      out.write("&cht=bvs\n");
      out.write("&chco=ff0000,00ff00\n");
      out.write("&chxt=x,y\n");
      out.write("        \">\n");
      out.write("\t\t\t\t\t</section>\n");
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
