$('document').ready(function(){   
   var key = ["가야금", "거문고", "단소", "외국어", "컨설팅", "논술", "편입", "레슨", "악기", "학업"];
   
/*   $('.popularService').slick({
	   
   });*/
   
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
   
   
});