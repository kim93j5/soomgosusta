<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="//code.jquery.com/jquery.min.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
<script src="./script/findExpertForm.js" type="text/javascript"></script>
<title>Insert title here</title>
</head>
<body>
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
<!-- ////////////////////////////////////////////////////////////////////////////////////////// -->
	<div id="district_select">
		<form action="findExpert.do">
			<h5>우리 지역의 숨은 고수는 누구일까요?</h5>
				<p>지역 선택</p>
				<select name="sido" id="sido">
				</select> 
					
				<select name="gugun" id="gugun" style="display: none">
				</select>
			
				<p>서비스 선택</p>
				<select name="service" id="service">
				</select> 
			
				<select name="serviceInfo" id="serviceInfo" style="display:none">
				</select>
			
			<input type="submit" value="고수 찾기">
		</form>
	</div>

	<br>
	<div id="findExpert">
		<h5>"<strong>${district}</strong>"에서의 "<strong>${category }</strong>" 고수</h5>
		일단 테이블로!!!
		<table border = "1" id="expertInfo">
			<c:forEach var = "listFindInfo" items="${listFindInfo}">
				<tr>
				<td><img src="./images/${listFindInfo.ef_Photo}">&nbsp;&nbsp;</td>
				<td><h4><strong>${listFindInfo.ef_LineLetter }</strong></h4></td>
				<td><h5>${listFindInfo.ef_Id }</h5><h6>(${listFindInfo.ef_District })</h6></td>
				<td><h5>${listFindInfo.ef_Avg_StarPoint }</h5><h6>(총 리뷰 ${listFindInfo.ef_Cnt_Review }개)</h6></td>
				</tr>
	</c:forEach>
	</table>
	</div>
</body>
</html>