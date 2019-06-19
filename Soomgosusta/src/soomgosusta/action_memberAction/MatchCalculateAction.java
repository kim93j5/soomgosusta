package soomgosusta.action_memberAction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Expert_Information;
import soomgosusta.domain.Request;
import soomgosusta.service.MatchService;

public class MatchCalculateAction implements Action {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MatchService service = MatchService.getInstance();
		
		Request requestedMember = service.requestMemberService(request);
		System.out.println(requestedMember);
		List<String> memberRequest = new ArrayList<String>();
		memberRequest.add(requestedMember.getR_QA_01()); //Q_Day/Q_Day_A3/Q_Day_A5
		memberRequest.add(requestedMember.getR_QA_02()); //Q_Time/Q_Time_A4/Q_Time_A5/Q_Time_A6
		memberRequest.add(requestedMember.getR_QA_03()); //Q_Start/Q_Start_A3
		memberRequest.add(requestedMember.getR_QA_04()); //서울특별시/종로구,서울특별시/중구,서울특별시/성북구
		memberRequest.add(requestedMember.getR_QA_05());
		memberRequest.add(requestedMember.getR_QA_06());
		memberRequest.add(requestedMember.getR_QA_07());
		memberRequest.add(requestedMember.getR_QA_08());
		memberRequest.add(requestedMember.getR_QA_09());
		memberRequest.add(requestedMember.getR_QA_10());
		memberRequest.add(requestedMember.getR_QA_11());
		memberRequest.add(requestedMember.getR_QA_12());
		memberRequest.add(requestedMember.getR_QA_13());
		memberRequest.add(requestedMember.getR_QA_14());
		memberRequest.add(requestedMember.getR_QA_15());
		
		String qDay = "";
		String qTime = "";
		String qstart = "";
		String qdistrict = "";
		
		System.out.println(memberRequest.size());
		for(int i=0;i<15;i++){
			memberRequest.remove("null");
		}
		System.out.println(memberRequest.size());
		for(int i=0;i<memberRequest.size();i++){
			System.out.println(memberRequest.get(i));
		}
		
		for(int i =0;i<memberRequest.size();i++){
			String qCode = memberRequest.get(i);
			if(qCode.contains("Q_Day")){
				qDay=qCode;
			}else if(qCode.contains("Q_Time")){
				qTime=qCode;
			}else if(qCode.contains("Q_Start")){
				qstart=qCode;
			}else if(qCode.equals("Q_Dist")){
				qdistrict=qCode;
			}
		}
		System.out.println(qDay);
		System.out.println(qTime);
		System.out.println(qstart);
		
		/*for(int i=0; i<categoryList.size(); i++){
            String groupList = categoryList.get(i).getCategory_Group();
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
		*/
		
		
		
		
		
		
		
		
		
		
		
		String request_C_Code = requestedMember.getRequest_C_Code();
		
		List<Expert_Information> matchCandidateList = service.matchCandidateListService(request_C_Code);
		
		for(int i =0; i<matchCandidateList.size();i++){
			System.out.println(matchCandidateList.get(i));
		}

		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/memberAddInfoForm.jsp");
		return forward;
	}

}
