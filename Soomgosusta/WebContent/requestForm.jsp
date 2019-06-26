<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./bootstrap-3.3.2-dist/css/bootstrap.min.css">
<link rel="stylesheet" href="./css/requestForm.css">
<script src="./bootstrap-3.3.2-dist/js/jquery-3.2.1.js"></script>
<script src="./bootstrap-3.3.2-dist/js/bootstrap.min.js"></script>
<script type="text/javascript" src="./script/jquery.js"></script>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="./script/requestForm.js" type="text/javascript"></script>
<title>Insert title here</title>
</head>
<body>
	<header>
		<jsp:include page="header.jsp"></jsp:include>
	</header>
	
	<c:choose>
		<c:when test="${searchCode != null}">
			<div id="container">
				<div id="listForm">
					<form id="form" action="request.do" method="post">
						<input type="hidden" name="m_id" value="${id}"> <input
							type="hidden" name="searchCode" value="${searchCode}">
						<div class="slide">

							<div class="requestList">
								<h1>
									"${searchKey}"<br>고수를 소개받기 위한<br>몇가지 질문에 답해주세요!
								</h1>
								<h5>
									<span>${expertNum}명의 ${searchKey } 고수가 활동 중이에요</span>
								</h5>
								
								<div class="btn">
									<a href="#" class="next">다음</a>
								</div>

							</div>


							<c:forEach var="listQuestion" items="${listQuestion}" varStatus="status">
								<input type="hidden" name="q_Code"
									value="${listQuestion.q_Code}">

								<div class="requestList">
									${status.count/(size+3)*100 }% complete!
									<h3>${listQuestion.q_Contents}</h3>
									<ul>
										<c:forEach var="listAnswer" items="${listAnswer}">
											<c:if test="${listAnswer.q_Code == listQuestion.q_Code }">
												<li class="answer"><input type="checkbox" name="a_Code"
													value="${listAnswer.a_Code}" /> ${listAnswer.a_Contents}</li>
												<br>
											</c:if>
										</c:forEach>
									</ul>
								<div class="btn">
									<a href="#" class="prev">이전</a>&nbsp;&nbsp;	<a href="#" class="next">다음</a>
								</div>
								</div>

							</c:forEach>
							<div class="requestList">
								3개 남았습니다!
								<h3>선호하는 고수 성별이 있나요?</h3>
								<ul>
									<li><input type="radio" name="gen" value="남자">남자</li>
									<br>
									<li><input type="radio" name="gen" value="여자">여자</li>
									<br>
									<li><input type="radio" name="gen" value="무관">무관</li>
								</ul>
								
								<div class="btn">
									<a href="#" class="prev">이전</a>&nbsp;&nbsp;	<a href="#" class="next">다음</a>
								</div>

							</div>

							<div class="requestList">
								2개 남았습니다!
								<h3>선호 지역을 선택하세요</h3>
								<div id="dist1">
									<select name="sido" id="sido1">
									</select> <select name="gugun" id="gugun1">
										<option>군/구 선택</option>
									</select> <br>

								</div>
								<div id="dist2" style="display: none">
									<select name="sido" id="sido2">
									</select> <select name="gugun" id="gugun2">
										<option>군/구 선택</option>
									</select> <br>
								</div>
								<div id="dist3" style="display: none">
									<select name="sido" id="sido3">
									</select> <select name="gugun" id="gugun3">
										<option>군/구 선택</option>
									</select> <br>
								</div>
								<br> <a id="plus" href="">추가 선택</a> <a id="minus" href="">삭제</a>

								<div class="btn">
									<a href="#" class="prev">이전</a>&nbsp;&nbsp;	<a href="#" class="next">다음</a>
								</div>

							</div>

							<div class="requestList">
								마지막 질문입니다!
								<h3>전화번호를 입력하세요</h3>
								<c:if test="${id == null}">
								로그인 후 요청 가능합니다.<br>
									<input type="text" id="telForm" name="phoneNum" size="50"
										disabled>
								</c:if>

								<c:if test="${id != null}">
									<input type="text" id="telForm" name="phoneNum"
										placeholder="전화번호 입력시 요청 가능합니다. (-빼고 입력하세요)" size="50">
								</c:if>

								<c:choose>
									<c:when test="${id != null }">
										<c:if test="${login_state == 'expert' }">
											<div id="submit_btn">
												<h5>회원으로 로그인 시 요청 가능합니다!</h5>
												<input type="submit" id="go" value="매칭요청" disabled>
											</div>
										</c:if>

										<c:if test="${login_state == 'member' }">
											<div id="submit_btn">
												<a href="#" class="prev">이전</a>&nbsp;&nbsp;	<input type="submit" id="go" value="매칭요청">
											</div>
										</c:if>

									</c:when>
									<c:otherwise>
										<h5>로그인 시 요청 가능합니다!</h5>
									</c:otherwise>
								</c:choose>
							</div>
							<br>
						</div>
					</form>
				</div>
			</div>
		</c:when>

		<c:otherwise>
			<h1>검색 결과가 없습니다</h1>
			<a href="main.do">메인으로</a>
		</c:otherwise>
	</c:choose>
</body>
</html>