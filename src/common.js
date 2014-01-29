$(document).ready( function(){
  $('.target').hover(function(){
    $(this).addClass("hover")
  },function(){
    if($(this).hasClass("hover")){
      $(this).removeClass("hover")
    }
  });
  

});
