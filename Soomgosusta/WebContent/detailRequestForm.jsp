<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
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


    <div>
             요청날짜:  ${requestTime }<p> 
             요청분야:  ${category_word_last }<p>
        요청서 상태 :  <c:choose>
               <c:when test="${today>expireTime }">
                                                       만료
                   </c:when>

                <c:otherwise>
                                                        진행중
                   </c:otherwise>

           </c:choose> <p>
           
   만료날짜 : ${endTime }<p>   
    <매칭정보 입력사항 ><p>

        <c:if test="${Q1_contents != 'null' }">
        Q:${Q1_contents }<br>
        A:${list_a1 }<p>       
        </c:if>

        <c:if test="${Q2_contents != 'null' }">
        Q:${Q2_contents }<br>
        A:${list_a2 }<p>       
        </c:if>
                
        <c:if test="${Q3_contents != 'null' }">
        Q:${Q3_contents }<br>
        A:${list_a3 }<p>       
        </c:if>
        
        <c:if test="${Q4_contents != 'null' }">
        Q:${Q4_contents }<br>
        A:${list_a4 }<p>       
        </c:if>
        
        <c:if test="${Q5_contents != 'null' }">
        Q:${Q5_contents }<br>
        A:${list_a5 }<p>       
        </c:if>
        
        <c:if test="${Q6_contents != 'null' }">
        Q:${Q6_contents }<br>
        A:${list_a6 }<p>       
        </c:if>
        
        <c:if test="${Q7_contents != 'null' }">
        Q:${Q7_contents }<br>
        A:${list_a7 }<p>       
        </c:if>
        
        <c:if test="${Q8_contents != 'null' }">
        Q:${Q8_contents }<br>
        A:${list_a8 }<p>       
        </c:if>
        
        <c:if test="${Q9_contents != 'null' }">
        Q:${Q9_contents }<br>
        A:${list_a9 }<p>       
        </c:if>
        
        <c:if test="${Q10_contents != 'null' }">
        Q:${Q10_contents }<br>
        A:${list_a10 }<p>       
        </c:if>
        
        <c:if test="${Q11_contents != 'null' }">
        Q:${Q11_contents }<br>
        A:${list_a11 }<p>       
        </c:if>
        
        <c:if test="${Q12_contents != 'null' }">
        Q:${Q12_contents }<br>
        A:${list_a12 }<p>       
        </c:if>
        
        <c:if test="${Q13_contents != 'null' }">
        Q:${Q13_contents }<br>
        A:${list_a13 }<p>       
        </c:if>
        
        <c:if test="${Q14_contents != 'null' }">
        Q:${Q14_contents }<br>
        A:${list_a14 }<p>       
        </c:if>
        
        <c:if test="${Q15_contents != 'null' }">
        Q:${Q15_contents }<br>
        A:${list_a15 }<p>       
        </c:if>


    </div>
    <input type="button" value="조건변경 후 재매칭" onclick="location.href = 'requestForm.do?searchCode'">&nbsp;
    <input type="button" value="매칭 근접 고수 추천받기" onclick="location.href = ''">
    
</body>
</html>