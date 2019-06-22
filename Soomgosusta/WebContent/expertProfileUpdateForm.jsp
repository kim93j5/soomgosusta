<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
상태: ${login_state}<br>
아이디:${id} 

<c:set var='login_state' value="${login_state}"/>
<c:choose>
<c:when test="${login_state != 'member'}">
<h1>고수프로필입니당.</h1>

<form action="expertProfile.do">
	
	<c:set var="expert" value="${expert}" scope="request"></c:set>
	<input type="hidden" name="profile_Expert_Id" value="${expert.expert_Id}">
	<c:set var="expert_Profile" value="{profile}" scope="request"></c:set>
	한줄소개: <input type="text" name="ep_LineLetter">${profille.ep_LineLetter}<br>
	상세소개: <textarea name="ep_DetailLetter" rows="20" cols="100"></textarea>
	<input type="submit" value="저장">
	<h5>${proflie.lineletter}한 줄 소개</h5>

	<cite> 나랏말쌈이</cite>

</form>


<h5>O O O 고수 </h5>
<form action="" method="" encType="multipart/form-data">

<input type="file">

</form>
<form>
<ul>
	<li>이름 <input type="text" name="expert_Name"> </li>
	<li>지역<input type="text" name="expert_Address"> </li>
	<li>고용수 <input type="text" name="expert_CL_Employment"></li>
</ul>
</form>

<article>
<h5>자격증</h5>
<form action="upload.jsp" method="post" encType="multipart/form-data">

	파일: <input type="file" name="file"><br>
		<input type="submit" name="upload"><br>
</form>
<h5>포토폴리오</h5>
<form action="" method="" encType="multipart/form-data">

<input type="file">
</form>
</article>
<form>

<h5>본인인증 여부</h5>
</form>
</c:when>


<c:when test="${login_state =='member' && login_state == null}">
<h1> 회원 or 비회원</h1>
</c:when>
</c:choose>
<c:if test="${login_state != 'member'}">
</c:if>




</body>
</html>