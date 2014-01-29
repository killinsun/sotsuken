// 画面読み込み完了時の処理
window.addEventListener("load", function () {
	// プログラムID
	var progId = document.getElementById("progId");

	// フォーム
	var form = document.getElementById("form");

	//「新規登録」ボタンが押されたとき
    document.getElementById("insertButton").addEventListener("click", function () {
    	progId.value = "0";
    	form.submit();
    }, true);

	//「戻る」ボタンが押されたとき
    document.getElementById("backButton").addEventListener("click", function () {
    	progId.value = "1";
    	form.submit();
    }, true);

}, true);
