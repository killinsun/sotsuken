<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="jp.ac.fjb.safna.bean.UserBean" %>
<header>
	<div id="logoBk">
		<a href="/safna/index.jsp"><img
			src="/safna/img/logo.png" alt="ロゴ"></a>
		<img src="/safna/img/fjblogo.png"
			alt="FJBロゴ">
	</div>
	<%
		UserBean loginUser = (UserBean)session.getAttribute("LOGIN_USER");
		String permCode = "4";
		if(loginUser != null){
				out.print("<a href='/safna/UserProfileServlet?type=0'>"+loginUser.getUserName() +"</a>さん");
				out.print("(<a href='/safna/GroupProfileServlet'>" + loginUser.getGroupName() + "</a>でログイン中)");
				out.print("<a href='javascript:void(0)' onclick='logout(); return false;'>ログアウト</a>");
				permCode = loginUser.getPermitCode();
		}else{
	%>
	<!-- float:rightをliに設定しているため、逆順に設定する -->
	<div id="login">
		<form action="/safna/LoginServlet" method="POST">
			<ul>
				<li><input type="submit" value="Login" autofocus tabindex="3"></li>
				<li>Password:<input type="password" name="pass" required autofocus tabindex="2"></li>
				<li>ID:<input type="text" name="id" required autofocus tabindex="1"></li>
			</ul>
			<input type="hidden" name="from" value="0">
		</form>
	</div>
	<% } %>
</header>
<nav>
	<% if(loginUser !=null){ %>
	<ul id="menu">
		<li><a href="/safna/NewsServlet">ニュース</a>
			<% if(permCode.equals("1")){ %>
			<ul>
				<li><a
					href="/safna/news/newsSubmit.jsp">投稿</a></li>
			</ul>
			<% } %>
		</li>

		<li>活動
			<ul>
				<li><a
					href="/safna/activity/photo.jsp">写真</a></li>
				<li><a
					href="/safna/CmViewServlet">CM大会動画</a></li>
				<li><a
					href="/safna/CatchcopyServlet">キャッチコピー</a></li>
			</ul>
		</li>

		<li>会計
			<ul>
				<li><a
					href="/safna/AccountingViewServlet">レジ</a></li>
				<li><a
					href="/safna/RegistViewServlet">商品登録</a></li>
				<li><a
					href="/safna/InventryManagementServlet">在庫管理</a></li>
				<li><a
					href="/safna/AccountingLogServlet">ログ</a></li>
				<li><a
					href="/safna/AccountingChartServlet">チャート</a></li>
				<% if(permCode.equals("1") || permCode.equals("3")){ %>
				<li><a
					href="/safna/accounting/check.jsp">確認</a></li>
				<% } %>
			</ul>
		</li>

		<li>提出
			<ul>
				<% if(!permCode.equals("4")){ %>
				<li><a
					href="/safna/submission/plan.jsp">企画書</a></li>
				<li><a
					href="/safna/submission/estimate.jsp">見積書</a></li>
				<li><a
					href="/safna/submission/income.jsp">損益計算書</a></li>
				<% } %>
				<% if(permCode.equals("1") || permCode.equals("3")){ %>
				<li><a
					href="/safna/submission/check.jsp">確認</a></li>
				<% } %>
			</ul>
		</li>

		<li>設定
			<ul>
				<li><a
					href="/safna/UserProfileServlet?type=0">個人プロファイルの設定</a></li>
				<li><a
					href="/safna/GroupProfileServlet">団体プロファイルの設定</a></li>
				<li><a
					href="/safna/setting/addGroup.jsp">団体の追加</a></li>
				<li><a
					href="/safna/MaintServlet">マスターメンテナンス</a></li>
			</ul>
		</li>
	</ul>
</nav>
<%  } %>
