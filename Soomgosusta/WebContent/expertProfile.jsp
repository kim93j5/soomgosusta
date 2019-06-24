<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
`<html>

<head>

<meta charset="UTF-8">
<title>Insert title here</title>
<script src="./script/jquery.form.js"></script>
<script src="./script/jquery.js"></script>
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

				<c:set var="epl" value="${epl}" scope="request"/>
			</form>
			
				<c:set var="expert" value="${expert}" scope="request"></c:set>
				<h5>자격증</h5>
				<form id = "licenseForm" action="upload.do" method="post" encType="multipart/form-data">
				 <img id="foo" src="${epl.epl_Photo}" /> <br>
					파일: <input type="file" name="licenseFile" id="license"> 
					<input type="hidden" name="expert_Id" value="${expert.expert_Id}">
					<input type="submit" name="uploadlicense" value="저장"><br>
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
			
			<%-- <c:forEach var="reply" items="${list}">  고수 리뷰 보기
				<div>
					작성자 ${reply.r_writer}
					작성일 ${reply.r_regdate}<br>
		
					내용 ${reply.r_contents}		
				</div>
			</c:forEach> --%>
			
		</c:when>


		<c:when test="${login_state =='member' && login_state == null}">
			<h1>회원 or 비회원</h1>
			
			
			<form action="" method="get">
			<input type="hidden" name="member_Id" value="${member.member_Id}">
			<input type="hidden" name="review_Date">
			<input type="text" name="review_Contents">
			<input type="hidden" name="review_Expert_Id" value="${expert.expert_Id}">
			</form>

			<%-- <c:forEach var="reply" items="${list}">  고수 리뷰 보기
				<div>
					작성자 ${reply.r_writer}
					작성일 ${reply.r_regdate}<br>
		
					내용 ${reply.r_contents}		
				</div>
			</c:forEach> --%>
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