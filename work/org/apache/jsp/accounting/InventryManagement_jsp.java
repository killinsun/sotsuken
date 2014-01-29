package org.apache.jsp.accounting;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.safna.bean.ProductBean;
import java.util.ArrayList;

public final class InventryManagement_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>在庫管理画面</title>\n");
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
      out.write("\t\t\t\t<h1>在庫管理</h1>\n");
      out.write("\n");
      out.write("\t\t\t\t<table class=\"Table1\" width=\"1000px\">\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th>商品ID</th>\n");
      out.write("\t\t\t\t\t\t<th>商品名</th>\n");
      out.write("\t\t\t\t\t\t<th>カテゴリ</th>\n");
      out.write("\t\t\t\t\t\t<th>原価</th>\n");
      out.write("\t\t\t\t\t\t<th>定価</th>\n");
      out.write("\t\t\t\t\t\t<th>売価</th>\n");
      out.write("\t\t\t\t\t\t<th>現在在庫</th>\n");
      out.write("\t\t\t\t\t\t<th>販売数</th>\n");
      out.write("\t\t\t\t\t\t<th>売上金額</th>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t");

						ArrayList<ProductBean> pbList = (ArrayList)session.getAttribute("PRODUCT_DATA");		
						for(ProductBean pb:pbList){
							out.print("<tr>");
							out.print("<td><a href='/safna/ProductViewServlet?code="+pb.getCode()+"'>"+pb.getCode()+"</a></td>");
							out.print("<td>"+pb.getName()+"</td>");
							out.print("<td>"+pb.getCategory()+"</td>");
							out.print("<td>"+pb.getGenka()+"</td>");
							out.print("<td>"+pb.getTeika()+"</td>");
							out.print("<td>"+pb.getBaika()+"</td>");
							out.print("<td><progress min='0' max='"+pb.getKosu()+"' value='"+pb.getGenzai()+"'></progress>"+pb.getGenzai()+"</td>");
							out.print("<td><progress min='0' max='"+pb.getKosu()+"' value='"+pb.getHanbai()+"'></progress>"+pb.getHanbai()+"</td>");
							out.print("<td>"+pb.getBaika() * pb.getHanbai()+"</td>");
							out.print("</tr>");
						}
					
      out.write("\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\n");
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

	session.setAttribute("PRODUCT_DATA",null);
	session.setAttribute("CATEGORY_DATA",null);

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
