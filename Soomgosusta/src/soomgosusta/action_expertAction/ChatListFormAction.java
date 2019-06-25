package soomgosusta.action_expertAction;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Estimate;
import soomgosusta.service.EstimateService;

public class ChatListFormAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		EstimateService e_service = EstimateService.getInstance();
		ActionForward forward = new ActionForward();
		List<Estimate> estimateList = null;
		
		HttpSession session = request.getSession();
		
		estimateList = e_service.estimateListService(session);
		
		request.setAttribute("estimateList",estimateList);
		
		
		
		forward.setRedirect(false);
		forward.setPath("chatListForm.jsp");
		
		return forward;
	}

}
