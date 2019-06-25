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
	document.forms.pNumForm.target = "MyPage";
	document.forms.pNumForm.submit();
	self.close();
	}
function nameCheck(){
	var memberName = "<c:out value='${memberMyInfo.m_Name}' />";
	if(memberName!=(document.getElementById('memberNameCheck').value)){
		alert("이름이 일치하지 않습니다");
		self.close();
	}else if(memberName==(document.getElementById('memberNameCheck').value)){
		alert("변경할 전화번호를 입력해주세요");
	}
}
</script>
<body>
	<form name = "pNumForm" action="pNumUpdate.do" method="post">
		이름 : <input type="text" name="memberNameCheck" id = "memberNameCheck"><input type="button" onclick="nameCheck();" value="이름확인"><br>
		변경할 전화번호 : <input type="text" name="changePnum" id="changePnum">
		<input type="button" value="전화번호 변경" onclick = "gosubmit();"> 
	</form>
</body>
</html>

