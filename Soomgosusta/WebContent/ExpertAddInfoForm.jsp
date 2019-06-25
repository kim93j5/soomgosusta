<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="./script/jquery.js"></script>
<!-- <script type="text/javascript" src="./script/expertAddInfo.js"></script> -->
<title>고수 필수 부가정보 입력</title>
</head>
<body>   
           <!-- //////////////////////////////활동가능 범위  ///////////////////////////////////////-->         
<script type="text/javascript">
$('document').ready(function() {
   var area0 = ["시/도 선택","서울특별시","인천광역시","대전광역시","광주광역시","대구광역시","울산광역시","부산광역시","경기도","강원도","충청북도","충청남도","전라북도","전라남도","경상북도","경상남도","제주도"];
   var area1 = ["강남구","강동구","강북구","강서구","관악구","광진구","구로구","금천구","노원구","도봉구","동대문구","동작구","마포구","서대문구","서초구","성동구","성북구","송파구","양천구","영등포구","용산구","은평구","종로구","중구","중랑구"];
   var area2 = ["계양구","남구","남동구","동구","부평구","서구","연수구","중구","강화군","옹진군"];
   var area3 = ["대덕구","동구","서구","유성구","중구"];
   var area4 = ["광산구","남구","동구",     "북구","서구"];
   var area5 = ["남구","달서구","동구","북구","서구","수성구","중구","달성구"];
   var area6 = ["남구","동구","북구","중구","울주군"];
   var area7 = ["강서구","금정구","남구","동구","동래구","부산진구","북구","사상구","사하구","서구","수영구","연제구","영도구","중구","해운대구","기장군"];
   var area8 = ["고양시","과천시","광명시","광주시","구리시","군포시","김포시","남양주시","동두천시","부천시","성남시","수원시","시흥시","안산시","안성시","안양시","양주시","오산시","용인시","의왕시","의정부시","이천시","파주시","평택시","포천시","하남시","화성시","가평군","양평군","여주군","연천군"];
   var area9 = ["강릉시","동해시","삼척시","속초시","원주시","춘천시","태백시","고성군","양구군","양양군","영월군","인제군","정선군","철원군","평창군","홍천군","화천군","횡성군"];
   var area10 = ["제천시","청주시","충주시","괴산군","단양군","보은군","영동군","옥천군","음성군","증평군","진천군","청원군"];
   var area11 = ["계룡시","공주시","논산시","보령시","서산시","아산시","천안시","금산군","당진군","부여군","서천군","연기군","예산군","청양군","태안군","홍성군"];
   var area12 = ["군산시","김제시","남원시","익산시","전주시","정읍시","고창군","무주군","부안군","순창군","완주군","임실군","장수군","진안군"];
   var area13 = ["광양시","나주시","목포시","순천시","여수시","강진군","고흥군","곡성군","구례군","담양군","무안군","보성군","신안군","영광군","영암군","완도군","장성군","장흥군","진도군","함평군","해남군","화순군"];
   var area14 = ["경산시","경주시","구미시","김천시","문경시","상주시","안동시","영주시","영천시","포항시","고령군","군위군","봉화군","성주군","영덕군","영양군","예천군","울릉군","울진군","의성군","청도군","청송군","칠곡군"];
   var area15 = ["거제시","김해시","마산시","밀양시","사천시","양산시","진주시","진해시","창원시","통영시","거창군","고성군","남해군","산청군","의령군","창녕군","하동군","함안군","함양군","합천군"];
   var area16 = ["서귀포시","제주시","남제주군","북제주군"];

 // 시/도 선택 박스 초기화

   $("select[name^=sido]").each(function() {
     $selsido = $(this);
     $.each(eval(area0), function() {
     $selsido.append("<option value='"+this+"'>"+this+"</option>");
    });
     $selsido.next().append("<option value=''>구/군 선택</option>");
   });

 

 // 시/도 선택시 구/군 설정

   $("select[name^=sido]").change(function() {
       var area = "area"+$("option",$(this)).index($("option:selected",$(this))); // 선택지역의 구군 Array
       var $gugun = $(this).next(); // 선택영역 군구 객체
       $("option",$gugun).remove(); // 구군 초기화

       if(area == "area0")
        $gugun.append("<option value=''>구/군 선택</option>");
       else {
        $.each(eval(area), function() {
         $gugun.append("<option value='"+this+"'>"+this+"</option>");
        });
       }
      });

});



