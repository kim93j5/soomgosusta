package soomgosusta.action_categoryAction;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.service.CategoryService;

public class MainAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		ActionForward forward = new ActionForward();
		CategoryService service = CategoryService.getInstance();
		
		JSONArray listPopular = service.listSearchService(request); //인기서비스
		request.setAttribute("listPopular", listPopular);
	
		forward.setRedirect(false);
		forward.setPath("main.jsp");
		
		return forward;
	}

}
