//投稿ボタン---------------
function showConfirm(){
  //既に表示されている場合は反応させない
  if($('#confirm').css('display')=='none'){
    $('#confirm').show('slide',{direction:"right"},500);
    $('#submitBar').hide("drop",{direction:"right"},500);
    
    //入力パラメータをはりつける
    $('#inputedTitle').html($("#title").val());
    txt = $("#thisText").val();
    txt = txt.replace(/\n/g,"<br/>");
    dd = new Date().toLocaleString();
    $('#date').html(dd);
    //正規表現で指定タグ以外のタグはエラーを返すようにする
    //
    //  
    //
    $('.newsBody').html(txt);
    //hidden要素にデータを乗っける
    var form = document.forms[hiddenForm];
    hiddenForm.hiddenTitle.value =$("#title").val();
    hiddenForm.hiddenBody.value =txt;
  }

}  
$(document).ready(function(){
  //戻るボタン---------------
  $('#backButton').click(function(){
    $('#confirm').hide("slide",{direction:"right"},500)
    $('#submitBar').show("drop",{direction:"right"},500);
  });
});



//装飾ボタン群-------------------------------------------------------
function anc(){
 url = window.prompt("リンクを貼るURLを入れてください","http://"); 
 tag = "a href='" + url + "'";
 endTag = "a";
 surroundHTML(tag,endTag,'thisText');
}
function selc(Obj){
  Object_value=Obj.options[Obj.selectedIndex].value;  
    tag = "font size='" + Object_value + "'";
    endTag = "/font";
    surroundHTML(tag,endTag,'thisText');
}

function colorTag(Obj){
  console.log(Obj);
  Object_value=Obj.value;  
  console.log(Obj.value);
    tag = "font color='" + Object_value + "'";
    endTag = "/font";
    surroundHTML(tag,endTag,'thisText');
  
}

  
//タグを挿入する系---------------------------------------------------
//-----------------------------------------------------------------
//-----------------------------------------------------------------
//-----------------------------------------------------------------
function getAreaRange(obj){
  var pos = new Object();

  if (isIE) {
    obj.focus();
    var range = document.selection.createRange();
    var clone = range.duplicate();
     
    clone.moveToElementText(obj);
    clone.setEndPoint( 'EndToEnd', range );
     
    pos.start = clone.text.length - range.text.length;
    pos.end = clone.text.length - range.text.length + range.text.length;
  }
   
  else if(window.getSelection()) {
    pos.start = obj.selectionStart;
    pos.end = obj.selectionEnd;
  }
   
  return pos;
  //  alert(pos.start + "," + pos.end);
}

var isIE = (navigator.appName.toLowerCase().indexOf('internet explorer')+1?1:0);

//-----------------------------------------------------------------
function surroundHTML(tag,endTag, obj) {
  var target = document.getElementById(obj);
  var pos = getAreaRange(target);
   
  var val = target.value;
  var range = val.slice(pos.start, pos.end);
  var beforeNode = val.slice(0, pos.start);
  var afterNode = val.slice(pos.end);
  var insertNode;
   
  if (range || pos.start != pos.end) {
    insertNode = '<' + tag + '>' + range + '<' + endTag + '>';
    target.value = beforeNode + insertNode + afterNode;
  }
   
  else if (pos.start == pos.end) {
    insertNode = '<' + tag + '>' + '<' + endTag + '>';
    target.value = beforeNode + insertNode + afterNode;
  }
}
//-----------------------------------------------------------------
//-----------------------------------------------------------------
//-----------------------------------------------------------------
//-----------------------------------------------------------------
