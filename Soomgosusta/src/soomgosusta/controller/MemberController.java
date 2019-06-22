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
import soomgosusta.action_memberAction.MatchCalculateAction;
import soomgosusta.action_memberAction.MemberImageUpdateAction;
import soomgosusta.action_memberAction.MemberMyPageAction;
import soomgosusta.action_memberAction.MemberNameUpdateAction;
import soomgosusta.action_memberAction.MemberNameUpdateActionForm;
import soomgosusta.action_memberAction.MemberPNumUpdateAction;
import soomgosusta.action_memberAction.MemberPNumUpdateActionForm;
import soomgosusta.action_memberAction.MemberPasswordUpdateAction;
import soomgosusta.action_memberAction.MemberPasswordUpdateActionForm;
import soomgosusta.action_memberAction.MemeberAddInfoAction;
import soomgosusta.action_memberAction.MemeberAddInfoActionForm;
import soomgosusta.action_memberMainAction.RecommendInfoAction;


@WebServlet(urlPatterns={"/memberRegisterForm.do","/memberRegisterAction.do" ,"/loginAction.do", "/logout.do","/memberAddInfo.do","/memberAddInfoAction.do"
		, "/matchAction.do", "/memberMyPage.do","/imageUpdate.do", "/pwUpdate.do","/nameUpdate.do","/pNumUpdate.do","/pwUpdateForm.do"
		,"/nameUpdateForm.do","/pNumUpdateForm.do","/recommendInfoForm.do"})

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
    	}else if(command.equals("memberAddInfo.do")){
			action = new MemeberAddInfoActionForm();
			try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}else if (command.equals("recommendInfoForm.do")) {
    		action = new RecommendInfoAction();
    		try {
    			forward = action.excute(request, response);
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    		
    	}else if(command.equals("memberAddInfoAction.do")){
				action = new MemeberAddInfoAction();
			try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if (command.equals("matchAction.do")) {
			action = new MatchCalculateAction();
			try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("memberMyPage.do")) {
			action = new MemberMyPageAction();
			try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if (command.equals("imageUpdate.do")) {
			action = new MemberImageUpdateAction();
			try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if (command.equals("pwUpdate.do")) {
			action = new MemberPasswordUpdateAction();
			try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if (command.equals("nameUpdate.do")) {
			action = new MemberNameUpdateAction();
			try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if (command.equals("pNumUpdate.do")) {
			action = new MemberPNumUpdateAction();
			try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if (command.equals("pwUpdateForm.do")) {
			action = new MemberPasswordUpdateActionForm();
			try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if (command.equals("nameUpdateForm.do")) {
			action = new MemberNameUpdateActionForm();
			try {
				forward = action.excute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if (command.equals("pNumUpdateForm.do")) {
			action = new MemberPNumUpdateActionForm();
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
