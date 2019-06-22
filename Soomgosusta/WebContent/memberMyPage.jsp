<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/myPage.css" target="text/css">
<title>Insert title here</title>
</head>
<body>
<form action="imageUpdate.do" method="post" enctype="multipart/form-data">
	<div id="image">
		<c:if test="${memberMyInfo.m_Photo != null }">
			<c:set var="head" value="${fn:substring(memberMyInfo.m_Photo, 0, fn:length(memberMyInfo.m_Photo)-4) }"></c:set>
			<c:set var="pattern" value="${fn:substring(memberMyInfo.m_Photo, fn:length(head) +1, fn:length(memberMyInfo.m_Photo)) }"></c:set>
				<c:choose>
					<c:when test="${pattern == 'jpg' || pattern == 'gif' }">
						<img id="myPageImage" src="upload/${head }_small.${pattern}">
					</c:when>
					<c:otherwise>
						<c:out value="NO IMAGE"></c:out>
					</c:otherwise>
				</c:choose>
				<input type = "file" name="m_Photo">	<input type="submit" value="이미지수정완료"><br>
		</c:if>
	</div>
	<div id="memberInfo">
		<h3>아이디 : ${memberMyInfo.member_Id }</h3>
		<h3>이름 : ${memberMyInfo.m_Name }&nbsp;&nbsp;<a href="nameUpdateForm.do" target="blank">수정</a></h3>
		<h3>비밀번호&nbsp;&nbsp;<a href="pwUpdateForm.do" target="blank">수정</a></h3>
		<h3>전화번호&nbsp;&nbsp;<a href="pNumUpdateForm.do" target="blank">수정</a></h3>
	</div>

</form>
</body>
</html>

<!-- <a href="nameUpdateForm.do" onClick="window.open(this.href, '', 'width=400, height=430'); return false;"> -->