package soomgosusta.action_memberAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Member;
import soomgosusta.service.MemberService;

public class MemberPasswordUpdateAction implements Action {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		MemberService service = MemberService.getInstance();
		Member memberMyInfo = service.memberMyPageService(request);
		request.setAttribute("memberMyInfo", memberMyInfo);
		
		System.out.println(request.getParameter("nowPassword"));
		
		if(!memberMyInfo.getM_Password().equals(request.getParameter("nowPassword"))){
			System.out.println("kdkdkdkdkdkdkdkdkkd");
		}
		
		
		
		forward.setRedirect(false);
		forward.setPath("/updateForm.jsp");
		return forward;
	}

}
