package soomgosusta.action_requestAction;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
		System.out.println(requestList);
		//System.out.println(requestList.getRequest_C_Code());
		
		
		List<Category> categoryList = ex_service.categoryListService(request);
		System.out.println(categoryList);
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
		
		//요청서 보낸 시간에 +48시간을 한다.
	      SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
	      Date time = new Date();
	      
	      String nowTime = format.format(time).substring(2,12);
	      //System.out.println(nowTime);
	      
	      String pastTime = requestList.getR_DateRecord();
	      pastTime = pastTime.replaceAll("[^0-9]", "");
	      String pastTime1 = pastTime.substring(2, 12);
	      
	      int endTime = Integer.parseInt(pastTime1) + 20000; //종료시간
	      
	      
	      //남은 시간 계산
	      int goldenTime = Integer.parseInt(nowTime) - Integer.parseInt(pastTime1);
    	  System.out.println(goldenTime);
	      
/*	  		if(goldenTime > 20000){
	  	    	 
	  	      }else{
	  	    	  System.out.println("요청이 진행 중입니다.");
	  	      }
	   */
	   
	     
	      request.setAttribute("pastTime1", pastTime1);
	      request.setAttribute("endTime", endTime);

		
		forward.setPath("/sendRequestForm.jsp");
		forward.setRedirect(false);
		
		return forward;
	}

}
