package soomgosusta.service;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import soomgosusta.dao.ExpertDao;
import soomgosusta.domain.Expert;
import soomgosusta.domain.Expert_FindInfo;



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
		expert.setE_Password(request.getParameter("expert_Password"));
		expert.setE_Name(request.getParameter("expert_Name"));
		expert.setE_Pnum(request.getParameter("expert_Pnum"));
		expert.setE_Gender(request.getParameter("expert_Gender"));
		expert.setE_Age(Integer.parseInt(request.getParameter("expert_Age")));
		expert.setE_Divide(" ");
		expert.setE_Photo(" ");						//ȸ�����Խ� ������  ���� �� ����
	
		
		System.out.println("test"+expert);
		
		return dao.registerExpert(expert);
	}
	
	public Expert expertLoginService(HttpServletRequest request)throws Exception{
		
		request.setCharacterEncoding("utf-8");
		
		Expert expert = new Expert();
		
		expert.setExpert_Id(request.getParameter("id"));
		expert.setE_Password(request.getParameter("password"));
		
		String id = (expert.getExpert_Id());

		expert = dao.expertLogin(id);
		return expert;
	}
	
	public List<Expert_FindInfo> listExpertFindService(HashMap<String, String> map){

		return dao.listExpertFind(map);
	}
}
