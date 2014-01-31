package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

 HttpSession s = request.getSession(); 
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>ユーザー登録</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/main.css\" type=\"text/css\">\n");
      out.write("<link rel=\"shortcut icon\" href=\"img/favicon.ico\">\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.9.1.min.js\"></script>\n");
      out.write("<script src=\"src/nav.js\"></script>\n");
      out.write("<script src=\"src/signup.js\"></script>\n");
      out.write("\t<script src=\"/safna/src/jquery.validate.js\"></script>\n");
      out.write("\t<script src=\"/safna/src/jquery.validate.japlugin.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function(){\n");
      out.write("\t\t\tjQuery.validator.addMethod(\n");
      out.write("\t\t\t\t\"customCheckCode\",\n");
      out.write("\t\t\t\t\tfunction(value,element){\n");
      out.write("\t\t\t\t\t\treg = new RegExp(\"^[0-9a-zA-Z]+$\");\n");
      out.write("\t\t\t\t\t\treturn this.optional(element) || reg.test(value);\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\"「半角英数字(a-z,A-Z,0-9)で入力してください.\"\n");
      out.write("\t\t\t);\n");
      out.write("\t\t\t$(\"#userForm\").validate({\n");
      out.write("\t\t\t\t//エラールール\n");
      out.write("\t\t\t\trules:{\n");
      out.write("\t\t\t\t\tcommonName:{\n");
      out.write("\t\t\t\t\t\trequired:true,\n");
      out.write("\t\t\t\t\t\tmaxlength:20\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tdepartId:{\n");
      out.write("\t\t\t\t\t\trequired:true,\n");
      out.write("\t\t\t\t\t\tmaxlength:7,\n");
      out.write("\t\t\t\t\t\tcustomCheckCode: true\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tpassword:{\n");
      out.write("\t\t\t\t\t\trequired:true,\n");
      out.write("\t\t\t\t\t\tcustomCheckCode: true,\n");
      out.write("\t\t\t\t\t\tminlength:6,\n");
      out.write("\t\t\t\t\t\tmaxlength:20\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tpassword2:{\n");
      out.write("\t\t\t\t\t\trequired: true,\n");
      out.write("\t\t\t\t\t\tequalTo:\"#password\",\n");
      out.write("\t\t\t\t\t\tcustomCheckCode: true\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\t//表示メッセージ\n");
      out.write("\t\t\t\tmessages:{\n");
      out.write("\t\t\t\t\tdepartId:{\n");
      out.write("\t\t\t\t\t\trequired:\"IDが入力されていません\",\n");
      out.write("\t\t\t\t\t\tmaxlength:\"IDは7文字までです\"\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tpassword:{\n");
      out.write("\t\t\t\t\t\trequired:\"パスワードが入力されていません\",\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"container\">\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("\t\t<section id=\"mainContainer\">\n");
      out.write("\t\t\t<section id=\"main\">\n");
      out.write("\t\t\t\t<h1>ユーザー登録</h1>\n");
      out.write("\t\t\t\t");

							
							if(s.getAttribute("ERROR") != null){
								out.print("<label class='error'>"+s.getAttribute("ERROR") +"</label>");
							}
				
      out.write("\n");
      out.write("\t\t\t\t<form  id=\"userForm\" action=\"/safna/SignupServlet\" method=\"POST\" >\n");
      out.write("\t\t\t\t\t<table class=\"Table1 signup\" width=\"600px\">\n");
      out.write("\t\t\t\t\t\t<colgroup span=\"1\" class=\"midashi\">\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>名前:</th>\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" name=\"commonName\" autofocus required>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>学籍番号:</th>\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" id=\"departId\" name=\"departId\" required>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>パスワード:</th>\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"password\" name=\"password\" id=\"password\" required>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>（確認):</th>\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"password\" name=\"password2\" required>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr height=\"30px\">\n");
      out.write("\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>生年月日:</th>\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"date\" name=\"birthday\" required>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>学年:</th>\n");
      out.write("\t\t\t\t\t\t\t<td><select name=\"schoolYear\" id=\"schoolYear\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"1\">1</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"2\">2</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"3\">3</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"T\">教員</option>\n");
      out.write("\t\t\t\t\t\t\t</select></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>学科:</th>\n");
      out.write("\t\t\t\t\t\t\t<td><select name=\"Department\" id=\"Department\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"j\">J/情報処理科</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"g\">G/ITエンジニア科</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"n\">N/情報ネットワーク科</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"f\">F/ビジネスライセンス科</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"w\">W/Webクリエイター科</option>\n");
      out.write("\t\t\t\t\t\t\t</select></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>クラス:</th>\n");
      out.write("\t\t\t\t\t\t\t<td><select name=\"Class\" id=\"Class\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"1\">1</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"2\">2</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"3\">3</option>\n");
      out.write("\t\t\t\t\t\t\t</select></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\"><input type=\"submit\" value=\"登録\" id=\"signupSubmit\"></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
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
