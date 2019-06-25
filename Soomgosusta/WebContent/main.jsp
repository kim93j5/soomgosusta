<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery.min.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
<!-- <script src="./script/search.js" type="text/javascript"></script> -->
<script src="./script/main.js" type="text/javascript"></script>
<script>

</script>
<title>Main Page</title>
</head>
<body>
	<c:set var='expert' value="${expert}" scope="request"/>
	<c:set var='member' value="${member}" scope="request"/>


		<c:if test="${id != null }">
			<li> ${id}님 환영합니다.  ${login_state} </li>
			
			
			<form action="memberAddInfo.do?member_Id=${id}" method="get">
				<input type="hidden" name="member_Id" value="${id}"/>
				<input type="submit" value="이용자 부가 정보 입력"/>
			</form>	
		</c:if>

		<ul>
		<c:if test="${id != null }">
		</c:if>
		<li><a href = "memberRegisterForm.do">회원가입</a></li>
		<li>
			<div class="select">
    			<select	name="" id="loginState">
    				<option value="member">회원</option>
    				<option value="expert">고수</option>
    			</select>
    			<a id="login" href = "loginAction.do">로그인</a>
    			<a id="loginteg"></a>
			</div>
		</li>		
		<li><a href = "findExpertForm.do">고수찾기</a></li>
		<li><a href = "logout.do">로그아웃</a>
	</ul>

	<!-- ///////////////배너/////////////// -->
	<nav>
	<div>
		<c:choose>
			<c:when test="${id != null && login_state == 'member' }">
				<div class="left_">
					<a href="main.do"> <img
						src="https://dmmj3ljielax6.cloudfront.net/static/img/home/index_soomgo_logo.svg"
						alt="숨고, 숨은고수">
					</a>
					<ul>
						<li><a href=""> <span>보낸 요청</span>
						</a></li>
						<li><a href="memberMyPage.do?member_Id=${id}">프로필 수정</a>
						<li><a href="findExpertForm.do"> <span>고수 찾기</span>
						</a></li>
						<li><a href=""> <span>채팅</span>
						</a></li>
					</ul>
				</div>
				<div class="right_">
					<ul>
						<li><span>${id} 고객님</span></li>
						<li><a href = "logout.do"><span>로그아웃</span></a>
					</ul>
				</div>
			</c:when>
			<c:when test="${id != null && login_state == 'expert' }">
				<div class="left_">
					<a href="main.do"> <img
						src="https://dmmj3ljielax6.cloudfront.net/static/img/home/index_soomgo_logo.svg"
						alt="숨고, 숨은고수">
					</a>
					<ul>
						<li><a href=""> <span>받은 요청</span>
						</a></li>
						<li><a href=""> <span>프로필</span>
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
					<a href="main.do"> <img
						src="https://dmmj3ljielax6.cloudfront.net/static/img/home/index_soomgo_logo.svg"
						alt="숨고, 숨은고수">
					</a>
				</div>
				<div class="right_">
					<ul>
						<li><a href="memberRegisterForm.do"> <span>회원가입</span>
						</a></li>
						<li><a href="login.jsp"> <span>회원 로그인</span>
						</a> <a href="expertLogin.jsp"> <span>고수 로그인</span>
						</a></li>
					</ul>
				</div>
			</c:otherwise>
		</c:choose>
	</div>
	</nav>

	<!-- ///////////////분야 검색창/////////////// -->
	<div>
		<h2>분야 검색 부분</h2>
		<form action="search.do" method="post">
			<input type="text" id="searchKey" name="searchKey" size="50">
			<input type="submit" id="searchSubmit" value="검색">
		</form>
	</div>

	<br>
	<!-- ///////////////대분류/////////////// -->
	<div>
		<a id="lessonList" href="categoryInfo.do?code=L" target="blank">레슨</a>
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
	<div id="superExpert">
	
	</div>
		<footer></footer>
	<div id="superExpert"></div>
</body>
</html>
