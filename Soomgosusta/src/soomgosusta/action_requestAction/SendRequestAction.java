package soomgosusta.action_requestAction;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Category;
import soomgosusta.domain.Member_Information;
import soomgosusta.domain.Request;
import soomgosusta.domain.RequestForm;
import soomgosusta.service.ExpertService;
import soomgosusta.service.MemberService;
import soomgosusta.service.RequestService;

public class SendRequestAction implements Action {

   public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
         RequestService service = RequestService.getInstance();
         ExpertService ex_service = ExpertService.getInstance();
         MemberService m_service = MemberService.getInstance();
         ActionForward forward = new ActionForward();
         
         request.setCharacterEncoding("utf-8");
         List<Request> requestList = service.sendRequestService(request);
         //request.setAttribute("requestList", requestList);
         List<RequestForm> formList = new ArrayList<RequestForm>();
         request.setAttribute("size", formList.size());
         
         List<Category> categoryList = ex_service.categoryListService(request);
         //System.out.println(categoryList);
           String category_word ="";
           String[] category_word_split = new String[20];
           String category_word_last = "";
      
      for(int a=0; a < requestList.size(); a++){     
          RequestForm form = new RequestForm();
         for(int i=0; i < categoryList.size(); i++){
           if(categoryList.get(i).getC_Code().equals(requestList.get(a).getRequest_C_Code())){
              category_word = categoryList.get(i).getC_Word();
           }
         }
         
         category_word_split = category_word.split("/");
         category_word_last = category_word_split[2]+ "ㅤ"+ category_word_split[0];
          

/*         request.setAttribute("category_word_last", category_word_last);*/
         //System.out.println(category_word_last);
         form.setCategory(category_word_last);
         /////////////////////////////////요청시간,만료시간//////////////////////////////////
      
            Date requestDateStr = requestList.get(a).getR_DateRecord();
            Date nowDate = new Date(); //현재 시간
            
            //System.out.println(requestDateStr);
            //System.out.println(nowDate);
            
            String requestTime = null;
            String endTime = null;
            
            SimpleDateFormat df = new SimpleDateFormat("YYYY년MM월dd일HH시mm분", Locale.KOREA);
            Calendar cal = Calendar.getInstance();
            Calendar cal2 = Calendar.getInstance();
            cal.setTime(requestDateStr);
            cal.add(Calendar.DATE, +2);
            endTime = df.format(cal.getTime());
            form.setEnd_Time(endTime);
            
            cal2.setTime(requestDateStr);
            cal2.add(Calendar.DATE, 0);
            requestTime = df.format(cal2.getTime());
            
  
            form.setRequest_Time(requestTime);

            form.setSeq(requestList.get(a).getR_Seq());
            //만료 시간 지난 요청서 진행상태 ing->done으로 변경
            
            SimpleDateFormat df1 = new SimpleDateFormat("YYYYMMddHHmm", Locale.KOREA);
            long today = (long)Double.parseDouble(df1.format(nowDate));
            //System.out.println(today);
            
            String expireTime_num = endTime.replaceAll("[^0-9]", "");
            //System.out.println(expireTime);
            long expireTime = (long)Double.parseDouble(expireTime_num);
            //System.out.println(expireTime);
            form.setExpire_Time(expireTime);
            request.setAttribute("today", today);
            formList.add(form);
//            request.setAttribute("expireTime", expireTime);
           
      }
   
   ///////////////////////////////////////////////////////////////////////////////////////        
   ////////////////////////////////////추천서비스////////////////////////////////////////////
   //////////////////////////////////////////////////////////////////////////////////////
      
            Member_Information recommendCode = m_service.recommendInfoService(request);
         /////////////////// 카테고리 테이블에서 분야코드, 이미지 가져옴/////////////////
         List<Category> list_LI = new ArrayList<Category>();
         List<Category> list_LS = new ArrayList<Category>();

         for (int i = 0; i < categoryList.size(); i++) {
            if (categoryList.get(i).getC_Code().contains("LI")) {
               list_LI.add(categoryList.get(i));
            } else if (categoryList.get(i).getC_Code().contains("LS")) {
               list_LS.add(categoryList.get(i));
               
            }

            Collections.shuffle(list_LI);
            Collections.shuffle(list_LS);
         }
         
         // 이용자 부가정보에서 관심분야코드를 "/"기준으로 쪼개고 코드의 앞에 두글자만 따옴.
         // 이용자의 관심분야코드에서 랜덤으로 세개(추천서비스에 보여지는 개수 :3개로 지정했을 때) 추출
         String[] recommendList = recommendCode.getC_Code().split("/");
         
         for(int i=0; i< recommendList.length; i++) System.out.println("추천: "+recommendList[i]);
         
         String[] randomList = new String[3];
         String tmp;

         for (int i = 0; i < 3; i++) {
        	 System.out.println((int) (Math.random() * recommendList.length));
            randomList[i] = recommendList[(int) (Math.random() * recommendList.length)];
            /*System.out.println(randomList[i]);*/

         }
         
         for (String recommend : randomList) {
            tmp = recommend.substring(0, 2);
            // System.out.println(tmp);
         }

         int count_LI = 0;
         int count_LS = 0;
           
         //이용자 부가정보에서 랜덤출력한 요소 중 LI 개수
         for (int i = 0; i < randomList.length; i++) {
            if (randomList[i].contains("LI")) {
               count_LI++;
            }
         }
         
         //카테고리 테이블에서 LI로 시작하는 요소들(위의 개수만큼 추출)       
         for (int i = 0; i < count_LI; i++) {
            list_LI.get(i).getC_Image();
            
            System.out.println(list_LI);
         }

         //이용자 부가정보에서 랜덤출력한 요소 중 LS개수
         for (int i = 0; i < randomList.length; i++) {
            if (randomList[i].contains("LS")) {
               count_LS++;
            }
         }
         //System.out.println(count_LS);
         
         //카테고리 테이블에서 LS로 시작하는 요소들(위의 개수만큼 추출)
         for (int i = 0; i < count_LS; i++) {
            list_LS.get(i).getC_Image();
            
            System.out.println(list_LS);
         }

          request.setAttribute("randomList", randomList);
          request.setAttribute("formList", formList);
         
          forward.setPath("/sendRequestForm.jsp");
          forward.setRedirect(false);
         
            return forward;
      }
   }

