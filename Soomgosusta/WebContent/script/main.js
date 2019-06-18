/*$('document').ready(function(){	
	var cnt_LI=0;
	var cnt_LS=0;
	alert("1");
	$.ajax({
		url : './main.jsp',
		type : 'get',
		dataType : 'json',
		success : function(data){
			$.each(data, function(index, item){
				alert("2");
				if(index < 3) makePopularService(index, item);
				if(cnt_LI < 3) makeLI_Service(index, item);
				if(cnt_LS < 3) makeLS_Service(index, item);
			});
		},
		
	});
	
	//인기서비스 이미지 출력
	var makePopularService= function(index, data){
		var html = '<a href="#"><img src="./images/'+data.image+'"></a>&nbsp;&nbsp;';
		$('#popularService').append(html);
	};

	var makeLI_Service = function(index, data){
		var code= data.code.substring(0,2);
			if(code == "LI"){
				var html = '<a href="#"><img src="./images/'+data.image+'"></a>&nbsp;&nbsp;';
				$('#categoryLI').append(html);
				cnt_LI++;
			}
	};
	
	var makeLS_Service = function(index, data){
		var code= data.code.substring(0,2);
			if(code == "LS"){
				var html = '<a href="#"><img src="./images/'+data.image+'"></a>&nbsp;&nbsp;';
				$('#categoryLS').append(html);
				cnt_LS++;
			}
	};
});*/