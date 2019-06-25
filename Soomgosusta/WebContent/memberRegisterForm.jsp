<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function send() {
	var email = document.check.member_Id.value;
	 var regex = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/;
	
	if(check.member_Id.value==""){
		alert("아이디를 입력하지 않았습니다.")
		check.member_Id.focus()
		return false
	}
	if (regex.test(email) === false) {
        alert("잘못된 이메일 형식입니다.");
        document.check.member_Id.value=""
        document.check.member_Id.focus()
        return false;
    }
	 
	if(check.member_Password.value ==""){
		alert("비밀번호를 입력하지 않았습니다.")
		document.check.member_Password.focus()
		return false
	}
	if(check.member_Password.value != check.check_Password.value){
		alert("비밀번호가 일치하지 않습니다.")
		document.check.check_Password.value = ""
		document.check.check_Password.focus()
		return false;
	}
	
	document.check.submit()
}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align="center">

		<form name="check" onsubmit="return send();" action="memberRegisterAction.do" method="post" ">
		아이디	<input type="email" name="member_Id" id="member_Id"> <br>
		비밀번호	<input type="password" name="member_Password" id="member_Password">	<br>
		비밀번호확인 <input type="password" id="check_Password"> <br>
		이름	<input type="text" name="member_Name"> 			<br>
		전화번호	<input type="text" name="member_Pnum">		<br>
		성별	<input type="radio" name="member_Gender" value="남자" checked>남자	
			<input type="radio" name="member_Gender" value="여자" checked>여자	<br>
		연령대	<select name="member_Age">
					<option value="10">10대</option>
					<option value="20">20대</option>
					<option value="30">30대</option>
					<option value="40">40대</option>
					<option value="50">50대</option>
				</select>           <br>
		<!-- 회원분류 --><input type="hidden" name="member_Divede">	<br>
		<!--프로필사진 -->	<input type="hidden" name="member_Photo">		<br>
			
			<input type="submit" value="가입" >
		</form>


</body>
</html>