<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<div>
<h3>보낸 견적</h3><br>
<div>
	<c:forEach var="estimate" items="${estimateList }">
		<form action="chatAction.do" method="post">
		<input type="hidden" name="member_id" value="${estimate.estimate_Member_Id}" >
		<input type="hidden" name="expert_id" value="${estimate.estimate_Expert_Id}" >
		<input type="hidden" name="contents" value="${estimate.e_Contents}" >
		<ul>
			<li>${estimate.member.m_Name }</li>
			<li>${estimate.category.c_Word }</li>
			<li>${estimate.e_Daterecord }</li>
			<li>${estimate.e_Amountpart }</li>
			<li>${estimate.e_Amount }</li>
		</ul>
		<input type="submit" value="메시지 보내기">
		</form>
	</c:forEach>
</div>		
	



</div>
</aside>
<footer>
	<jsp:include page="footer.jsp"></jsp:include>
</footer>
</body>
</html>