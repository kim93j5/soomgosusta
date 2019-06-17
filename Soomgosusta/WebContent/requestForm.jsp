<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="./script/requestForm.js" type="text/javascript"></script>
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${searchCode != null}">
			<h1>매칭 요청조건 입력 폼</h1>
			<h3>질문</h3>
			<form action ="request.do">
			
				<c:forEach var="listQuestion" items="${listQuestion}">
					<input type="hidden" name="q_Code" value="${listQuestion.question_Code}">
					<div id="requestForm">
						<h3>Q: ${listQuestion.question_Contents }</h3>
						<ul>
							<c:forEach var="listAnswer" items="${listAnswer}">
								<c:if
									test="${listAnswer.question_Code == listQuestion.question_Code }">
									<li class="answer">
										<input type="checkbox" name="a_Code" value="${listAnswer.answer_Code}"/>
											${listAnswer.answer_Content}
									</li>
									<br>
								</c:if>
							</c:forEach>
						</ul>
					</div>
				</c:forEach>
 				<button id="prev">이전</button>
				<button id="next">다음</button>
				<input type="submit">
			</form>
		</c:when>
		<c:otherwise>
			<h1>검색 결과가 없습니다</h1>
		</c:otherwise>
	</c:choose>
</body>
</html>