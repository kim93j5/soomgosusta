package soomgosusta.action_requestAction;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.service.RequestService;

public class RequestAction implements Action {

		
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		ActionForward forward = new ActionForward();
		RequestService service = RequestService.getInstance();
		
		String[] q_Code = request.getParameterValues("q_Code");
		String[] a_Code = request.getParameterValues("a_Code");

		String requestQnA="";
		String phoneCode = "TEL";
		String phoneNum = request.getParameter("phoneNum");
		String member_Id = request.getParameter("m_id");
		String searchCode = request.getParameter("searchCode");
		String[] sido = request.getParameterValues("sido");
		String[] gugun = request.getParameterValues("gugun");
		String gender = request.getParameter("gen");
		
		HashMap<String, String> req_Info = new HashMap<String, String>();		
		
		for(int i=0; i<q_Code.length;i++){                                                                                                                                                                                                                                                                                                                                                                                                                                     
			requestQnA += q_Code[i] + "/";
			
			for(int j=0; j<a_Code.length; j++){
				if(q_Code[i].equals(a_Code[j].substring(0, a_Code[j].indexOf('A')-1))){
					requestQnA += a_Code[j] += "/";
				}
			}
			requestQnA += ",";
		} //질문, 답 구분
		
		requestQnA += phoneCode + "/" + phoneNum + "/,"; //핸드폰번호
		requestQnA += "GEN/" + gender+"/,";
		
		String dist="DIS/";
		for(int i=0; i<sido.length;i++){
			if(!sido[i].equals("시/도 선택")){
				dist += sido[i]+"/"+gugun[i]+",";
			}
		}
		
		req_Info.put("m_Id", member_Id);
		req_Info.put("c_Code", searchCode);
				
		int size = service.listAlreadySendService(req_Info);
		
		if(size == 0){
			request.setAttribute("req", "notyet");
			service.insertRequestService(member_Id, searchCode, requestQnA, dist);
			service.updateLogRequestService(searchCode);
			forward.setRedirect(true);
			forward.setPath("matchAction.do?member_Id="+member_Id+"&code="+searchCode);
			
		}else{
			request.setAttribute("req", "ing");
			forward.setRedirect(false);
			forward.setPath("requestInfo.jsp");

			
		}
		
		
		return forward;
	}
}
