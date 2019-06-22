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

		if(!memberMyInfo.getM_Password().equals(request.getParameter("nowPassword"))){
			System.out.println("기존 비밀번호 불일치");
		}else{
			System.out.println("기존 비밀번호 일치");
			if(request.getParameter("changePassword").equals(request.getParameter("changePasswordcheck"))){
				System.out.println("변경 비밀번호 확인 완료");
				memberMyInfo.setM_Password(request.getParameter("changePassword"));
				service.memberPwUpdate(memberMyInfo);
			}
		}
		forward.setRedirect(true);
		forward.setPath("memberMyPage.do");
		return forward;
	}

}
