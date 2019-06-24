package soomgosusta.action_expertAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.service.ExpertService;

public class expertRegisterAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		ExpertService service = ExpertService.getInstance();
		service.expertRegisterService(request);
		
		forward.setRedirect(true);
		String id = request.getParameter("expert_Id");
		
		forward.setRedirect(true);
		forward.setPath("expertAddInfoForm.do?id="+id);
		
		return forward;
		
	}

}
