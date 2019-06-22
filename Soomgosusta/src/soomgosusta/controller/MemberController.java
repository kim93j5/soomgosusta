package soomgosusta.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.action_memberAction.LoginAction;
import soomgosusta.action_memberAction.LogoutAction;
import soomgosusta.action_memberAction.MemberRegisterAction;
import soomgosusta.action_memberAction.MemberRegisterFormAction;

@WebServlet(urlPatterns={"/memberRegisterForm.do","/memberRegisterAction.do" ,"/loginAction.do", "/logout.do"})
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public MemberController() {
        super();      
    }
    
    
    public void doProcess(HttpServletRequest request, HttpServletResponse response)throws SecurityException, IOException, ServletException{
    	String requestURI = request.getRequestURI();
    	
    	
    	
    	String contextPath= request.getContextPath();
    	String command = requestURI.substring(contextPath.length()+1);
    	Action action=null;
    	ActionForward forward = null;
    	
    	if(command.equals("memberRegisterForm.do")) {
    		
    		action = new MemberRegisterFormAction();
    		try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}	
    	}else if(command.equals("memberRegisterAction.do")) {
    		action = new MemberRegisterAction();
    		try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			} 
    	}else if(command.equals("loginAction.do")) {
    		action = new LoginAction();
    		try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			} 
    	}else if(command.equals("logout.do")) {
    		action = new LogoutAction();
    		try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			} 
    	}

    	
    	if(forward != null){
        	if(forward.isRedirect() == true){
        		response.sendRedirect(forward.getPath());
        	}else{
        		RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
        		dispatcher.forward(request, response);
        	}
        }	
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}
