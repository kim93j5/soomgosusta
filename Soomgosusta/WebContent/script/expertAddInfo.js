$('document').ready(function() {

	$('#second_select1').css('display', 'none');
	$('#second_select2').css('display', 'none');
	$('#third_select1').css('display', 'none');
	$('#third_select2').css('display', 'none');
	$('#select_Day').css('display', 'none');
	$('#select_Time').css('display', 'none');
	$('#select_StartDay').css('display', 'none');
	$('#select_District').css('display', 'none');
	$('#hidden').css('display', 'none');

     	$('#next0_1').click(function() {
		$('#first_select').css('display', 'none');
		$('#second_select1').css('display', 'block');
		$('#second_select2').css('display', 'none');
		$('#third_select1').css('display', 'none');
		$('#third_select2').css('display', 'none');
		$('#select_Time').css('display', 'none');
		$('#select_Day').css('display', 'none');
		$('#select_StartDay').css('display', 'none');
		$('#select_District').css('display', 'none');
		$('#hidden').css('display', 'none');
	})

	$('#next0_2').click(function() {
		$('#first_select').css('display', 'none');
		$('#second_select1').css('display', 'none');
		$('#second_select2').css('display', 'none');
		$('#third_select1').css('display', 'block');
		$('#third_select2').css('display', 'block');
		$('#select_Time').css('display', 'none');
		$('#select_Day').css('display', 'none');
		$('#select_StartDay').css('display', 'none');
		$('#select_District').css('display', 'none');
		$('#hidden').css('display', 'none');
	})

	$('#next0_5').click(function() {
		$('#first_select').css('display', 'none');
		$('#second_select1').css('display', 'none');
		$('#second_select2').css('display', 'none');
		$('#third_select1').css('display', 'none');
		$('#third_select2').css('display', 'none');
		$('#select_Time').css('display', 'none');
		$('#select_Day').css('display', 'block');
		$('#select_StartDay').css('display', 'none');
		$('#select_District').css('display', 'none');
		$('#hidden').css('display', 'none');
	})

	$('#next1').click(function() {
		$('#first_select').css('display', 'none');
		$('#second_select1').css('display', 'none');
		$('#second_select2').css('display', 'none');
		$('#third_select1').css('display', 'none');
		$('#third_select2').css('display', 'none');
		$('#select_Time').css('display', 'block');
		$('#select_Day').css('display', 'none');
		$('#select_StartDay').css('display', 'none');
		$('#select_District').css('display', 'none');
		$('#hidden').css('display', 'none');
	})

	$('#next2').click(function() {
		$('#first_select').css('display', 'none');
		$('#second_select1').css('display', 'none');
		$('#second_select2').css('display', 'none');
		$('#third_select1').css('display', 'none');
		$('#third_select2').css('display', 'none');
		$('#select_Time').css('display', 'none');
		$('#select_Day').css('display', 'none');
		$('#select_StartDay').css('display', 'block');
		$('#select_District').css('display', 'none');
		$('#hidden').css('display', 'none');
	})

	$('#next3').click(function() {
		$('#first_select').css('display', 'none');
		$('#second_select1').css('display', 'none');
		$('#second_select2').css('display', 'none');
		$('#third_select1').css('display', 'none');
		$('#third_select2').css('display', 'none');
		$('#select_Time').css('display', 'none');
		$('#select_Day').css('display', 'none');
		$('#select_StartDay').css('display', 'none');
		$('#select_District').css('display', 'block');
		$('#hidden').css('display', 'block');
	})

	// ///////////////////이전버튼///////////////
	$('#prev2').click(function() {
		$('#select_Time').css('display', 'none');
		$('#select_Day').css('display', 'block');
		$('#select_StartDay').css('display', 'none');
		$('#select_District').css('display', 'none');
		$('#hidden').css('display', 'block');
		$('#prev1').css('display', 'none');
		$('#hidden').css('display', 'none');
	})
	$('#prev3').click(function() {
		$('#select_Time').css('display', 'block');
		$('#select_Day').css('display', 'none');
		$('#select_StartDay').css('display', 'none');
		$('#select_District').css('display', 'none');
		$('#hidden').css('display', 'none');
	})
	$('#prev4').click(function() {
		$('#select_Time').css('display', 'none');
		$('#select_Day').css('display', 'none');
		$('#select_StartDay').css('display', 'block');
		$('#select_District').css('display', 'none');
		$('#hidden').css('display', 'none');
	})
	
	
	//////////////지역추가버튼///////////////////////
	$('#district_select2').css('display', 'none')
	$('#district_select3').css('display', 'none');
	$('#addDistrict1').click(function(){
		$('#district_select2').css('display', 'block');
	})
	
	$('#addDistrict2').click(function(){
	$('#district_select3').css('display', 'block');
	})
	

});
