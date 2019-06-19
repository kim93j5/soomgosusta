package soomgosusta.service;

import javax.servlet.http.HttpServletRequest;

import soomgosusta.dao.MemberDao;
import soomgosusta.domain.Member;


public class MemberService {
	private static MemberService service = new MemberService();
	private static MemberDao dao;
	
	public static MemberService getInstance() {
		dao= MemberDao.getInstance();
		return service;
	}
	
	public int memberRegisterService(HttpServletRequest request)throws Exception{
		
		request.setCharacterEncoding("utf-8");
		
		Member member = new Member();
		member.setMember_Id(request.getParameter("member_Id"));
		member.setM_Password(request.getParameter("member_Password"));
		member.setM_Name(request.getParameter("member_Name"));
		member.setM_Pnum(request.getParameter("member_Pnum"));
		member.setM_Gender(request.getParameter("member_Gender"));
		member.setM_Age(Integer.parseInt(request.getParameter("member_Age")));
		member.setM_Divide(" ");
		member.setM_Photo(" ");						//
		
		
		System.out.println("test"+member);
		
		return dao.registerMember(member);
	}
	
	public Member loginService(HttpServletRequest request)throws Exception{
		
		request.setCharacterEncoding("utf-8");
		
		Member member = new Member();
		member.setMember_Id(request.getParameter("id"));
		member.setM_Password(request.getParameter("password"));
		
		String id = (member.getMember_Id());
		System.out.println("service ��" + id);
		String password = (member.getM_Password());
		System.out.println("service ��" + password);
		member = dao.login(id);
		
		System.out.println("service�� member"+member);
		return member;
	}
	
	
}
