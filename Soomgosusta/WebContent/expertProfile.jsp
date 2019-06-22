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
	상태: ${login_state} (확인용)
	<br> 아이디:${id}	(확인용)

	<c:set var='login_state' value="${login_state}" />
	<c:choose>
		<c:when test="${login_state != 'member'}">
			<h1>고수프로필입니당.</h1>

			<form action="expertDetailProfileAction.do" method="post">

				<c:set var="expert" value="${expert}" scope="request"></c:set>

				<h5>${expert.e_Name}고수</h5>
				<ul>
					<li> 이름: ${expert.e_Name} </li>
					<li> 지역: </li>
					<li> 고용수: </li>
				</ul>

				<input type="hidden" name="profile_Expert_Id" value="${expert.expert_Id}"> 
				<input type="hidden" name="expert_Id" value="${expert.expert_Id}">

				<c:set var="profile" value="${profile}" scope="request"></c:set>

				<h2>한줄소개</h2>
				<textarea rows="5" cols="100" name="한줄소개"> ${profile.ep_LineLetter} </textarea>
				<br>
				<h2>상세소개</h2>
				<textarea rows="10" cols="100">${profile.ep_DetailLetter} </textarea>
				<br>


			</form>
			<article>
				<h5>자격증</h5>
				<form action="upload.jsp" method="post"
					encType="multipart/form-data">

					파일: <input type="file" name="file"><br> <input
						type="submit" name="upload"><br>
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
			<h1>회원 or 비회원</h1>
		</c:when>
	</c:choose>
	<c:if test="${login_state != 'member'}">
	</c:if>




</body>
</html>