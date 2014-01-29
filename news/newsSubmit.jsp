<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>ニュース</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="/safna/css/main.css" type="text/css">
    <link rel="stylesheet" href="/safna/css/news.css" type="text/css">
    <link rel="shortcut icon" href="../img/favicon.ico">
    <script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
		<script src="../src/jquery-ui-1.10.3.custom.js"></script>
    <script src="/safna/src/nav.js"></script>
    <script src="/safna/src/news.js"></script>
    <script src="/safna/src/common.js"></script>
  </head>
  <body>
  <div id="container">
	<jsp:include page="..//menu.jsp" />   
    
    <section id="mainContainer">
      <section id="main">
        <h1>新しいニュースの投稿</h1>
        <form name="newsForm" method="POST" action="/safna/NewsSubmitServlet">
          <div id="base">
            <div id="titleBar">
              タイトル：<input type="text" id="title" name="title" size="70" required>
            </div>
            <div id="toolBar">
              <input type="button" value="B" onClick="surroundHTML('b','/b','thisText');">
              <input type="button" value="/" onClick="surroundHTML('i','/i','thisText');">
              <input type="button" value="U" onClick="surroundHTML('u','/u','thisText');">
							文字サイズ:<select onChange="selc(this)">
								<option>1</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
								<option>5</option>
								<option>6</option>
								<option>7</option>
							</select>
              <input type="color" onChange="colorTag(this)" list="colorList" value="#000000" >
							<datalist id="colorList">
								<option value="#ff0000"></option>
								<option value="#00ff00"></option>
								<option value="#0000ff"></option>
								<option value="#00ffff"></option>
								<option value="#ffff00"></option>
								<option value="#ff00ff"></option>
								<option value="#ffffff"></option>
								<option value="#000000"></option>
							</datalist>
              <input type="button" value="Link" onClick="anc();">
            </div>
            <div id="mainBar">
             <textarea id="thisText" name="thisText" cols="65" rows="20" reqired></textarea>
            </div>
            <div id="submitBar">
              <input type="reset" value="リセット">
              <input type="button" value="    投稿    " onClick="showConfirm()">
            </div>
          </div>
				</form>

      </section>
    </section>
    
    <footer>
      <p><small>Copyright&copy;  2013 Kill_In_Sun All rights reserved</small></p>
    </footer>
  </div>
	<div id="confirm">
		<div id="backButton" class="target">
			→
		</div>
		<h1>この内容でよろしいですか？</h1>
		<div class="newsBox">
			<div class="newsInfo">
				<h2 id="inputedTitle"></h2>
				<h3 id="date"></h3>
			</div>
			<div class="newsBody">
				<p>
				</p>
			</div>
		</div>
		<form name="hiddenForm" method="POST" action="/safna/NewsSubmitServlet">
			<input type="hidden" name="hiddenTitle">
			<input type="hidden" name="hiddenBody">
			<input type="submit" value="投稿">
		</form>
	</div>



  </body>
</html>

