package soomgosusta.action_expertAction;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Chat;
import soomgosusta.domain.Estimate;
import soomgosusta.service.ChatService;
import soomgosusta.service.EstimateService;

public class ChatAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ChatService chat_service = ChatService.getInstance();
		EstimateService e_service = EstimateService.getInstance();
		ActionForward forward = new ActionForward();
		List<Chat> chatList = null;
		Estimate estimate = null;
	
		chatList = chat_service.chatListService(request);
		estimate = e_service.detailService(request);
		
		request.setAttribute("chatList", chatList);
		request.setAttribute("estimate",estimate);
		
		forward.setRedirect(false);
		forward.setPath("chatForm.jsp");
		
		return forward;
	}

}
