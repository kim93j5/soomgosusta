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
	<div id="list_Lesson">
		<c:forEach var="listCategory" items="${listCategory}">
			
	
		<div id= "list_LI">
			<c:if test="${listCategory.group2 == '악기'}">
				<a href="search.do?searchKey=${listCategory.group3}">
						${listCategory.group3}
				</a><br>	
			</c:if>		
		</div>	
		
		<div id="list_LS">
			<c:if test="${listCategory.group2 == '학업'}">
				<a href="search.do?searchKey=${listCategory.group3}">
						${listCategory.group3}
				</a><br>	
			</c:if>	
		</div>	
		</c:forEach>		
	</div>
</body>
</html>