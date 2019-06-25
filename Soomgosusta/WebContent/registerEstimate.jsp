<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<header>
	<jsp:include page="header.jsp"></jsp:include>
</header>
<aside>
	<div>
		<div>
			<c:set var="request" value="${request}"></c:set>
			    <h4>${request.member.m_Name }</h4>
			    <h5>${request.category.c_Word }</h5>
			    
				
		
		</div>
		
		<div><h2>견적서 보내기</h2></div>
		<div><p>회원의 요청서를 읽고 고수님의 견적서를 보내주세요.</p></div>
		<div>
			<c:set var="match" value="${match}"></c:set>
				<form action="registerEstimate.do" method="post">
					<input type="hidden" name="seq" value="${match.match_R_Seq }">
					<input type="hidden" name="member_id" value="${match.match_Member_Id }">
					<input type="hidden" name="expert_id" value="${match.match_Expert_Id }">
					<input type="hidden" name="c_code" value="${match.match_C_Code }">
					<select name="e_amountpart">
						<option selected="selected">1시간당</option>
						<option>1일당</option>
						<option>1주일당</option>	
					</select>
					<input type="text" name="e_amount">원<br><br>
					<textarea rows="6" cols="70" name="e_contents" placeholder="메세지를 입력해주세요."></textarea><br>
					<input type="submit" value="견적서 보내기">
				</form>
		</div>
	</div>
</aside>
<footer>
	<jsp:include page="footer.jsp"></jsp:include>
</footer>
</body>
</html>