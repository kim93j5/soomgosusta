<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>

<head>
<c:set var="expert" value="${expert}" scope="request"></c:set>

<meta charset="UTF-8">
<title>Insert title here</title>
<script src="./script/jquery.form.js"></script>
<script src="./script/jquery.js"></script>
</head>
<body>
<header>
	<jsp:include page="header.jsp"></jsp:include>
</header>
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

				<c:set var="epl" value="${epl}" scope="request"/>
			 </form>
			
				<c:set var="expert" value="${expert}" scope="request"></c:set>
				<h5>자격증</h5>
	<%-- 			<form id = "licenseForm2" action="upload.do" method="post" encType="multipart/form-data">
				 	<img id="foo" src="${epl.epl_Photo}" /> <br>
					파일: <input type="file" name="licenseFile" id="license"> 
					<input type="hidden" name="expert_Id" value="${expert.expert_Id}">
			
					<input type="submit" name="uploadlicense" value="저장"><br>
				</form> --%>
				<form id = "licenseForm" action="upload.do" method="post" encType="multipart/form-data">
					파일: <input type="file" name="licenseFile" id="license"> 
					<input type="hidden" name="expert_Id" value="${expert.expert_Id}">
					<input type="submit" name="uploadlicense" value="저장"><br>
					<div>
					<table border="1">
					<tr>
					<td>
					<c:if test="${epl.epl_Photo != null }">
						<c:set var="head" value="${fn:substring(epl.epl_Photo,0, fn:length(epl.epl_Photo)-4) }"></c:set>
						<c:set var="pattern" value="${fn:substring(epl.epl_Photo, fn:length(head) +1, fn:length(epl.epl_Photo)) }"></c:set>
							
						<c:choose>
							<c:when test="${pattern == 'jpg' || pattern == 'gif' }">
								 <img src="upload/${head }.${pattern}" width="400" alt="그림">
							</c:when>
							<c:otherwise>
								<c:out value="NO IMAGE"></c:out>

							</c:otherwise>
						</c:choose>
					</c:if>
					</td>
					<td>
					테이블 테스트
					</td>
					</tr>
					</table>
					</div>
				</form>
				
				/////////////////////////////////////////////////////////////////////////////////////
				<h5>포토폴리오</h5>
				<form action="" method="post" encType="multipart/form-data">
					<img id="poo"src="/images/common/logo_daekyo.png" /> <br>
					파일: <input type="file" name="portfolioFile" id="portfolio"> 
					<input type="hidden" name="expert_Id" value="${expert.expert_Id}">
					<input type="submit" name="uploadPortfolios" value="저장"><br>
				</form>
 		
			<form>

				<h5>본인인증 여부</h5>
			</form>
			
			<form>
			<c:forEach var="review" items="${reviewList}">  
				<div>
					작성자 ${review.member_Id} 별점${review.review_StarPoint}
					작성일 ${review.review_Date}<br>
		 
					내용 ${review.review_Contents}		
				</div>
			</c:forEach> 
			</form>
		</c:when>


		<c:when test="${login_state =='member'}">
			<h1>회원 or 비회원</h1>
			
			
			<form action="insertReview.do" method="post">
			<input type="hidden" name="member_Id" value="${id}">
			글 내용
			<textarea rows="5" cols="30" name="review_Contents"></textarea> <br>
			별점
			<input type="text" name="review_StarPoint">
			<input type="hidden" name="review_Expert_Id" value="${expert.expert_Id}">
			<input type="submit" value="저장">
			</form>
				작성자 ${review.member_Id} 별점${review.review_StarPoint}
					작성일 ${review.review_Date}<br>
		
					내용 ${review.review_Contents}	
			<c:forEach var="review" items="${reviewList}">  
				<div>
					작성자 ${review.member_Id} 별점${review.review_StarPoint}
					작성일 ${review.review_Date}<br>
		
					내용 ${review.review_Contents}		
				</div>
			</c:forEach> 
		</c:when>
		</c:choose>
		<c:if test="${login_state != 'member'}">
		</c:if>

	


	<script type="text/javascript">
        function readURL(input) {
            if (input.files && input.files[0]) {
                var reader = new FileReader();
                reader.onload = function (e) {
                    $('#foo').attr('src', e.target.result);
                }
                reader.readAsDataURL(input.files[0]);
            }
        }

        $("#license").change(function () {
            readURL(this);
        });
        
        function readPortURL(input) {
            if (input.files && input.files[0]) {
                var reader = new FileReader();
                reader.onload = function (e) {
                    $('#poo').attr('src', e.target.result);
                }
                reader.readAsDataURL(input.files[0]);
            }
        }
        
        $("#portfolio").change(function () {
            readPortURL(this);
        });
       
       /*  $(function(){
        	$("#licenseForm").ajaxForm({
            	beforeSubmit: function(data,form,option){
            		
            		return true;
            	},
            	success: funcion(response, status){
            		
            		alert("성공")
            	},
            	error: function(){
            		//에러발생
            	}
            	
            	
            });
        }); */
        
        
        
	</script>
</body>
</html>