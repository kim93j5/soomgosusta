<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Main Page</title>
<link rel="stylesheet" href="./bootstrap-3.3.2-dist/css/bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="./plugIn/slick-master/slick/slick.css"/>
<link rel="stylesheet" type="text/css" href="./plugIn/slick-master/slick/slick-theme.css"/>
<script type="text/javascript" src="./script/jquery.js"></script>
<script type="text/javascript" src="./script/main.js"></script>
<script src="./bootstrap-3.3.2-dist/js/jquery-3.2.1.js"></script>
<script src="./bootstrap-3.3.2-dist/js/bootstrap.min.js"></script>
<script type="text/javascript" src="./plugIn/slick-master/slick/slick.min.js"></script>

</head>
<body>

	<header>
		<jsp:include page="header.jsp"></jsp:include>
	</header>

	<!-- ///////////////분야 검색창/////////////// -->
	<div>
		<h2>숨고가 딱! 맞는 고수를 소개해 드려요</h2>
		<form action="search.do" method="post">
			<input type="text" id="searchKey" name="searchKey" size="50">
			<input type="submit" id="searchSubmit" value="고수찾기">
		</form>
	</div>

	<br>
	<!-- ///////////////대분류/////////////// -->
	<div>
		<a id="lessonList" href="categoryInfo.do?code=L"
			onClick="window.open(this.href, '', 'width=400, height=430'); return false;">레슨</a>
		<a id="ServiceList" href="">서비스</a>
	</div>
	<br>

	<!-- ///////////////인기서비스/////////////// -->
	<h3>인기서비스</h3>
	<div id="popularService" class="slider popularService">
		<c:forEach var="listPopular" items="${listPopular}" begin="1" end="5">
			<div><a href="search.do?searchKey=${listPopular.group3}"> <img
				src="./images/${listPopular.image}">
			</a></div>			
		</c:forEach>

	</div>
	<br>

	<h2>분야별</h2>
	<h3>악기</h3>
	<div id="categoryLI">
		<c:forEach var="listPopular" items="${listPopular}">
			<c:if test="${listPopular.group2 == '악기'}">
				<a href="search.do?searchKey=${listPopular.group3}"> <img
					src="./images/${listPopular.image}">
				</a>	&nbsp;&nbsp;	
			</c:if>
		</c:forEach>

	</div>

	<h3>학업</h3>
	<div id="categoryLS">
		<c:forEach var="listPopular" items="${listPopular}">
			<c:if test="${listPopular.group2 == '학업'}">
				<a href="search.do?searchKey=${listPopular.group3}"> <img
					src="./images/${listPopular.image}">
				</a>	&nbsp;&nbsp;	
			</c:if>
		</c:forEach>
	</div>

	<h3>슈퍼고수</h3>
		<div id="superExpert"></div>

	<div class="row">
		<div class="col-sm-12">
			<h2><span>도움이 필요한 모든 일에 빠르고 정확하게 숨은 고수를 찾아드려요!</span></h2>
		</div>
		
		<div class="col-sm-6">
			이미지 넣기
		</div>
		<div class="col-sm-6">
			<h3>1. 고수를 소개받으세요</h3>
			<p>더이상 시간을 낭비하지 마세요. 필요한 일과 조건만 알려주세요.<br> 그 이후엔 숨고가 딱! 맞는 고수를 무료로 소개해 드릴게요.</p>
			
			<h3>2. 고수를 비교해보세요</h3>
			<p>요청 후 최대 48시간 내로 고수들의 맞춤 견적서를 받아보실 수 있어요.<br> 견적서를 통해 쉽게 고수들을 비교할 수 있어요.</p>
			
			<h3>3. 고수를 선택하세요</h3>
			<p>원하는 조건에 딱! 맞는 고수를 선택하세요. <br> 직접연락을 해 세부 사항을 조율할 수 있어요.</p>
		</div>
	</div>

	<footer>
		<jsp:include page="footer.jsp"></jsp:include>
	</footer>
</body>
</html>
