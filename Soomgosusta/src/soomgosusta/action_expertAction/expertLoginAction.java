package soomgosusta.action_expertAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Expert;
import soomgosusta.domain.Member;
import soomgosusta.service.ExpertService;

public class expertLoginAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		ExpertService service = ExpertService.getInstance();
		Expert expert= new Expert();
		expert = service.expertLoginService(request);
		
		String id = request.getParameter("id");
		String e_id = expert.getExpert_Id();
		
		System.out.println("action"+ e_id);
		
		String divide = expert.getE_Divide();
		
		String password = request.getParameter("password");
		String e_password = expert.getE_Password();
		
		
		System.out.println(expert);
		HttpSession session = request.getSession();
		
		
		if(id.equals(e_id)&& password.equals(e_password)) 
		{	
			
			session.setAttribute("id",e_id);
			session.setAttribute("login_state",divide);
			forward.setRedirect(true);
			forward.setPath("main.do");
		}else {
			forward.setRedirect(false);
			forward.setPath("expertLogin.jsp");
		}
				
				
		return forward;

	}

}
