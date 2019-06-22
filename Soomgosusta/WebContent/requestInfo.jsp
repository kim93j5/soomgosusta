<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="//code.jquery.com/jquery.min.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
<script src="./script/requestForm.js" type="text/javascript"></script>
<title>Insert title here</title>
</head>
<body>
	<c:if test="${req == 'ing' }">
		이미 요청 중입니다. ㅠㅠ
		<a href="#">마이페이지에서 보낸 요청 확인하기</a>
		<a href="main.do">메인으로</a>
		
	</c:if>
	<c:if test="${req == 'notyet' }">
		요청이 완료되었습니다. 최대 48시간 동안 매칭을 진행합니다.
		<a href="#">마이페이지에서 보낸 요청 확인하기</a>
		<a href="main.do">메인으로</a>
	</c:if>
</body>
</html>