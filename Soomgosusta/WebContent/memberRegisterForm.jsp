<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<form action="memberRegisterAction.do" method="post">
		아이디	<input type="text" name="member_Id"> <br>
		비밀번호	<input type="text" name="member_Password">	<br>
		이름	<input type="text" name="member_Name"> 			<br>
		전화번호	<input type="text" name="member_Pnum">		<br>
		성별	<input type="text" name="member_Gender">		<br>
		연령대	<input type="text" name="member_Age">		<br>
		<!-- 회원분류 --><input type="hidden" name="member_Divede">	<br>
		<!--프로필사진 -->	<input type="hidden" name="member_Photo">		<br>
			
			<input type="submit" value="가입">
		</form>


</body>
</html>