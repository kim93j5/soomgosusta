<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="">
	<div>
        ${category_word_last }
	</div>
	<div>
	    ${pastTime1}
	</div>
	<div>
	    ${requestList.r_Status }
	</div>
	<div>
	<!-- 종료시점(요청시간+48시간) -->
	    이 요청서는${endTime}에 만료됩니다
	</div>	
	
</form>

</body>
</html>