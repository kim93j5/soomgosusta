$('document').ready(function() {
	var key = new Array();
	$.ajax({
		url : './script/category.json',
		type : 'get',
		dataType : 'json',
		success : function(data){
			$.each(data, function(index, item){
				key[index]=item.group3;
			});
		}
	});
	
	$("#searchKey").autocomplete({
		source: key
	});
});
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	$("#searchSubmit").click(function(){
		var text = $('#searchKey').val();
		var searchCode= null;
		
		$.ajax({
			url : './script/category.json',
			type : 'get',
			dataType : 'json',
			success : function(data){
				$.each(data, function(index, item){
					if(text == item.group3){
						alert(text);
						alert(item.code);
						$('#searchCode').text(item.code);
						alert($('#searchCode').text());
					}
				});
				//alert(searchCode);
			}
		});
		
		alert(searchCode);
		$.ajax({
			url: "search.do",
			type: "post",
			dataType: "text",
			data: searchCode,

			success: function(data){
				alert('성공');
			}
		});
	});*/
