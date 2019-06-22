package soomgosusta.action_expertAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Expert;
import soomgosusta.service.ExpertService;

public class ExpertProfileUpadateAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		ExpertService service = ExpertService.getInstance();
		service.expertProfileService(request);
		Expert expert = new Expert();
		
		
		request.setAttribute("expert", expert);
		forward.setRedirect(true);
		forward.setPath("expertProfile.do?expert_Id="+request.getParameter("profile_Expert_Id"));
		
		return forward;
	}

}
