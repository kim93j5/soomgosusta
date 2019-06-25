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
		String m_password = member.getM_Password();
		
		String divide = member.getM_Divide();
		
		System.out.println(member);
		HttpSession session = request.getSession();
		
		
		if(id.equals(m_id)&& password.equals(m_password)) 
		{	
			request.setAttribute("member", member);
			session.setAttribute("id",m_id);
			session.setAttribute("login_state",divide);
			forward.setRedirect(true);
			forward.setPath("requestInfoForm.do?member_Id="+m_id);
		}else {
			forward.setRedirect(true);
			forward.setPath("login.do");
		}
				
				
		return forward;
	}

}
