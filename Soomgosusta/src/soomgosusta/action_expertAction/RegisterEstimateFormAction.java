package soomgosusta.action_expertAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Match;
import soomgosusta.domain.Request;
import soomgosusta.service.MatchService;
import soomgosusta.service.RequestService;

public class RegisterEstimateFormAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MatchService m_service = MatchService.getInstance();
		RequestService r_service = RequestService.getInstance();
		ActionForward forward = new ActionForward();
		Match match = null;
		Request re = null;
		
		
		match = m_service.detailService(request);
		re = r_service.requestDetailService(request);
		
		
		request.setAttribute("match", match);
		request.setAttribute("request", re);

		
		forward.setRedirect(false);
		forward.setPath("registerEstimate.jsp");
		
		return forward;
	}

}
