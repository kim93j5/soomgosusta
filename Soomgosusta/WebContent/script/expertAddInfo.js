$('document').ready(function() {	
	$(function(){
		$('.next').click(function(event){
			$('.slide').animate({
				marginLeft : parseInt($('.slide').css('marginLeft'))  - 500
			}, 'slow');
			event.preventDefault();
		});
	});
});