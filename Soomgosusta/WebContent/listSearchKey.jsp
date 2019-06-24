<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
//script쓰게될때 옮겨!!!!
window.opener.close();
</script>
</head>
<body>
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

	<h2>다음 서비스를 찾고 있나요?</h2>
	<ul>
	<c:forEach var = "list" items="${listSearchKey}">
		<li>
		<a href= "search.do?searchKey=${list.group3 }">${list.group3}</a>
		</li>
	</c:forEach>
	</ul>
</body>
</html>