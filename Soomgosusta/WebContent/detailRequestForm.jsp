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
    
        Q:활동가능한 지역을 선택해주세요<br>
        A: [${requestList.r_QA_04 }]<p> 
    
        Q:${Q1_contents }<br>
        A:${list_a1 }<p>       
        
        Q:${Q2_contents }<br>
        A:${list_a2 }<p> 
        
        Q:${Q3_contents }<br>
        A:${list_a3 } <p> 
        
        Q:${Q4_contents }<br>
        A:${list_a4 } <p>  
        
        Q:${Q5_contents }<br>
        A: ${list_a5 }<p> 
        
        Q:${Q6_contents }<br>
        A: ${list_a6 }<p> 
        
        Q:${Q7_contents }<br>
        A:${list_a7 } <p> 
        
        Q:${Q8_contents }<br>
        A:${list_a8 } <p> 
        
        Q:${Q9_contents }<br>
        A:${list_a9 } <p> 
        
        Q:${Q10_contents }<br>
        A:${list_a10 } <p> 
        
        Q:${Q11_contents }<br>
        A:${list_a11 } <p> 
        
        Q:${Q12_contents }<br>
        A:${list_a12 } <p> 
        
        Q:${Q13_contents }<br>
        A:${list_a13 } <p> 
        
        Q:${Q14_contents }<br>
        A:${list_a14 } <p> 

    </div>
    <input type="button" value="조건변경 후 재매칭" onclick="location.href = 'requestForm.do?searchCode'">&nbsp;
    <input type="button" value="매칭 근접 고수 추천받기" onclick="location.href = ''">
    
</body>
</html>