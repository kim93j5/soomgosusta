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
<header>
	<jsp:include page="header.jsp"></jsp:include>
</header>
<aside>
	<div class="request_container">
		<c:forEach var="match" items="${matchList }">
		<div>
		<ul>
			<li>${match.member.m_Name }</li>
			<li>${match.category.c_Word }</li>
			<li>${match.m_Daterecord }</li>
		<c:choose>
			<c:when test="${match.m_Status == '11' }">
				<li><p>견적서를 작성하고 회원의 응답을 기다리는 중이에요!</p></li>
			</c:when>
			<c:when test="${match.m_Status == 'ing' }">
				<li><p>요청서를 확인하고 견적서를 작성해주세요!</p></li>
			</c:when>
			<c:otherwise>
			<li>ㅠㅠ</li>
			</c:otherwise>
		</c:choose>
		</ul>
		<c:choose>
			<c:when test="${match.m_Status == '11' }">
				<form action="chatListFormAction.do" method="post">
					<input type="hidden" name="seq" value="${match.match_R_Seq }">
					<input type="hidden" name="id" value="${match.match_Member_Id }">
					<input type="hidden" name="code" value="${match.match_C_Code }">
					<input type="hidden" name="e_id" value=${match.match_Expert_Id }">
					<input type="submit" value="견적서 확인">
				</form>
			</c:when>
				<c:when test="${match.m_Status == 'ing' }">
				<form action="registerEstimateForm.do" method="post">
					<input type="hidden" name="seq" value="${match.match_R_Seq }">
					<input type="hidden" name="id" value="${match.match_Member_Id }">
					<input type="hidden" name="code" value="${match.match_C_Code }">
					<input type="hidden" name="e_id" value="${match.match_Expert_Id }">
					<input type="submit" value="견적서 작성">
				</form>
			</c:when>
			<c:otherwise>
			<li>ㅠㅠ</li>
			</c:otherwise>
		</c:choose>
		</div>
		</c:forEach>

	</div>	
</aside>
<footer>
	<jsp:include page="footer.jsp"></jsp:include>
</footer>
</body>
</html>