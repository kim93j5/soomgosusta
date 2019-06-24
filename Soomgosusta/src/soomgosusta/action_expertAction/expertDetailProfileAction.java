package soomgosusta.action_expertAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Expert;
import soomgosusta.domain.Expert_Profile;
import soomgosusta.domain.Expert_Profile_License;
import soomgosusta.service.ExpertService;
import soomgosusta.service.MemberService;

public class expertDetailProfileAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		ExpertService service = ExpertService.getInstance();
		ExpertService service2 = ExpertService.getInstance();
		
		Expert_Profile profile;
		profile = service.profileDetailService(request);
		
		Expert expert;
		expert = service2.expertDetailService(request);
		
		Expert_Profile_License	epl;
		epl= service.LicenseDetailService(request);
		
		
		request.setAttribute("profile",profile);
		request.setAttribute("expert",expert);
		request.setAttribute("epl", epl);
		
		forward.setRedirect(false);
		forward.setPath("expertProfile.jsp");
		return forward;
	}

}
