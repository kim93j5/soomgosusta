package soomgosusta.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;

import soomgosusta.action_memberAction.MatchCalculateAction;
import soomgosusta.action_memberAction.MemeberAddInfoAction;
import soomgosusta.action_memberAction.MemeberAddInfoActionForm;
import soomgosusta.domain.Member;
import soomgosusta.mapper.MemberMapper;
import soomgosusta.service.MemberService;
import soomgosusta.action_memberAction.loginAction;
import soomgosusta.action_memberAction.logoutAction;
import soomgosusta.action_memberAction.memberRegisterAction;
import soomgosusta.action_memberAction.memberRegisterFormAction;


@WebServlet(urlPatterns={"/memberRegisterForm.do","/memberRegisterAction.do" ,"/loginAction.do", "/logout.do",
		"/memberAddInfo.do","/memberAddInfoAction.do","/matchAction.do"})

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
    	
    	if(command.equals("memberAddInfo.do")){
			action = new MemeberAddInfoActionForm();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("memberAddInfoAction.do")){
				action = new MemeberAddInfoAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("matchAction.do")){
			action = new MatchCalculateAction();
		try {
			forward = action.execute(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}else if(command.equals("memberRegisterForm.do")) {
    		
    		action = new memberRegisterFormAction();
    		try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}	
    	}else if(command.equals("memberRegisterAction.do")) {
    		action = new memberRegisterAction();
    		try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			} 
    	}else if(command.equals("loginAction.do")) {
    		action = new loginAction();
    		try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			} 
    	}else if(command.equals("logout.do")) {
    		action = new logoutAction();
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

