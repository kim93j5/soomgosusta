<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery.min.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
<script src="./script/search.js" type="text/javascript"></script>
<script src="./script/main.js" type="text/javascript"></script>
<script>

</script>
<title>Main Page</title>
</head>
<body>
	<!-- ///////////////배너/////////////// -->
	<ul>
		<li> ${m_id}님 환영합니다. </li>
		<li><a href = "#">회원가입</a></li>
		<li><a href = "#">로그인</a></li>
	</ul>
	
	<!-- ///////////////분야 검색창/////////////// -->
	<div>
		<h2>분야 검색 부분</h2>
  		<form action="search.do" method="post">
<!--  			<input type ="hidden" id = "searchCode" name ="searchCode"> -->
			<input type = "text" id = "searchKey" name="searchKey" size = "50">
			<input type = "submit" id = "searchSubmit" value = "검색">
		</form>
	</div>

 	<!-- 임의 출력부분 (지워야함) -->
	<c:forEach var="listPopular" items="${listPopular}">
		<div>${listPopular.category_Code }
		${listPopular.category_Group }
		${listPopular.category_Image }</div>
	</c:forEach>
	
	<br>
	<!-- ///////////////대분류/////////////// -->
	<div>
		<a href = "#">레슨</a>
		<a href = "#">서비스</a>
	</div>
	<br>

	<!-- ///////////////인기서비스/////////////// -->
	<h3>인기서비스</h3>
	<div id="popularService">
			
	</div>
	<br>
	
	<h2>분야별</h2>
	<h3>악기</h3>
	<div id="categoryLI">

	
	</div>
	
	<h3>학업</h3>
	<div id="categoryLS">

		
	</div>
	
	<h3>슈퍼고수</h3>
	<div id="superExpert">
	
	</div>
</body>
</html>