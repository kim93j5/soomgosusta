package soomgosusta.action_requestAction;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Category;
import soomgosusta.domain.Request;
import soomgosusta.service.ExpertService;
import soomgosusta.service.RequestService;

public class SendRequestAction implements Action {

   public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
      RequestService service = RequestService.getInstance();
      ExpertService ex_service = ExpertService.getInstance();
      ActionForward forward = new ActionForward();
      
      request.setCharacterEncoding("utf-8");
      
      Request requestList = service.sendRequestService(request);
      request.setAttribute("requestList", requestList);
      //System.out.println(requestList);
      //System.out.println(requestList.getRequest_C_Code());
      
      
      List<Category> categoryList = ex_service.categoryListService(request);
      //System.out.println(categoryList);
        String category_word ="";
        String[] category_word_split = new String[20];
        String category_word_last = "";
   
      for(int i=0; i < categoryList.size(); i++){
        if(categoryList.get(i).getC_Code().equals(requestList.getRequest_C_Code())){
           category_word = categoryList.get(i).getC_Word();
        }
      }
      category_word_split = category_word.split("/");
      category_word_last = category_word_split[2]+ "ㅤ"+ category_word_split[0];
      
      request.setAttribute("category_word_last", category_word_last);
      
      /////////////////////////////////요청시간,만료시간//////////////////////////////////
   
         Date requestDateStr = requestList.getR_DateRecord();
         Date nowDate = new Date(); //현재 시간
         
         System.out.println(requestDateStr);
         System.out.println(nowDate);
         
         String requestTime = null;
         String endTime = null;
         
         SimpleDateFormat df = new SimpleDateFormat("YYYY년MM월dd일HH시mm분", Locale.KOREA);
         Calendar cal = Calendar.getInstance();
         Calendar cal2 = Calendar.getInstance();
         cal.setTime(requestDateStr);
         cal.add(Calendar.DATE, +2);
         endTime = df.format(cal.getTime());
         
         cal2.setTime(requestDateStr);
         cal2.add(Calendar.DATE, 0);
         requestTime = df.format(cal2.getTime());
         
         //System.out.println("요청시간 :" + requestDateStr);
         //System.out.println("2일 후 :" + endTime);

         request.setAttribute("requestTime", requestTime);
         request.setAttribute("endTime", endTime);
      
         
         
         
         forward.setPath("/sendRequestForm.jsp");
         forward.setRedirect(false);
      
         return forward;
   }

}