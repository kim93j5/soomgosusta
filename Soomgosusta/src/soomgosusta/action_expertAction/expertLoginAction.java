package soomgosusta.action_expertAction;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Expert;
import soomgosusta.domain.Match;
import soomgosusta.service.ExpertService;
import soomgosusta.service.MatchService;

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

		String name = expert.getE_Name();
		
		System.out.println(expert);
		HttpSession session = request.getSession();
		
		
		if(id.equals(e_id)&& password.equals(e_password)) 
		{	
			request.setAttribute("expert", expert);
			session.setAttribute("id",e_id);
			session.setAttribute("name",name);
			session.setAttribute("login_state", divide);
			
			MatchService m_service = MatchService.getInstance();
			List<Match> matchList = null;
			
			matchList = m_service.matchService(session);

			request.setAttribute("matchList",matchList);
			
			forward.setRedirect(false);
			forward.setPath("expertMain.jsp");

		}else {
			forward.setRedirect(true);
			forward.setPath("expertLogin.jsp");
		}
		
				
		return forward;

	}

}
