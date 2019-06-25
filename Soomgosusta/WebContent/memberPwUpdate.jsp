<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>
<script type="text/javascript">
function gosubmit(){
	window.opener.name = "MyPage";
	document.forms.passwordForm.target = "MyPage";
	document.forms.passwordForm.submit();
	self.close();
	}
function pwCheck(){
	var memberPassword = "<c:out value='${memberMyInfo.m_Password}' />";
	if(memberPassword!=(document.getElementById('nowPassword').value)){
		alert("비밀번호가 일치하지 않습니다");
		self.close();
	}else if(memberPassword==(document.getElementById('nowPassword').value)){
		alert("변경할 비밀번호를 입력해주세요");
	}
}
</script>
<body>
	<form name="passwordForm" action="pwUpdate.do?member_Id=${memberMyInfo.member_Id }" method="post">
		현재 비밀번호 : <input type="text" name="nowPassword" id = "nowPassword"><input type="button" onclick="pwCheck();" value="비밀번호 확인"><br>
		변경할 비밀번호 : <input type="text" name="changePassword"><br>
		변경할 비밀번호 확인 : <input type="text" name="changePasswordcheck"><br>
		<input type="button" value="비밀번호 변경" onclick = "gosubmit();"> 
		<!-- <input type="submit" value="목록" style="width:50px;" onclick="window.close();opener.parent.location.reload();" /> -->
	</form>
</body>
</html>