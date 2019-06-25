package soomgosusta.action_memberAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.service.MemberService;

public class memberRegisterAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		MemberService service = MemberService.getInstance();		
		service.memberRegisterService(request);	
		
		String member_Id = request.getParameter("member_Id");
		
		forward.setRedirect(true);
		forward.setPath("memberAddInfo.do?member_Id="+member_Id);
		
		return forward;
	}

}
