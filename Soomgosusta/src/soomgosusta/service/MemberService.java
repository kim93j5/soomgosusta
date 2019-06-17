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
		member.setMember_Password(request.getParameter("member_Password"));
		member.setMember_Name(request.getParameter("member_Name"));
		member.setMember_Gender(request.getParameter("member_Gender"));
		member.setMember_Pnum(request.getParameter("member_Pnum"));
		System.out.println("service"+request.getParameter("member_Age"));
		member.setMember_Age(Integer.parseInt(request.getParameter("member_Age")));
		member.setMember_Photo(" ");						//회원가입시 사진에  공백 값 저장
		member.setMember_Interest(request.getParameter("member_Interest"));
		
		System.out.println("test"+member);
		
		return dao.registerMember(member);
	}
	
	public Member loginService(HttpServletRequest request)throws Exception{
		
		request.setCharacterEncoding("utf-8");
		
		Member member = new Member();
		member.setMember_Id(request.getParameter("id"));
		member.setMember_Password(request.getParameter("password"));
		
		String id = (member.getMember_Id());
		System.out.println("service 단" + id);
		String password = (member.getMember_Password());
		System.out.println("service 단" + password);
		member = dao.login(id);
		
		System.out.println("service단 member"+member);
		return member;
	}
	
	
}
