package soomgosusta.action_memberAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;

public class logoutAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		
		HttpSession session = request.getSession();
		
		session.invalidate();

		forward.setPath("main.do");
		forward.setRedirect(true);

		return forward;
	}

}
