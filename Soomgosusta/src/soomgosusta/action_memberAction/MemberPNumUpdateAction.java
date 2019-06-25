package soomgosusta.action_memberAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Member;
import soomgosusta.service.MemberService;

public class MemberPNumUpdateAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		MemberService service = MemberService.getInstance();
		String member_id = request.getParameter("member_Id");
		
		Member memberMyInfo = service.memberMyPageService(member_id);
		request.setAttribute("memberMyInfo", memberMyInfo);


		memberMyInfo.setM_Pnum(request.getParameter("changePnum"));
		service.memberPnumUpdate(memberMyInfo);
		
		forward.setRedirect(true);
		forward.setPath("memberMyPage.do");
		return forward;
	}

}
