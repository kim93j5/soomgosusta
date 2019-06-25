$('document').ready(function(){
	$(function(){
		$('a').click(function(){
			window.close();
			opener.location.href= this.href;
			
			event.preventDefault();
		});
	});

});