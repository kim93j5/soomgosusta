package soomgosusta.action_memberAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Member;
import soomgosusta.service.MemberService;

public class MemberPNumUpdateAction implements Action {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		MemberService service = MemberService.getInstance();
		Member memberMyInfo = service.memberMyPageService(request);
		
		forward.setRedirect(false);
		forward.setPath("/memberMyPage.jsp");
		return forward;
	}

}
