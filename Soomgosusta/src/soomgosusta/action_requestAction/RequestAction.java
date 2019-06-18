package soomgosusta.action_requestAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.service.RequestService;

public class RequestAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		RequestService service = RequestService.getInstance();
		
		String[] q_Code = request.getParameterValues("q_Code");
		String[] a_Code = request.getParameterValues("a_Code");
		String requestQnA="";
		String phoneCode = "TEL";
		String phoneNum = request.getParameter("phoneNum");
		String member_Id = request.getParameter("m_id");
		String searchCode = request.getParameter("searchCode");
/*		System.out.println("q_Code");
		for(int i =0; i<q_Code.length;i++){
			System.out.println(q_Code[i]);
		}
		
		System.out.println("a_Code");
		for(int i=0; i <a_Code.length; i++){
			System.out.println(a_Code[i]);
		}*/
		
		for(int i=0; i<q_Code.length;i++){
			requestQnA += q_Code[i] + "/";
			
			for(int j=0; j<a_Code.length; j++){
				if(q_Code[i].substring(0, 3).equals(a_Code[j].substring(0, 3))){
					requestQnA += a_Code[j] += "/";
				}
			}
		
			requestQnA += ",";
		} //질문, 답 구분
		
		requestQnA += phoneCode + "/" + phoneNum + "/";

		service.insertRequestService(member_Id, searchCode, requestQnA);
		service.updateRequestService();
		return null;
	}

}
