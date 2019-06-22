$('document').ready(function() {
   var key = ['가야금', '거문고', '단소', '외국어', '컨설팅', '논술', '편입'];
   
   $("#searchKey").autocomplete({
      source: key
   });
});
   
