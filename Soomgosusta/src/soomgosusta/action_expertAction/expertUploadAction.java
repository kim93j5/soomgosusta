package soomgosusta.action_expertAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.service.ExpertService;

public class expertUploadAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("오나요??ㄴ");
		ActionForward forward = new ActionForward();
		ExpertService service= ExpertService.getInstance();
		
		service.expertImgUploadService(request);
		
		
		forward.setRedirect(false);
		forward.setPath("expertProfile.do?expert_Id="+request.getParameter("expert_Id"));
		return forward;
	}

}
