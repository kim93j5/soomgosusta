<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery.min.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
<script src="./script/requestForm.js" type="text/javascript"></script>
<title>Insert title here</title>
</head>
<body>

	<ul>
		<li>${id}님 환영합니다.</li>
		<li><a href="logout.do">로그아웃</a>
	</ul>

	<c:choose>

		<c:when test="${searchCode != 'null'}">
			<h1>매칭 요청</h1>
			<form action="request.do">
				<div id="listForm">
					<c:forEach var="listQuestion" items="${listQuestion}">
						<input type="hidden" name="m_id" value="${id}">
						<input type="hidden" name="q_Code" value="${listQuestion.q_Code}">
						<input type="hidden" name="searchCode" value="${searchCode}">

						<div id="requestForm" style="display: inline-block">
							<h3>Q: ${listQuestion.q_Contents}</h3>
							<ul>
								<c:forEach var="listAnswer" items="${listAnswer}">
									<c:if test="${listAnswer.q_Code == listQuestion.q_Code }">
										<li class="answer"><input type="checkbox" name="a_Code"
											value="${listAnswer.a_Code}" /> ${listAnswer.a_Contents}</li>
										<br>
									</c:if>
								</c:forEach>
							</ul>
						</div>
					</c:forEach>

					<div id="district_select">
						<h3>선호 지역을 선택하세요</h3>
						<select name="sido" id="sido">
						</select> 
						<select name="gugun" id="gugun">
							<option>군/구 선택</option>
						</select> <br>
					</div>

					<div id="requestForm" class="telForm" style="display: inline-block">
						<h3>전화번호를 입력하세요</h3>
						<c:if test="${id == null}">
								(로그인 후 요청 가능합니다.)<br>
								<input type="text" name="phoneNum" size="50" disabled>
						</c:if>
						
						<c:if test="${id != null}">
							<input type="text" name="phoneNum" size="50">
						</c:if>
						<br>
						<br>
					</div>

				</div>
				<br>

				<div id="button">
					<div id="prev_next_btn">
						<a href="" id="prev">이전</a> <a href="" id="next">다음</a>
					</div>
					<br>
					<input type= "submit">
<!-- 					<div id="submit_btn">
						<input id="submit" type="submit" value="매칭요청" disabled>
					</div> -->
				</div>
			</form>
		</c:when>
		
		
		<c:otherwise>
		
		
			<h1>검색 결과가 없습니다</h1>
		</c:otherwise>
	</c:choose>
</body>
</html>