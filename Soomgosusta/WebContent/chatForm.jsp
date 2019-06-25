<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-3.1.1.js"></script>
<script src="js/chat_ajax.js" type="text/javascript"></script>
</head>
<body>
<header>
	<jsp:include page="header.jsp"></jsp:include>
</header>
<aside>
	<div>
		<div>
		<c:forEach var="chat" items="${chatList }">
			<div>
				<div>${chat.chat_Expert_Id }</div>
				<div>${chat.chat_Contents }</div>
				<div>${chat.chat_Daterecord }</div>		
			</div>
		</c:forEach>
		<div id="output">
		</div>
		</div>
	<div>
		<c:set var="estimate" value="${estimate }"></c:set>
		<ul>
			<li><input type="hidden" id="m_id" name="member_id" value="${estimate.estimate_Member_Id}"/></li>
			<li><input type="hidden" id="e_id" name="expert_id" value="${estimate.estimate_Expert_Id }"></li>
		</ul>
		<div>
			<textarea id="contents" name="contents" placeholder="메세지를 입력해주세요."></textarea><br>	
		</div>
		<div>
			<input type="button" value="전송" id="call"/>
		</div>
		
	</div> 
</div>
</aside>
<footer>
	<jsp:include page="footer.jsp"></jsp:include>
</footer>
</body>
</html>