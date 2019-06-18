package soomgosusta.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_expertAction.expertLoginAction;
import soomgosusta.action_expertAction.expertRegisterAction;
import soomgosusta.action_expertAction.expertRegisterFormAction;
import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;

@WebServlet(urlPatterns={"/expertRegisterActionForm.do","/expertRegisterAction.do","/expertLoginAction.do"})
public class ExpertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public ExpertController() {
        super();      
    }
    
    
    public void doProcess(HttpServletRequest request, HttpServletResponse response)throws SecurityException, IOException, ServletException{
    	String requestURI = request.getRequestURI();
    	
    	
    	
    	String contextPath= request.getContextPath();
    	String command = requestURI.substring(contextPath.length()+1);
    	Action action=null;
    	ActionForward forward = null;
    	
    	if(command.equals("expertRegisterActionForm.do")) {
    		
    		System.out.println("�Ϸο;ߵ�?? ");
    		action = new expertRegisterFormAction();
    		try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}	
    	}else if(command.equals("expertRegisterAction.do")) {
    		action = new expertRegisterAction();
    		try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			} 
    	}else if(command.equals("expertLoginAction.do")) {
    		action = new expertLoginAction();
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
