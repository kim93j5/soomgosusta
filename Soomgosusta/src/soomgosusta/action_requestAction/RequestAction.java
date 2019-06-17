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

		System.out.println("q_Code");
		for(int i =0; i<q_Code.length;i++){
			System.out.println(q_Code[i]);
		}
		
		System.out.println("a_Code");
		for(int i=0; i <a_Code.length; i++){
			System.out.println(a_Code[i]);
		}
		
		return null;
	}

}
