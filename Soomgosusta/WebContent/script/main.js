$('document').ready(function(){	
	$(function(){
		$('#loginState').click(function() {
			var state= $("#loginState option:selected").val();
			
				if(state == "member"){
					var html = '<a href="'+"login.jsp"+'">로그인회원</a>';
					$('#login').remove(); //login teg delete 
					$('#loginteg *').remove(); 	//delete loginteg first
					$('#loginteg').append(html); //add loginteg html source
					
				}else if(state == "expert"){
					var html = '<a href="'+"expertLogin.jsp"+'">로그인고수</a>';
					$('#login').remove();
					$('#loginteg *').remove();
					$('#loginteg').append(html);
					
				}
				
		})
	})
});
