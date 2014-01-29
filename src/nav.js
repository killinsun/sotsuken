$(function() {
    $('li').has('ul').mouseover(function(){
      $(this).children('ul').show();
      }).mouseout(function(){
      $(this).children('ul').hide();
      });
  });        

function logout() {
	// 「OK」時の処理開始 ＋ 確認ダイアログの表示
	if(window.confirm('ログアウトし、トップページへ戻ります。よろしいですか？')){

		location.href = "/safna/LogoutServlet"; //  LogoutServletの起動

	}
};
