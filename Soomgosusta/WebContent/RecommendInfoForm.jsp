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
   <h3>추천서비스</h3>
	<div id="recommendService">
		<c:forEach var="randomList" items="${randomList }">
			<a href="requestFormAction.do?searchCode=${randomList }" ><img src="./images/${randomList }.jpg">
                  &nbsp;&nbsp;
            </a>      
		</c:forEach>



	</div>

</body>
</html>