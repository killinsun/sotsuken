package org.apache.jsp.accounting;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.safna.bean.ProductBean;
import java.util.ArrayList;

public final class accounting_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>レジ</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/safna/css/main.css\" type=\"text/css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/safna/css/accounting.css\" type=\"text/css\">\n");
      out.write("<link rel=\"shortcut icon\" href=\"/safna/img/favicon.ico\">\n");
      out.write("<script\n");
      out.write("\tsrc=\"http://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js\"></script>\n");
      out.write("<script src=\"/safna/src/jquery-ui-1.10.3.custom.js\"></script>\n");
      out.write("<script src=\"/safna/src/nav.js\"></script>\n");
      out.write("<script src=\"/safna/src/accounting.js\"></script>\n");
      out.write("<script src=\"/safna//src/common.js\"></script>\n");
 ArrayList<ProductBean> pbList = (ArrayList)session.getAttribute("PRODUCT_DATA");
	String jsonString = (String)session.getAttribute("PRODUCT_JSON");

      out.write("\n");
      out.write("<script>\n");
      out.write("\tvar jsonString = ");
      out.print( jsonString );
      out.write(";\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"container\">\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../menu.jsp", out, false);
      out.write("\n");
      out.write("\t\t<section id=\"mainContainer\">\n");
      out.write("\t\t\t<section id=\"goodsSelect\">\n");
      out.write("\t\t\t\t<h1>レジー商品選択</h1>\n");
      out.write("\t\t\t");

				int i=-1;
				for(ProductBean pb:pbList){
					i++;
			
      out.write("\n");
      out.write("\t\t\t\t<!-- 一つの区切り -->\n");
      out.write("\t\t\t\t<div class=\"goods\" id=\"");
      out.print( i );
      out.write("\">\n");
      out.write("\t\t\t\t\t<div class=\"close target\">x</div>\n");
      out.write("\t\t\t\t\t<div class=\"target dummy\">\n");
      out.write("\t\t\t\t\t\t<div class=\"goodsName\" id=\"");
      out.print( pb.getCode() );
      out.write("\" >\n");
      out.write("\t\t\t\t\t\t\t");
      out.print( pb.getName() );
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"count\">0</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- =========== -->\n");
      out.write("\t\t\t\t");
 } 
      out.write("\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t\t<section id=\"cart\">\n");
      out.write("\t\t\t\t<h1>カート</h1>\n");
      out.write("\t\t\t\t<div id=\"cartList\">\n");
      out.write("\t\t\t\t\t<table class=\"Table1\" width=\"100%\">\n");
      out.write("\t\t\t\t\t\t<tr id=\"cartMidashi\">\n");
      out.write("\t\t\t\t\t\t\t<th>商品名</th>\n");
      out.write("\t\t\t\t\t\t\t<th>単価</th>\n");
      out.write("\t\t\t\t\t\t\t<th>個数</th>\n");
      out.write("\t\t\t\t\t\t\t<th>小計</th>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"buttonArea\" class=\"target\">会計へ</div>\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t</section>\n");
      out.write("\t\t<footer>\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\t<small>Copyright&copy; 2013 Kill_In_Sun All rights reserved</small>\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t</footer>\n");
      out.write("\n");
      out.write("\t\t<div id=\"accountingPage\">\n");
      out.write("\t\t\t<div id=\"backButton\" class=\"target\">→</div>\n");
      out.write("\t\t\t<div id=\"accountingTable\">\n");
      out.write("\t\t\t\t<div id=\"toOverflow\">\n");
      out.write("\t\t\t\t\t<table id=\"tableBody\" class=\"Table1\">\n");
      out.write("\t\t\t\t\t\t<tr id=\"midashi\">\n");
      out.write("\t\t\t\t\t\t\t<th>商品名</th>\n");
      out.write("\t\t\t\t\t\t\t<th>単価</th>\n");
      out.write("\t\t\t\t\t\t\t<th>個数</th>\n");
      out.write("\t\t\t\t\t\t\t<th>金額</th>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr class=\"common\">\n");
      out.write("\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<table id=\"tableBottom\" class=\"Table1\">\n");
      out.write("\t\t\t\t\t<tr id=\"amount\">\n");
      out.write("\t\t\t\t\t\t<td colspan=\"3\"></td>\n");
      out.write("\t\t\t\t\t\t<td id=\"amountArea\"></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr id=\"inputAmountLuggage\">\n");
      out.write("\t\t\t\t\t\t<td colspan=\"3\">お預かり</td>\n");
      out.write("\t\t\t\t\t\t<td><input type=\"number\" id=\"luggage\" autofocus required></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr id=\"amountLuggage\">\n");
      out.write("\t\t\t\t\t\t<td colspan=\"3\">お預かり</td>\n");
      out.write("\t\t\t\t\t\t<td id=\"amountLuggageArea\"></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr id=\"fishing\">\n");
      out.write("\t\t\t\t\t\t<td colspan=\"3\">お釣り</td>\n");
      out.write("\t\t\t\t\t\t<td id=\"fishingArea\"></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"commitButton\" class=\"target\">確定</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<form action=\"/safna/AccountingServlet\" method=\"POST\" name=\"commitForm\">\n");
      out.write("\t\t<input type=\"hidden\" name=\"hiddenParm\">\n");
      out.write("\t</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
