package soomgosusta.action_memberAction;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Category;
import soomgosusta.domain.Member_Information;
import soomgosusta.service.MemberService;

public class MemeberAddInfoAction implements Action{

   public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
      MemberService service = MemberService.getInstance();
      ActionForward forward = new ActionForward();
      request.setCharacterEncoding("utf-8");
      List<Category> categoryList =  service.categoryListService(request);

      String[] member_Interest3 = request.getParameterValues("category3");
      String str = "";
      
      for(int i=0;i<member_Interest3.length;i++){
         for(int j = 0; j<categoryList.size();j++){
         if(categoryList.get(j).getC_Word().contains(member_Interest3[i])){
            str += categoryList.get(j).getC_Code();
            if(i != member_Interest3.length-1){
               str+="/";
            }
         }
         }
      }

      String[] district_Sido = request.getParameterValues("sido");
      String[] district_Sigungu = request.getParameterValues("gugun");
      String[] district = new String[3];
      String sub_mi_District = "";
      String mi_District = "";
      for(int i=0;i<district_Sido.length;i++){
         district[i]= district_Sido[i] + "/"+district_Sigungu[i];
         if(!district[i].equals("시/도 선택/")){
         sub_mi_District+=district[i];
         sub_mi_District+=",";
         }
      }
      mi_District = sub_mi_District.substring(0,sub_mi_District.length()-1);
      
      System.out.println(mi_District);
      
      for(int i=0;i<member_Interest3.length;i++){
         System.out.println(member_Interest3[i]);
      }
      String member_id = request.getParameter("member_Id");
      System.out.println(str);
      System.out.println(member_id);
      System.out.println(mi_District);

      Member_Information member_information = new Member_Information();
      member_information.setC_Code(str);
      member_information.setMi_District(mi_District);
      member_information.setInfor_Member_Id(member_id);
      
      service.addMemberInterestService(member_information);
      
      forward.setRedirect(true);
      forward.setPath("requestInfoForm.do?member_Id="+member_id);
      return forward;
   }

}