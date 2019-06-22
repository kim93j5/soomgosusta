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
import soomgosusta.action_memberMainAction.RecommendInfoAction;

@WebServlet({"/recommendInfoForm.do"})
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public MemberController() {
        super();
        
    }
    public void doProcess(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
    	String requestURI = request.getRequestURI();
    	String contextPath= request.getContextPath();
    	String command = requestURI.substring(contextPath.length()+1);
    	
    	Action action=null;
    	ActionForward forward = null;	
    	
        if (command.equals("recommendInfoForm.do")) {
    		action = new RecommendInfoAction();
    		try {
    			forward = action.excute(request, response);
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    		
    	}
        
		if (forward != null) {
			if (forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			} else {
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
