package soomgosusta.service;

import javax.servlet.http.HttpServletRequest;

import soomgosusta.dao.MemberMainDao;
import soomgosusta.domain.Member_Information;

public class MemberService {
	private static MemberService service = new MemberService();
	private static MemberMainDao m_dao;
	
	public static MemberService getInstance() {
		m_dao= MemberMainDao.getInstance();
		return service;
	}
	
	public Member_Information recommendInfoService(HttpServletRequest request)throws Exception{
		  request.setCharacterEncoding("utf-8");
		    
	return m_dao.recommendInfo();
	  }	
	
	
}
