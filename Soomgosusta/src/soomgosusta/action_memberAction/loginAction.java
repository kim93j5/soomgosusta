package soomgosusta.action_memberAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.apache.tomcat.jdbc.pool.interceptor.ResetAbandonedTimer;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Member;
import soomgosusta.service.MemberService;

public class loginAction implements Action {

	

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		MemberService service = MemberService.getInstance();
		Member member = new Member();
		
		member = service.loginService(request);
		
		String id=request.getParameter("id");
		String m_id=member.getMember_Id();
		
		String password = request.getParameter("password");
		String m_password = member.getMember_Password();
		
		
		System.out.println(member);
		HttpSession session = request.getSession();
		
		
		if(id.equals(m_id)&& password.equals(m_password)) 
		{	
			
			session.setAttribute("id",m_id);				
			forward.setRedirect(true);
			forward.setPath("main.do");
		}else {
			forward.setRedirect(false);
			forward.setPath("login.jsp");
		}
				
				
		return forward;
	}

}
