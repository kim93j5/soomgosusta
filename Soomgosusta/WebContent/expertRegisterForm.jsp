<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form action="expertRegisterAction.do" method="post">
		아이디	<input type="text" name="expert_Id"> <br>
		비밀번호	<input type="text" name="expert_Password">	<br>
		이름	<input type="text" name="expert_Name"> 			<br>
		성별	<input type="text" name="expert_Gender">		<br>
		전화번호	<input type="text" name="expert_Pnum">		<br>
		연령대	<input type="text" name="expert_Age">		<br>
		<!--프로필사진 -->	<input type="hidden" name="expert_Photo">		<br>
			
			<input type="submit" value="가입">
		</form>
</body>
</html>