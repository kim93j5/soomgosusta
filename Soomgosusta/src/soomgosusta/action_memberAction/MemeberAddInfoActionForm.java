package soomgosusta.action_memberAction;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Category;
import soomgosusta.service.MemberService;

	public class MemeberAddInfoActionForm implements Action {

	   public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	         ActionForward forward = new ActionForward();
	         MemberService service = MemberService.getInstance();
	         
	         List<Category> categoryList =  service.categoryListService(request);
	         List<String> list1 = new ArrayList<String>(); //[레슨,레슨,레슨,레슨]
	         List<String> list2 = new ArrayList<String>(); //[학업,학업,악기,악기]
	         List<String> list3 = new ArrayList<String>(); //[외국어,논술,가야금,거문고]
	         List<String> categoryList1 = new ArrayList<String>(); //[레슨]
	         List<String> categoryList2 = new ArrayList<String>(); //[학업,악기]
	         List<String> categoryList3_1 = new ArrayList<String>(); //[외국어,논술]
	         List<String> categoryList3_2 = new ArrayList<String>(); //[가야금,거문고]
	         
	         for(int i=0; i<categoryList.size(); i++){
	               String groupList = categoryList.get(i).getC_Word();
	               //i=0일 때, groupList는 레슨/학업/외국어
	               if(groupList.contains("레슨/학업")){
	                  String groupArr2[] = groupList.split("/");
	                  //groupArr2[0]=레슨,groupArr2[1]=학업,groupArr2[2]=외국어
	                  categoryList3_1.add(groupArr2[2]); //외국어만 categoryList3_1에 넣어줌
	               } else if(groupList.contains("레슨/악기")){
	                  String groupArr2[] = groupList.split("/");
	                  categoryList3_2.add(groupArr2[2]);
	               }
	               
	               String groupArr[] = groupList.split("/");
	               list1.add(groupArr[0]);
	               list2.add(groupArr[1]);
	               list3.add(groupArr[2]);
	           }
	         
	            for (int i = 0; i < list1.size(); i++) {
	                if (!categoryList1.contains(list1.get(i))) {
	                   categoryList1.add(list1.get(i));
	                }
	            }//레슨 중복제거
	            for (int i = 0; i < list2.size(); i++) {
	                if (!categoryList2.contains(list2.get(i))) {
	                   categoryList2.add(list2.get(i));
	                }
	            }//학업,악기 중복제거
	            
	         request.setAttribute("categoryList1", categoryList1);
	         request.setAttribute("categoryList2", categoryList2);
	         request.setAttribute("categoryList3_1", categoryList3_1);
	         request.setAttribute("categoryList3_2", categoryList3_2);
	         
	         forward.setRedirect(false);
	         forward.setPath("/memberAddInfoForm.jsp");
	         return forward;
	      }

	}