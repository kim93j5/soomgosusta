<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="pwUpdate.do" method="post">
		현재 비밀번호 : <input type="text" name="nowPassword" id = "nowPassword">
		변경할 비밀번호 : <input type="text" name="changePassword">
		변경할 비밀번호 확인 : <input type="text" name="changePasswordcheck">
		<input type="submit" value="비밀번호 변경">
		<!-- <input type="submit" value="목록" style="width:50px;" onclick="window.close();opener.parent.location.reload();" /> -->
	</form>
</body>
</html>