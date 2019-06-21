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
<h1>고수프로필입니당.</h1>
<form>
	<h5>한 줄 소개</h5>

	<cite>aaaaaaaaaaaaaaa 나랏말쌈이 aaaaaaaaaaaaa</cite>

	
	
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

<form>
	<h5>상세소개</h5>
	<textarea rows="10" cols="100"></textarea>
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
///////////////





</body>
</html>