package soomgosusta.service;

import soomgosusta.dao.MemberDao;

public class MemberService {
	private static MemberService service = new MemberService();
	private static MemberDao dao;
	
	public static MemberService getInstance() {
		dao= MemberDao.getInstance();
		return service;
	}
	
	
}
