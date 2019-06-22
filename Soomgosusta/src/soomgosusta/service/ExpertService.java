package soomgosusta.service;

import java.util.HashMap;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import soomgosusta.dao.ExpertDao;
import soomgosusta.domain.Expert;
import soomgosusta.domain.Expert_Profile;
import soomgosusta.domain.Expert_FindInfo;
import soomgosusta.domain.Answer;
import soomgosusta.domain.Category;
import soomgosusta.domain.Expert_Information;
import soomgosusta.domain.Question;

public class ExpertService {
	private static ExpertService service = new ExpertService();
	private static ExpertDao dao;

	public static ExpertService getInstance() {
		dao = ExpertDao.getInstance();

		return service;
	}

	public List<Category> categoryListService(HttpServletRequest request) throws Exception {

		return dao.categoryCode();
	}

	public List<Question> qInfoService(HttpServletRequest request) throws Exception {
		return dao.q_Info();
		
	}
	public Expert_Profile profileDetailService(HttpServletRequest request)throws Exception {
		request.setCharacterEncoding("utf-8");
		Expert_Profile profile = new Expert_Profile();
		String expert_Id= request.getParameter("expert_Id");
		System.out.println("@@service expert_Id"+expert_Id);
		profile=dao.profileDetail(expert_Id);
		return profile;
	}
	public Expert expertDetailService(HttpServletRequest request)throws Exception{
		System.out.println("아아아앙ㅁ니;ㅓㅁㄴ이허ㅏㅁㄴ아ㅣ");
		request.setCharacterEncoding("utf-8");
		Expert expert = new Expert();
		String expert_Id= request.getParameter("expert_Id");
		System.out.println("##service expert_Id"+expert_Id);
		expert = dao.expertDetail(expert_Id);
		
		return expert;
	}



	
	public int expertProfileService(HttpServletRequest request)throws Exception {
		
	request.setCharacterEncoding("utf-8");
	Expert_Profile profile = new Expert_Profile();

	profile.setProfile_Expert_Id(request.getParameter("profile_Expert_Id"));
	System.out.println("@@profile_Expert_Id"+request.getParameter("profile_Expert_Id"));
	profile.setEp_LineLetter(request.getParameter("ep_LineLetter"));
	profile.setEp_DetailLetter(request.getParameter("ep_DetailLetter"));
	profile.setEp_Identification("false");
	
		return dao.profileUpdate(profile);
	}
	
	
	public List<Answer> aInfoService(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("utf-8");

		return dao.a_Info();
	}

	public int insertExpertSumService(Expert_Information expert_Info) throws Exception {

		return dao.insertExpertSum(expert_Info);

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

	public int expertRegisterService(HttpServletRequest request)throws Exception {
		request.setCharacterEncoding("utf-8");
		Expert expert = new Expert();
		expert.setExpert_Id(request.getParameter("expert_Id"));
		expert.setE_Password(request.getParameter("expert_Password"));
		expert.setE_Name(request.getParameter("expert_Name"));
		expert.setE_Pnum(request.getParameter("expert_Pnum"));
		expert.setE_Gender(request.getParameter("expert_Gender"));
		expert.setE_Age(Integer.parseInt(request.getParameter("expert_Age")));
		expert.setE_Divide(" ");
		expert.setE_Photo(" ");						
	
		
		System.out.println("test"+expert);
		
		return dao.registerExpert(expert);
	}
	

	
	public List<Expert_FindInfo> listExpertFindService(HashMap<String, String> map){

		return dao.listExpertFind(map);
	}
}
