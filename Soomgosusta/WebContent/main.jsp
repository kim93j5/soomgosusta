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
	<c:set var='expert' value="${expert}" scope="request"/>
	<ul>

		<c:if test="${id != null }">
			<li> ${id}님 환영합니다.  ${login_state} </li>
			
			
			<form action="expertProfile.do?expert_Id=${expert.expert_Id}" method="get">
				<input type="hidden" name="expert_Id" value="${expert.expert_Id}"/>
				<input type="submit" value="프로필수정"/>
			</form>	
		</c:if>


		<li><a href = "memberRegisterForm.do">회원가입</a></li>
		<li>
			<div class="select">
    			<select	name="" id="loginState">
    				<option value="member">회원</option>
    				<option value="expert">고수</option>
    			</select>
    			<a id="login" href = "#">로그인</a>
    			<a id="loginteg"></a>
			</div>
		</li>		
		<li><a href = "">고수찾기</a></li>
		<li><a href = "logout.do">로그아웃</a>
	</ul>
	
	<!-- ///////////////배너/////////////// -->
	
	<!-- ///////////////분야 검색창/////////////// -->
	<div>
		<h2>분야 검색 부분</h2>
  		<form action="search.do" method="post">
			<input type = "text" id = "searchKey" name="searchKey" size = "50">
			<input type = "submit" id = "searchSubmit" value = "검색">
		</form>
	</div>

	<br>
	<!-- ///////////////대분류/////////////// -->
	<div>
		<a id = "lessonList" href = "categoryInfo.do?code=L" target="blank">레슨</a>
		<a id = "ServiceList" href = "">서비스</a>
	</div>
	<br>

	<!-- ///////////////인기서비스/////////////// -->
	<h3>인기서비스</h3>
	<div id="popularService">
		<c:forEach var="listPopular" items="${listPopular}" begin="1" end="5">
			<a href="search.do?searchKey=${listPopular.group3}">
				<img src="./images/${listPopular.image}">
			</a>	&nbsp;&nbsp;			
		</c:forEach>

	</div>
	<br>
	
	<h2>분야별</h2>
	<h3>악기</h3>
	<div id="categoryLI">
		<c:forEach var="listPopular" items="${listPopular}">
			<c:if test="${listPopular.group2 == '악기'}">
				<a href="search.do?searchKey=${listPopular.group3}">
					<img src="./images/${listPopular.image}">
				</a>	&nbsp;&nbsp;	
			</c:if>		
		</c:forEach>
	
	</div>
	
	<h3>학업</h3>
	<div id="categoryLS">
		<c:forEach var="listPopular" items="${listPopular}">
			<c:if test="${listPopular.group2 == '학업'}">
				<a href="search.do?searchKey=${listPopular.group3}">
					<img src="./images/${listPopular.image}">
				</a>	&nbsp;&nbsp;	
			</c:if>		
		</c:forEach>	
	</div>
	
	<h3>슈퍼고수</h3>
	<div id="superExpert">
	
	</div>
		<footer></footer>
</body>
</html>
