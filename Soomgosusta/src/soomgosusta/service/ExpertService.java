package soomgosusta.service;

import javax.servlet.http.HttpServletRequest;

import soomgosusta.dao.ExpertDao;
import soomgosusta.dao.MemberDao;
import soomgosusta.domain.Expert;



public class ExpertService {
	private static ExpertService service = new ExpertService();
	private static ExpertDao dao;
	
	public static ExpertService getInstance() {
		dao= ExpertDao.getInstance();
		return service;
	}
	
	public int expertRegisterService(HttpServletRequest request)throws Exception{
		
		request.setCharacterEncoding("utf-8");
		
		Expert expert = new Expert();
		expert.setExpert_Id(request.getParameter("expert_Id"));
		expert.setExpert_Password(request.getParameter("expert_Password"));
		expert.setExpert_Name(request.getParameter("expert_Name"));
		expert.setExpert_Gender(request.getParameter("expert_Gender"));
		expert.setExpert_Pnum(request.getParameter("expert_Pnum"));
		System.out.println("service"+request.getParameter("expert_Age"));
		expert.setExpert_Age(Integer.parseInt(request.getParameter("expert_Age")));
		expert.setExpert_Photo(" ");						//회원가입시 사진에  공백 값 저장
	
		
		System.out.println("test"+expert);
		
		return dao.registerExpert(expert);
	}
	
	public Expert expertLoginService(HttpServletRequest request)throws Exception{
		
		request.setCharacterEncoding("utf-8");
		
		Expert expert = new Expert();
		expert.setExpert_Id(request.getParameter("id"));
		expert.setExpert_Password(request.getParameter("password"));
		
		String id = (expert.getExpert_Id());
		System.out.println("service 단" + id);
		String password = (expert.getExpert_Password());
		System.out.println("service 단" + password);
		expert = dao.expertLogin(id);
		
		System.out.println("service단 expert"+expert);
		return expert;
	}
	
	
}
