package soomgosusta.action_categoryAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.service.CategoryService;

public class CategoryInfoAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		CategoryService service = CategoryService.getInstance();
		
		JSONArray listCategory = service.listCategoryService(request);

		request.setAttribute("listCategory", listCategory);
		
		forward.setRedirect(false);
		forward.setPath("categoryInfo.jsp");

		return forward;
	}

}
