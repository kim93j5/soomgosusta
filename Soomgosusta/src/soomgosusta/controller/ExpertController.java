package soomgosusta.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_expertAction.ChatAction;
import soomgosusta.action_expertAction.ChatListFormAction;
import soomgosusta.action_expertAction.ExpertAddInfoAction;
import soomgosusta.action_expertAction.ExpertAddInfoFormAction;
import soomgosusta.action_expertAction.ExpertMainAction;
import soomgosusta.action_expertAction.FindExpertAction;
import soomgosusta.action_expertAction.FindExpertFormAcion;
import soomgosusta.action_expertAction.RegisterEstimateAction;
import soomgosusta.action_expertAction.RegisterEstimateFormAction;
import soomgosusta.action_expertAction.expertDetailProfileAction;
import soomgosusta.action_expertAction.expertLoginAction;
import soomgosusta.action_expertAction.expertRegisterAction;
import soomgosusta.action_expertAction.expertRegisterFormAction;
import soomgosusta.action_expertAction.expertUploadAction;
import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;

@WebServlet(urlPatterns={"/expertRegisterActionForm.do","/expertRegisterAction.do","/expertLogin.do","/expertLoginAction.do","/upload.do",
		"/expertProfile.do","/expertDetailProfileAction.do", "/findExpertForm.do", "/findExpert.do","/expertAddInfo.do","/expertAddInfoForm.do",
		"/expertMain.do","/registerEstimateForm.do","/registerEstimate.do","/chatListFormAction.do",
		"/chatAction.do"})

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
    	}else if(command.equals("expertProfile.do")) {
    		action = new expertDetailProfileAction();
    		try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			} 
    	}else if(command.equals("upload.do")) {
    		action = new expertUploadAction();
    		try {
    			System.out.println("오니요?");
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	
    	}else if(command.equals("findExpertForm.do")){
    		action = new FindExpertFormAcion();
    		try{
    			forward = action.excute(request, response);
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    	}else if(command.equals("findExpert.do")){
    		action = new FindExpertAction();
    		
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
		}else if (command.equals("registerEstimateForm.do")){
    		action = new RegisterEstimateFormAction();
    		try{
    			forward = action.excute(request, response);
    		}catch (Exception e){
    			e.printStackTrace();
    		}
    	}else if (command.equals("registerEstimate.do")){
    		action = new RegisterEstimateAction();
    		try{
    			forward = action.excute(request, response);
    		}catch (Exception e){
    			e.printStackTrace();
    		}
    	}else if(command.equals("chatListFormAction.do")){
    		action = new ChatListFormAction();
    		try{
    			forward = action.excute(request, response);
    		}catch (Exception e){
    			e.printStackTrace();
    		}
    	}else if(command.equals("expertMain.do")){
    		action = new ExpertMainAction();
    		try{
    			forward = action.excute(request, response);
    		}catch (Exception e){
    			e.printStackTrace();
    		}
    	}else if(command.equals("chatAction.do")){
    		action = new ChatAction();
    		try{
    			forward = action.excute(request, response);
    		}catch (Exception e){
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
