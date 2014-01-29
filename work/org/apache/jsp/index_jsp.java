package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.safna.bean.UserBean;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>safna</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/main.css\" type=\"text/css\">\n");
      out.write("<link rel=\"shortcut icon\" href=\"img/favicon.ico\">\n");
      out.write("<script\n");
      out.write("\tsrc=\"http://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js\"></script>\n");
      out.write("<script src=\"src/nav.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!-- header -->\n");
      out.write("\t<div id=\"container\">\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/menu.jsp", out, false);
      out.write("\n");
      out.write("\t\t<section id=\"mainContainer\">\n");
      out.write("\t\t\t<img src=\"img/biglogo.png\" alt=\"拡大ロゴ\" id=\"biglogo\">\n");
      out.write("\t\t\t");

				UserBean loginUser = (UserBean) session.getAttribute("LOGIN_USER");
				if (loginUser != null) {
					String username = loginUser.getUserName();
			
      out.write("\n");
      out.write("\t\t\t<div id=\"mainInfo\">\n");
      out.write("\t\t\t\t<h1>\n");
      out.write("\t\t\t\t\tようこそ！");
      out.print(username);
      out.write("さん！\n");
      out.write("\t\t\t\t</h1>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\tsafnaを使って最高の学園祭を創り上げましょう。<br />\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t");

				} else {
			
      out.write("\n");
      out.write("\t\t\t<div id=\"mainLoginForm\">\n");
      out.write("\t\t\t\t<form method=\"POST\" action=/safna/LoginServlet\">\n");
      out.write("\t\t\t\t\tID<br /> <input type=\"text\" id=\"id\" required pattern=\"[a-z][A-Z]\"><br />\n");
      out.write("\t\t\t\t\tPassword<br /> <input type=\"password\" id=\"password\" required pattern=\"[a-z][A-Z]\"><br />\n");
      out.write("\t\t\t\t\t<p class=\"error\">\n");
      out.write("\t\t\t\t\t\t");

							String errormessage = (String) session.getAttribute("ERROR_LOGIN");
							if(errormessage != null){
									out.print(errormessage);
							}
						
      out.write("\n");
      out.write("\t\t\t\t\t</p><br />\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"Login\">\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t\t<p id=\"signuparea\">\n");
      out.write("\t\t\t\t\t<a href=\"/safna/signup.jsp\">ユーザー登録</a>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t");

				}
			
      out.write("\n");
      out.write("\t\t\t<section id=\"main\">\n");
      out.write("\t\t\t\t<h1>safnaとは</h1>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\tsafnaは、アイスランド語で「集まる/集める」という意味があります。<br />\n");
      out.write("\t\t\t\t\t今までバラバラだった船橋情報ビジネス専門学校の若幸祭での活動を、一つに集め、<br />\n");
      out.write("\t\t\t\t\tお客さんも集めようという願いが込められています。\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t\t");

					if (loginUser != null) {
					} else {
				
      out.write("\n");
      out.write("\t\t\t\t<h1>ユーザー登録</h1>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<a href=\"/safna/signup.jsp\">こちらから</a>ユーザー登録を行ってください。<br />\n");
      out.write("\t\t\t\t\tすぐにsafnaの魅力を体験できます。\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t\t");

					}
				
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
