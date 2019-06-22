package soomgosusta.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class loginFilter
 */
@WebFilter(urlPatterns={""})
public class loginFilter implements Filter {


    public loginFilter() {
        // TODO Auto-generated constructor stub
    }


	public void destroy() {
		// TODO Auto-generated method stub
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request2 = (HttpServletRequest) request;
		HttpServletResponse response2 = (HttpServletResponse) response;
	
		HttpSession session = request2.getSession();
		String m_id= (String)session.getAttribute("m_id");
		String e_id= (String)session.getAttribute("e_id");
		String login_state= (String)session.getAttribute("login_state");
		
	
				
		if(m_id==null && login_state.equals("member")){
			response2.sendRedirect("login.jsp");
			request.setAttribute("id", m_id);
			request.setAttribute("login_state", login_state);
		}
			else if(e_id == null && login_state.equals("expert")) {		

			response2.sendRedirect("expertLogin.jsp"); 			
			request.setAttribute("id", e_id);
			request.setAttribute("login_state", login_state);
			}

		
	
		chain.doFilter(request, response);
		
	}
	


	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
