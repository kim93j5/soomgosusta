package soomgosusta.action_categoryAction;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.service.CategoryService;

public class SearchAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		ActionForward forward = new ActionForward();
		CategoryService service = CategoryService.getInstance();
	    
		String searchKey = request.getParameter("searchKey");
		JSONArray listSearchKey = service.searchKeyService(searchKey);
		if(listSearchKey.size() > 1){
			request.setAttribute("listSearchKey", listSearchKey);
			
			forward.setRedirect(false);
			forward.setPath("listSearchKey.jsp");
		}else if(listSearchKey.size() == 1 ){
			String searchCode = service.updateSearchLogService(searchKey); //검색로그+1
			request.setAttribute("searchCode", searchCode);
			
			forward.setRedirect(true);
			forward.setPath("requestForm.do?searchCode="+searchCode);
		}else{
			forward.setRedirect(true);
			forward.setPath("requestForm.do?searchCode=null");
		}

		return forward;
	}

}
