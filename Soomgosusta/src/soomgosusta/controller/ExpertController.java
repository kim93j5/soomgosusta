package soomgosusta.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import soomgosusta.action_expertAction.ExpertDetailProfileAction;
import soomgosusta.action_expertAction.ExpertLoginAction;
import soomgosusta.action_expertAction.ExpertRegisterAction;
import soomgosusta.action_expertAction.ExpertRegisterFormAction;
import soomgosusta.action_expertAction.findExpertAcion;
import soomgosusta.action_expertAction.findExpertFormAcion;
import soomgosusta.action_expertAction.ExpertAddInfoAction;
import soomgosusta.action_expertAction.ExpertAddInfoFormAction;
import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;

@WebServlet(urlPatterns={"/expertRegisterActionForm.do","/expertRegisterAction.do","/expertLoginAction.do",
		"/expertProfile.do","/expertDetailProfileAction.do", "/findExpertForm.do", "/findExpert.do","/expertAddInfo.do","/expertAddInfoForm.do"})
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
    		action = new ExpertRegisterFormAction();
    		try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}	
    	}else if(command.equals("expertRegisterAction.do")) {
    		action = new ExpertRegisterAction();
    		try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			} 
    	}else if(command.equals("expertLoginAction.do")) {
    		action = new ExpertLoginAction();
    		try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			} 
    	}else if(command.equals("expertProfile.do")) {
    		action = new ExpertDetailProfileAction();
    		try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			} 
    	}else if(command.equals("update")) {
    		
    		try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			} 
    	}else if(command.equals("findExpertForm.do")){
    		action = new findExpertFormAcion();
    		
    		try{
    			forward = action.excute(request, response);
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    	}else if(command.equals("findExpert.do")){
    		action = new findExpertAcion();
    		
    		try{
    			forward = action.excute(request, response);
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    	}else if (command.equals("expertAddInfoForm.do")) {
			action = new ExpertAddInfoFormAction();
			try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}else if (command.equals("expertAddInfo.do")) {
			action = new ExpertAddInfoAction();
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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

}
