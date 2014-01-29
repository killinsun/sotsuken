package org.apache.jsp.accounting;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.safna.bean.ProductBean;
import java.util.ArrayList;

public final class regist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\n");
 
	boolean flag;
	String[] inputData = null;
	inputData = (String[])session.getAttribute("INPUT_DATA"); 
	ArrayList<String> cateList= (ArrayList<String>)session.getAttribute("CATEGORY_DATA");
	
      out.write("\r\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title>商品登録画面</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/safna/css/main.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/safna/css/accounting.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"shortcut icon\" href=\"/safna/img/favicon.ico\">\n");
      out.write("    <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js\"></script>\n");
      out.write("\t\t<script src=\"/safna/src/jquery-ui-1.10.3.custom.js\"></script>\n");
      out.write("    <script src=\"/safna/src/jquery.validate.js\"></script>\n");
      out.write("    <script src=\"/safna/src/nav.js\"></script>\n");
      out.write("    <script src=\"/safna/src/common.js\"></script>\n");
      out.write("    <script src=\"/safna/src/accounting.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\tf =0;\n");
      out.write("\t\t\t$(document).ready(function(){\n");
      out.write("\t\t\t\t$(\"#syouhinform\").validate({\n");
      out.write("\t\t\t\t\trules:{\n");
      out.write("\t\t\t\t\t\tsCode:{\n");
      out.write("\t\t\t\t\t\t\trequired:true\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tmessages:{\n");
      out.write("\t\t\t\t\t\tsCode:{\n");
      out.write("\t\t\t\t\t\t\trequired:\"入力してください\"\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("  <style type=\"text/css\">\n");
      out.write("    div#registForm{\n");
      out.write("      margin:0 auto;\n");
      out.write("      width:500px;\n");
      out.write("      height:auto;\n");
      out.write("    }\n");
      out.write("    section#main{\n");
      out.write("      width:800px;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("  <div id=\"container\">\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "..//menu.jsp", out, false);
      out.write("   \n");
      out.write("    <section id=\"mainContainer\">\n");
      out.write("      <section id=\"main\">\n");
      out.write("        <h1>商品登録</h1>\n");
      out.write("        <div id=\"registForm\">\n");
      out.write("          <form name=\"syouhinform\" id=\"syouhinform\" onSubmit=\"if(f==0){return false}\">\n");
      out.write("            <table class=\"Table1 registTable\" width=\"600px\">\n");
      out.write("            <tr>\n");
      out.write("              <th>商品コード:</th>\n");
      out.write("              <td>\n");
      out.write("              \t\t");
 if(inputData!=null){
              			out.print("<input size='30' minlength='1' type='text' id='sCode' name='sCode' autofocus required value='"+ inputData[0] +"'>");
              			}else{
			              out.print("<input size='30' type='text' id='sCode' name='sCode' autofocus required>");
              			}
           			
      out.write("\n");
      out.write("              \t\t</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <th>商品名:</th>\n");
      out.write("              <td>\n");
      out.write("              \t\t");
 if(inputData!=null){
              			out.print("<input size='30' type='text' id='sName' name='sName' autofocus required value='"+ inputData[1] +"'>");
              			}else{
			              out.print("<input size='30' type='text' id='sName' name='sName' autofocus required>");
              			}
           			
      out.write("\n");
      out.write("       \t\t  </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <th>カテゴリ:</th>\n");
      out.write("              <td><select name=\"category\" id=\"category\">\n");
      out.write("              \t\t");

              			int i=0;
              			for(String data:cateList){
              				i++;
              				out.print("<option value='"+i+"'>"+data+"</option>");
              			}
              		
      out.write("\n");
      out.write("                  </select></td>\n");
      out.write("              <td><input type=\"button\" value=\"追加\" onClick=\"showAddCategory()\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <th>原価:</th>\n");
      out.write("              <td>\n");
      out.write("           \t\t");
 if(inputData!=null){
	           			out.print("<input type='number' min='0' max='99999' id='fGenka' value='"+ inputData[3] +"' required>");
           			}else{
	           			out.print("<input type='number' min='0' max='99999' id='fGenka' value='0' required>");
           			}
        			
      out.write("\n");
      out.write("\n");
      out.write("              </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <th>定価:</th>\n");
      out.write("              <td>\n");
      out.write("           \t\t");
 if(inputData!=null){
	           			out.print("<input type='number' min='0' max='99999' id='fTeika' value='"+ inputData[4] +"' required>");
           			}else{
	           			out.print("<input type='number' min='0' max='99999' id='fTeika' value='0' required>");
           			}
        			
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <th>売価:</th>\n");
      out.write("              <td>\n");
      out.write("           \t\t");
 if(inputData!=null){
	           			out.print("<input type='number' min='0' max='99999' id='fBaika' value='"+ inputData[5] +"' required>");
           			}else{
	           			out.print("<input type='number' min='0' max='99999' id='fBaika' value='0' required>");
           			}
        			
      out.write("\n");
      out.write("        \t  </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <th>準備個数:</th>\n");
      out.write("              <td>\n");
      out.write("           \t\t");
 if(inputData!=null){
	           			out.print("<input type='number' min='0' max='99999' id='fKosu' value='"+ inputData[6] +"' required>");
           			}else{
	           			out.print("<input type='number' min='0' max='99999' id='fKosu' value='0' required>");
           			}
        			
      out.write("\n");
      out.write("\n");
      out.write("              </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <td colspan=\"2\"><input type=\"submit\" value=\"登録\" onClick=\"f = 1\"></td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("      ");
 
      	ArrayList<ProductBean> pbList = (ArrayList<ProductBean>)session.getAttribute("PRODUCT_DATA");
      
      out.write("\n");
      out.write("      <article>\n");
      out.write("        <h1>既存の商品</h1>\n");
      out.write("        <ul>\n");
      out.write("          ");

          	if(pbList !=null){
	          	for(ProductBean pb:pbList){
	          		out.print("<li>"+ pb.getName() + "|¥"+ pb.getGenka()+ "|"+pb.getKosu()+"個</li>");
	          	}
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
      out.write("\t<div id=\"confirm\">\n");
      out.write("\t\t<div id=\"backButton\" class=\"target\">\n");
      out.write("\t\t\t→\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<h1>この内容でよろしいですか？</h1>\n");
      out.write("\t\t\t<table class=\"Table1 registTable\" width=\"600px\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th>商品コード</th>\n");
      out.write("\t\t\t\t\t<td id=\"code\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th>商品名</th>\n");
      out.write("\t\t\t\t\t<td id=\"shohinname\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th>カテゴリ</th>\n");
      out.write("\t\t\t\t\t<td id=\"kategori\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th>原価</th>\n");
      out.write("\t\t\t\t\t<td id=\"genka\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th>定価</th>\n");
      out.write("\t\t\t\t\t<td id=\"teika\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th>売価</th>\n");
      out.write("\t\t\t\t\t<td id=\"baika\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th>準備個数</th>\n");
      out.write("\t\t\t\t\t<td id=\"kosuu\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t<form name=\"hiddenForm\" method=\"POST\" action=\"/safna/RegistServlet\">\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"hiddenCode\">\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"hiddenName\">\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"hiddenCategory\">\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"hiddenGenka\">\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"hiddenTeika\">\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"hiddenBaika\">\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"hiddenKosu\">\n");
      out.write("\t\t\t<input type=\"submit\" value=\"投稿\">\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"from\" value=\"regist\">\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div id=\"addCategory\">\n");
      out.write("\t\t<div id=\"backButton2\" class=\"target\">\n");
      out.write("\t\t\t→\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<h1>新規カテゴリーの追加</h1>\n");
      out.write("\t\t<form name=\"hiddenForm2\" method=\"POST\" action=\"/safna/RegistServlet\">\n");
      out.write("\t\t\tカテゴリ名:<input type=\"text\" require name=\"inputCategoryName\">\n");
      out.write("\t\t\t<input type=\"submit\" value=\"追加\">\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"hiddenCode\">\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"hiddenName\">\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"hiddenCategory\">\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"hiddenGenka\">\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"hiddenTeika\">\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"hiddenBaika\">\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"hiddenKosu\">\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"from\" value=\"category\">\n");
      out.write("\t\t</form>\n");
      out.write("\t\t<p>入力されたカテゴリー名は、全団体で共用ができます</p>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");

	session.setAttribute("PRODUCT_DATA",null);
	session.setAttribute("CATEGORY_DATA",null);
	session.setAttribute("INPUT_DATA",null);

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
