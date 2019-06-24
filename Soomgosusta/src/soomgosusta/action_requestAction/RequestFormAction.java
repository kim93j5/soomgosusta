package soomgosusta.action_requestAction;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Answer;
import soomgosusta.domain.Question;
import soomgosusta.service.CategoryService;
import soomgosusta.service.RequestService;

public class RequestFormAction implements Action {

		

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		ActionForward forward = new ActionForward();
		CategoryService c_service = CategoryService.getInstance();
		RequestService service = RequestService.getInstance();
		
		List<Question> listQuestion = null;
		
		String searchCode = request.getParameter("searchCode");
		String searchKey = c_service.searchCategoryService(searchCode);
		String[] keyGroup = null;
		int expertNum =0;
		if(searchKey != null){
			keyGroup = searchKey.split("/");
			request.setAttribute("searchCode", searchCode);
			request.setAttribute("searchKey", keyGroup[2]);
			expertNum = service.listEmploymentLog("%"+searchKey+"%");
		}

		request.setAttribute("expertNum", expertNum);
		
		if (!searchCode.equals("null")) {

			listQuestion = service.listQuestionService(request);
			request.setAttribute("listQuestion", listQuestion);

			List<Answer> listAnswer = service.listAnswerService(listQuestion);
			request.setAttribute("listAnswer", listAnswer);

		}		
		forward.setRedirect(false);
		forward.setPath("/requestForm.jsp");
		
		return forward;
	}

}
