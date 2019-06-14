package soomgosuta.action_categoryAction;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Category;
import soomgosusta.service.CategoryService;

public class MainAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();	
		forward.setRedirect(false);
		forward.setPath("main.jsp");
		System.out.println(forward);
		return forward;
	}

}
