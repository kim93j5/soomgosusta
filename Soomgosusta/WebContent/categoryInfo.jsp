<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="//code.jquery.com/jquery.min.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
<script src="./script/categoryInfo.js" type="text/javascript"></script>
<title>Insert title here</title>
</head>
<body>
<p>어떤 분야를 찾으시나요?</p>
	<div id="list_Lesson">
		<c:forEach var="listCategory" items="${listCategory}">
			
	
		<div id= "list_LI">
			<c:if test="${listCategory.group2 == '악기'}">
				<a id="select" href="search.do?searchKey=${listCategory.group3}">
						${listCategory.group3}
				</a><br>	
			</c:if>		
		</div>	
		
		<div id="list_LS">
			<c:if test="${listCategory.group2 == '학업'}">
				<a id="select" href="search.do?searchKey=${listCategory.group3}">
						${listCategory.group3}
				</a><br>	
			</c:if>	
		</div>	
		</c:forEach>
	</div>
</body>
</html>