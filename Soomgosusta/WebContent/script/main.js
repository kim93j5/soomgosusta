
$('document').ready(function(){	
	var key = ["가야금", "거문고", "단소", "외국어", "논술", "편입", "레슨", "악기", "학업", "더블베이스", "바순", "바이올린", "비올라", "컨설팅", "대학입시컨설팅", "유학컨설팅"];
	
	$(function(){
		$('#loginState').click(function() {
			var state = $("#loginState option:selected").val();

			if (state == "member") {
				var html = '<a href="' + "login.jsp" + '">로그인회원</a>';
				$('#login').remove(); //login teg delete 
				$('#loginteg *').remove(); //delete loginteg first
				$('#loginteg').append(html); //add loginteg html source

			} else if (state == "expert") {
				var html = '<a href="' + "expertLogin.jsp" + '">로그인고수</a>';
				$('#login').remove();
				$('#loginteg *').remove();
				$('#loginteg').append(html);

			}

		});
	})
	
	$("#searchKey").autocomplete({
		source: key
	});
	
	$('#profile').click(function(){
		
	});
});
