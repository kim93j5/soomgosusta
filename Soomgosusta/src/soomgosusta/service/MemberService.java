package soomgosusta.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import soomgosusta.dao.MemberDao;
import soomgosusta.domain.Category;
import soomgosusta.domain.Member;
import soomgosusta.domain.Member_Information;

public class MemberService {
	private static MemberService service = new MemberService();
	private static MemberDao dao;
	
	public static MemberService getInstance() {
		dao= MemberDao.getInstance();
		return service;
	}

	public int addMemberInterestService(Member_Information member_information) throws Exception{
		
	return dao.addMemberInterest(member_information);
}
	
	public List<Category> categoryListService(HttpServletRequest request) throws Exception{
		
		return dao.categoryCode();
	}
	
}
