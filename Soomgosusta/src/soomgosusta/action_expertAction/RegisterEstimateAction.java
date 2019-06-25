package soomgosusta.action_expertAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.service.EstimateService;
import soomgosusta.service.MatchService;

public class RegisterEstimateAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MatchService m_service = MatchService.getInstance();
		EstimateService e_service = EstimateService.getInstance();
		ActionForward forward = new ActionForward();
		
		m_service.matchUpdateService(request);
		e_service.estimateInsertService(request);
		
		forward.setRedirect(true);
		forward.setPath("chatListFormAction.do");
		
		return forward;
	}

}
