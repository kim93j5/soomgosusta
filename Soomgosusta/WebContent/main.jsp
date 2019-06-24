<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./bootstrap-3.3.2-dist/css/bootstrap.min.css">
<script src="./bootstrap-3.3.2-dist/js/jquery-3.2.1.js"></script>
<script src="./bootstrap-3.3.2-dist/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery.min.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
<script src="./script/search.js" type="text/javascript"></script>
<script src="./script/main.js" type="text/javascript"></script>
<script>
	
</script>
<title>Main Page</title>
</head>
<body>
	<c:set var='expert' value="${expert}" scope="request" />
	<c:set var='member' value="${member}" scope="request" />

	<form action="expertProfile.do?expert_Id=${expert.expert_Id}" method="get">
		<input type="hidden" name="expert_Id" value="${expert.expert_Id}" /> 
		<input type="submit" value="프로필수정" />
	</form>

	<!-- ///////////////배너/////////////// -->
	<nav class="navbar">
	<div>
		<c:choose>
			<c:when test="${id != null && login_state == 'member' }">
				<div class="left_">

					<ul class="nav navbar-nav">
						<li><a href="main.do"> <img src="https://dmmj3ljielax6.cloudfront.net/static/img/home/index_soomgo_logo.svg" alt="숨고, 숨은고수">
							</a></li>
						<li><a href="requestInfoForm.do"> <span>보낸 요청</span>
						</a></li>
						<li><a href="memberMyPage.do"><span>프로필</span></a>
						<li><a href="findExpertForm.do"> <span>고수 찾기</span>
						</a></li>
						<li><a href=""> <span>채팅</span>
						</a></li>
					</ul>
				</div>
				<div class="collapse navbar-collapse navbar-right navbar-ex1-collapse">
					<ul class="nav navbar-nav">
						<li><span>${id} 고객님</span></li>
						<li><a href="logout.do"><span>로그아웃</span></a></li>
					</ul>


				</div>
			</c:when>
			<c:when test="${id != null && login_state == 'expert' }">

				<div class="left_">
					<ul>
						<li><a href="main.do"> <img src="https://dmmj3ljielax6.cloudfront.net/static/img/home/index_soomgo_logo.svg" alt="숨고, 숨은고수">
							</a></li>
						<li><a href=""> <span>받은 요청</span>
						</a></li>
						<li><a href="expertProfile.do?expert_Id=${id}"> <span>프로필</span>
						</a></li>
						<li><a href=""> <span>일정</span>
						</a></li>
						<li><a href=""> <span>채팅</span>
						</a></li>
					</ul>
				</div>
				<div class="right_">
					<ul>
						<li><span>${id } 고수님</span></li>
						<li><a href = "logout.do"><span>로그아웃</span></a>
					</ul>
				</div>
			</c:when>
			<c:otherwise>
				<div class="left_">
					<ul>
						<li><a href="main.do"> <img src="https://dmmj3ljielax6.cloudfront.net/static/img/home/index_soomgo_logo.svg" alt="숨고, 숨은고수">
							</a></li>
					</ul>
				</div>
				<div class="right_">
					<ul>
						<li><a href="selectDivide.jsp">회원가입</a></li>
						<li>
							<div class="select">
								<select name="" id="loginState">
									<option value="member">회원</option>
									<option value="expert">고수</option>
								</select> <a id="login" href="loginAction.do">로그인</a> <a id="loginteg"></a>
							</div>
						</li>
					</ul>
				</div>
			</c:otherwise>
		</c:choose>
	</div>
	</nav>

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
	<div id="popularService">
		<c:forEach var="listPopular" items="${listPopular}" begin="1" end="5">
			<a href="search.do?searchKey=${listPopular.group3}"> <img
				src="./images/${listPopular.image}">
			</a>	&nbsp;&nbsp;			
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

</body>
</html>
