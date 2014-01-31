package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.ac.fjb.safna.bean.UserBean;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<header>\n");
      out.write("\t<div id=\"logoBk\">\n");
      out.write("\t\t<a href=\"/safna/index.jsp\"><img\n");
      out.write("\t\t\tsrc=\"/safna/img/logo.png\" alt=\"ロゴ\"></a>\n");
      out.write("\t\t<img src=\"/safna/img/fjblogo.png\"\n");
      out.write("\t\t\talt=\"FJBロゴ\">\n");
      out.write("\t</div>\n");
      out.write("\t");

		UserBean loginUser = (UserBean)session.getAttribute("LOGIN_USER");
		String permCode = "4";
		if(loginUser != null){
				out.print("<a href='/safna/UserProfileServlet?type=0'>"+loginUser.getUserName() +"</a>さん");
				out.print("(<a href='/safna/GroupProfileServlet'>" + loginUser.getGroupName() + "</a>でログイン中)");
				out.print("<a href='javascript:void(0)' onclick='logout(); return false;'>ログアウト</a>");
				permCode = loginUser.getPermitCode();
		}else{
	
      out.write("\r\n");
      out.write("\t<!-- float:rightをliに設定しているため、逆順に設定する -->\n");
      out.write("\t<div id=\"login\">\n");
      out.write("\t\t<form action=\"/safna/LoginServlet\" method=\"POST\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><input type=\"submit\" value=\"Login\" autofocus tabindex=\"3\"></li>\n");
      out.write("\t\t\t\t<li>Password:<input type=\"password\" name=\"pass\" required autofocus tabindex=\"2\"></li>\n");
      out.write("\t\t\t\t<li>ID:<input type=\"text\" name=\"id\" required autofocus tabindex=\"1\"></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\t");
 } 
      out.write("\n");
      out.write("</header>\n");
      out.write("<nav>\n");
      out.write("\t");
 if(loginUser !=null){ 
      out.write("\n");
      out.write("\t<ul id=\"menu\">\n");
      out.write("\t\t<li><a href=\"/safna/NewsServlet\">ニュース</a>\n");
      out.write("\t\t\t");
 if(permCode.equals("1")){ 
      out.write("\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a\n");
      out.write("\t\t\t\t\thref=\"/safna/news/newsSubmit.jsp\">投稿</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t");
 } 
      out.write("\n");
      out.write("\t\t</li>\n");
      out.write("\n");
      out.write("\t\t<li>活動\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a\n");
      out.write("\t\t\t\t\thref=\"/safna/activity/photo.jsp\">写真</a></li>\n");
      out.write("\t\t\t\t<li><a\n");
      out.write("\t\t\t\t\thref=\"/safna/CmViewServlet\">CM大会動画</a></li>\n");
      out.write("\t\t\t\t<li><a\n");
      out.write("\t\t\t\t\thref=\"/safna/CatchcopyServlet\">キャッチコピー</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</li>\n");
      out.write("\n");
      out.write("\t\t<li>会計\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a\n");
      out.write("\t\t\t\t\thref=\"/safna/AccountingViewServlet\">レジ</a></li>\n");
      out.write("\t\t\t\t<li><a\n");
      out.write("\t\t\t\t\thref=\"/safna/RegistViewServlet\">商品登録</a></li>\n");
      out.write("\t\t\t\t<li><a\n");
      out.write("\t\t\t\t\thref=\"/safna/InventryManagementServlet\">在庫管理</a></li>\n");
      out.write("\t\t\t\t<li><a\n");
      out.write("\t\t\t\t\thref=\"/safna/AccountingLogServlet\">ログ</a></li>\n");
      out.write("\t\t\t\t<li><a\n");
      out.write("\t\t\t\t\thref=\"/safna/AccountingChartServlet\">チャート</a></li>\n");
      out.write("\t\t\t\t");
 if(permCode.equals("1") || permCode.equals("3")){ 
      out.write("\n");
      out.write("\t\t\t\t<li><a\n");
      out.write("\t\t\t\t\thref=\"/safna/accounting/check.jsp\">確認</a></li>\n");
      out.write("\t\t\t\t");
 } 
      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</li>\n");
      out.write("\n");
      out.write("\t\t<li>提出\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t");
 if(!permCode.equals("4")){ 
      out.write("\n");
      out.write("\t\t\t\t<li><a\n");
      out.write("\t\t\t\t\thref=\"/safna/submission/plan.jsp\">企画書</a></li>\n");
      out.write("\t\t\t\t<li><a\n");
      out.write("\t\t\t\t\thref=\"/safna/submission/estimate.jsp\">見積書</a></li>\n");
      out.write("\t\t\t\t<li><a\n");
      out.write("\t\t\t\t\thref=\"/safna/submission/income.jsp\">損益計算書</a></li>\n");
      out.write("\t\t\t\t");
 } 
      out.write("\n");
      out.write("\t\t\t\t");
 if(permCode.equals("1") || permCode.equals("3")){ 
      out.write("\n");
      out.write("\t\t\t\t<li><a\n");
      out.write("\t\t\t\t\thref=\"/safna/submission/check.jsp\">確認</a></li>\n");
      out.write("\t\t\t\t");
 } 
      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</li>\n");
      out.write("\n");
      out.write("\t\t<li>設定\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a\n");
      out.write("\t\t\t\t\thref=\"/safna/UserProfileServlet?type=0\">個人プロファイルの設定</a></li>\n");
      out.write("\t\t\t\t<li><a\n");
      out.write("\t\t\t\t\thref=\"/safna/GroupProfileServlet\">団体プロファイルの設定</a></li>\n");
      out.write("\t\t\t\t<li><a\n");
      out.write("\t\t\t\t\thref=\"/safna/setting/addGroup.jsp\">団体の追加</a></li>\n");
      out.write("\t\t\t\t<li><a\n");
      out.write("\t\t\t\t\thref=\"/safna/MaintServlet\">マスターメンテナンス</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</li>\n");
      out.write("\t</ul>\n");
      out.write("</nav>\n");
  } 
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
