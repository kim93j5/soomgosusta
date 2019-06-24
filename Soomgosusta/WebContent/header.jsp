<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	
</head>
<body>
	<c:set var='expert' value="${expert}" scope="request" />
	<c:set var='member' value="${member}" scope="request" />

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
						<li><a href="logout.do"><span>로그아웃</span></a>
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
						<li><span>${name } 고수님</span></li>
						<li><a href="logout.do"><span>로그아웃</span></a>
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
						<li><a href="memberRegisterForm.do">회원가입</a></li>
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
	<div>
	<form action="expertProfile.do?expert_Id=${expert.expert_Id}" method="get">
		<input type="hidden" name="expert_Id" value="${expert.expert_Id}" /> 
		<input type="submit" value="프로필수정" />
	</form>
	</div>
</nav>
</body>

</html>