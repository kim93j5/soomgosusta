package soomgosusta.action_categoryAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.service.CategoryService;

public class SearchAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		ActionForward forward = new ActionForward();
		CategoryService service = CategoryService.getInstance();
		
		String searchCode = service.updateSearchLogService(request);
		
		if(searchCode != null){
			request.setAttribute("searchCode", searchCode);
		}
		
//		forward.setRedirect(false);
//		forward.setPath("/sendRequest.jsp");
		
		forward.setRedirect(true);
		forward.setPath("requestFormAction.do?searchCode="+searchCode);
		return forward;
	}

}
