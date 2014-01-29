<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="jp.ac.fjb.safna.bean.NewsBean" %>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<title>ニュース</title>
<meta charset="utf-8">
<link rel="stylesheet" href="/safna/css/main.css" type="text/css">
<link rel="stylesheet" href="/safna/css/news.css" type="text/css">
<link rel="shortcut icon" href="../img/favicon.ico">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"></script>
<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script src="/safna/src/nav.js"></script>
<style type="text/css">
section#main {
	margin: 0 auto;
	margin-bottom: 50px;
	width: 900px;
	height: 100%;
	float: left;
}
</style>
</head>
<body>
<%
	
	ArrayList<NewsBean> newses = (ArrayList<NewsBean>)session.getAttribute("NEWS_DATA");
	
%>
	<!-- header -->
  <div id="container">
	<jsp:include page="..//menu.jsp" />   
    <section id="mainContainer">
      <section id="main">
        <h1>ニュース</h1>
		<%
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
			
		%>
      </section>
      <article>
        <h1>最新のエントリ</h1>
        <ul>
          <%
          	for(NewsBean nb:newses){
          		out.print("<li>"+ nb.getTime() + " " + nb.getTitle() + "</li>");
          	}
          %>
        </ul>
      
      </article>
    </section>
    
    <footer>
      <p><small>Copyright&copy;  2013 Kill_In_Sun All rights reserved</small></p>
    </footer>
  </div>
  </body>
</html>

<%
 session.setAttribute("NEWS_DATA",null);
%>