</script>
    
   <form name=form method="post" action="expertAddInfo.do">   
   <!-- ///////////////////////////////대분류 선택 ///////////////////////////////////////-->
      <div id = "first_select">
      <h3>분야를 선택해주세요</h3>
      <c:forEach var="categoryList1" items="${categoryList1 }">
           <input name="category1" type="radio" value="${categoryList1 }">
             ${categoryList1 }
            </c:forEach>
            <br>
            <input name="category1_1" type="radio" value="서비스">서비스
            <br>
            <br>

   <!--    <button type="button" id="next0_1" >다음</button> -->
      </div>
      
      
      <!-- ///////////////////////////////중분류 선택 ///////////////////////////////////////-->      
      <div id = "second_select1">
      <h3>분야를 선택해주세요</h3>
      <c:forEach var="categoryList2" items="${categoryList2 }">
         <input name="category2" type="checkbox" value="${categoryList2 }">
         ${categoryList2 }
         <br>
        </c:forEach>
<!--         <button type="button" id="prev0_2" >이전</button> 
      <button type="button" id="next0_2">다음</button> -->
      </div>
      
      
      <div id = "second_select2">
      <input type = "checkbox" name = "category2" id = "category2" value = "청소">청소<br>
      <input type = "hidden" name = "category2_select" id = "category2_select" value="청소">
      <input type = "checkbox" name = "category2" id = "category2" value = "줄눈시공">줄눈시공<br>
      <input type = "hidden" name = "category2_select" id = "category2_select" value="줄눈시공">
      
<!--         <button type="button" id="prev0_3" >이전</button>       
      <button type="button" id="next0_3" >다음</button> -->
      
      </div>
      
      
      <div id = "third_select1">
      <h3>분야를 선택해주세요</h3>
      <c:forEach var="categoryList3_1" items="${categoryList3_1 }">
         <input name="category3" type="checkbox" value="${categoryList3_1 }">
         ${categoryList3_1 }
         <br>
        </c:forEach>
<!--        <button type="button" id="prev0_4" >이전</button>       
       <button type="button" id="next0_4" >다음</button> -->
      </div>
      
      
      <div id = "third_select2">
      <h3>분야를 선택해주세요</h3>
      <c:forEach var="categoryList3_2" items="${categoryList3_2 }">
         <input name="category3" type="checkbox" value="${categoryList3_2 }">
         ${categoryList3_2 }
         <br>
        </c:forEach>
<!--        <button type="button" id="prev0_5" >이전</button>       
       <button type="button" id="next0_5">다음</button> -->
      </div>
      
      
      
      <!-- //////////////////////////////요일,시간대,시작날짜///////////////////////////////// -->
      <div id="select_Question">
         <c:forEach var="questionList" items="${questionList}">
            <input type="hidden" name="q_Code" value="${questionList.q_Code}">

            <div id="select_Answer" style="display: block;">
               <h3>${questionList.q_Contents }</h3>
               <ul>
                  <c:forEach var="answerList" items="${answerList }">
                     <c:if test="${answerList.q_Code == questionList.q_Code}">
                        <li class="answer"><input type="checkbox" name="a_Code" value="${ answerList.a_Code}">
                           ${answerList.a_Contents }
                        </li>
                     </c:if>
                  </c:forEach>
               </ul>
            </div>
            
         </c:forEach>

      </div>
      
      <!-- ///////////////////////////////지역 선택 /////////////////////////////////////////-->
    
     <div id="select_District">
     <h3>활동가능한 지역을 선택해주세요(최대3개)</h3>
         <div id="district_select1">
            <select name="sido" id="sido"></select>
            <select name="sigungu" id="sigungu"></select>
            <br>
              <button type="button" id="addDistrict1" >지역 선택 추가</button>
         </div>
      
         <div id="district_select2">
            <select name="sido" id="sido"></select>
            <select name="sigungu" id="sigungu"></select>
            <br>
              <button type="button" id="addDistrict2" >지역 선택 추가</button> 
         </div>
      
         <div id="district_select3">
            <select name="sido" id="sido"></select>
            <select name="sigungu" id="sigungu"></select>
            <br>
         </div>
         
          <input type="button" id="prev4" value="이전"> 
         <input type="submit" value="고수 회원가입완료" id="hidden">
     </div>
   </form>

</body>
</html>