<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="./script/jquery.js"></script>
<script type="text/javascript" src="./script/removeRequest.js"></script>
<title>Insert title here</title>
</head>
<body>

		<div id="sendRequestForm">
		<input type="hidden" name="id" value="${id }"> 
			<div>${category_word_last }</div>
			<div>요청시간 : < ${requestTime} ></div>
			<div>
				<c:choose>
					<c:when test="${today>expireTime }">
	                                                    만료된 요청서입니다.
	                </c:when>

				    <c:otherwise>
	                                                     진행중인 요청서입니다.
	                </c:otherwise>

				</c:choose>

			</div>

			<div>
				<!-- 종료시점(요청시간+48시간) -->
				<c:choose>
				  <c:when test="${today>expireTime }">
				        이 요청서는&nbsp;< ${endTime}&nbsp;>&nbsp;에 만료되었습니다.
				  </c:when>
				  <c:otherwise>
				      이 요청서는&nbsp;< ${endTime}&nbsp;>&nbsp;에 만료됩니다.
				  </c:otherwise>
				</c:choose>
				
			</div>
			
			<c:if test="${today>expireTime }">
			<input type="button"value="삭제" id="remove">
			</c:if>
			
			<p>
			 <input type="button" value="요청서보기" onclick="location.href = 'detailRequest.do'">
			 
   <h3>추천서비스</h3>
	<div id="recommendService">
		<c:forEach var="randomList" items="${randomList }">
			<a href="requestForm.do?searchCode=${randomList }" ><img src="./images/${randomList }.jpg">
                  &nbsp;&nbsp;
            </a>      
		</c:forEach>



	</div>
			
			
		</div>

	

</body>
</html>