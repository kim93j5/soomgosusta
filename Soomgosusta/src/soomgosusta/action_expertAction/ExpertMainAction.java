package soomgosusta.action_expertAction;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Match;
import soomgosusta.service.MatchService;

public class ExpertMainAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		MatchService m_service = MatchService.getInstance();
		List<Match> matchList = null;
		
		HttpSession session = request.getSession();
		
		matchList = m_service.matchService(session);
		request.setAttribute("matchList",matchList);
	
		forward.setRedirect(false);
		forward.setPath("expertMain.jsp");
		
		return forward;
	}

}
