package org.apache.jsp.news;

import java.util.ArrayList;

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

import jp.ac.fjb.safna.bean.NewsBean;

public final class news_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>ニュース</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/safna/css/main.css\" type=\"text/css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/safna/css/news.css\" type=\"text/css\">\n");
      out.write("<link rel=\"shortcut icon\" href=\"../img/favicon.ico\">\n");
      out.write("<script\n");
      out.write("\tsrc=\"http://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js\"></script>\n");
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
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");

	
	ArrayList<NewsBean> newses = (ArrayList<NewsBean>)session.getAttribute("NEWS_DATA");
	

      out.write("\r\n");
      out.write("\t<!-- header -->\n");
      out.write("  <div id=\"container\">\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "..//menu.jsp", out, false);
      out.write("   \n");
      out.write("    <section id=\"mainContainer\">\n");
      out.write("      <section id=\"main\">\n");
      out.write("        <h1>ニュース</h1>\n");
      out.write("\t\t");

			for(NewsBean nb:newses){
				out.print("<div class='newsBox'>");
				out.print("<div class='newsInfo'>");
				out.print("<h2>■" + nb.getTitle() + "</h2>");
				out.print("<h3>" + nb.getTime() + "</h3>");
				out.print("</div>");
				out.print("<div class='newsBody'>");
				out.print("<p>");
				out.print(nb.getBody());
				out.print("</p>");
				out.print("</div>");
				out.print("</div>");
			}
			
		
      out.write("\r\n");
      out.write("      </section>\n");
      out.write("      <article>\n");
      out.write("        <h1>最新のエントリ</h1>\n");
      out.write("        <ul>\n");
      out.write("          ");

          	for(NewsBean nb:newses){
          		out.print("<li>"+ nb.getTime() + " " + nb.getTitle() + "</li>");
          	}
          
      out.write("\n");
      out.write("        </ul>\n");
      out.write("      \n");
      out.write("      </article>\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("    <footer>\n");
      out.write("      <p><small>Copyright&copy;  2013 Kill_In_Sun All rights reserved</small></p>\n");
      out.write("    </footer>\n");
      out.write("  </div>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");

 session.setAttribute("NEWS_DATA",null);

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
