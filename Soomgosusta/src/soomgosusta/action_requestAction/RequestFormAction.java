package soomgosusta.action_requestAction;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Answer;
import soomgosusta.domain.Question;
import soomgosusta.service.MemberService;
import soomgosusta.service.RequestService;

public class RequestFormAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		ActionForward forward = new ActionForward();
		RequestService service = RequestService.getInstance();
		
		List<Question> listQuestion = null;
		
		String searchCode = request.getParameter("searchCode");
		request.setAttribute("searchCode", searchCode);
		
		listQuestion = service.listQuestionService(request);
		
		System.out.println("액션");
		for(int i=0; i<listQuestion.size(); i++){
			System.out.println(listQuestion.get(i));
		}
		
		request.setAttribute("listQuestion", listQuestion);
		
		List<Answer> listAnswer = service.listAnswerService(listQuestion);
		request.setAttribute("listAnswer", listAnswer);
		for(int i=0; i<listAnswer.size();i++){
			System.out.println(listAnswer.get(i));
		}
		
		forward.setRedirect(false);
		forward.setPath("/requestForm.jsp");
		
		return forward;
	}

}
