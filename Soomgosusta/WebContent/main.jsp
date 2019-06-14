<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- ///////////////배너/////////////// -->
	<ul>
		<li><a href = "#">회원가입</a></li>
		<li><a href = "#">로그인</a></li>
	</ul>
	
	<!-- ///////////////분야 검색창/////////////// -->
	<div>
		<h2>분야 검색 부분</h2>
		<form action = "search.do" method = "post">
			<input type = "text" name = "searchKey" size = "50">
			<input type = "submit" value = "검색">
		</form>
	</div>
	<br>
	<!-- ///////////////대분류/////////////// -->
	<div>
		<a href = "#">레슨</a>
		<a href = "#">서비스</a>
	</div>
	
	<!-- ///////////////인기서비스/////////////// -->
	<div>
	
	</div>
	
	
</body>
</html>