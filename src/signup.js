$(document).ready(function (){
	//学年を選択された際、教員だった場合は他の項目を選択不可にする
	$("select#schoolYear").change(function() {
		if($('#schoolYear option:selected').val() == 'T'){
			$('#Department').attr({'disabled':'disabled'});
			$('#Class').attr({'disabled':'disabled'});
		}else{
			$('#Department').removeAttr('disabled');
			$('#Class').removeAttr('disabled');
		}
	});
	
});

