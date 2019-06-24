package soomgosusta.mapper;

import java.util.HashMap;
import java.util.List;
import soomgosusta.domain.Expert;
import soomgosusta.domain.Expert_Profile;
import soomgosusta.domain.Expert_Profile_License;
import soomgosusta.domain.Expert_FindInfo;
import soomgosusta.domain.Answer;
import soomgosusta.domain.Category;
import soomgosusta.domain.Expert_Information;
import soomgosusta.domain.Question;


public interface ExpertMapper {

	int registerExpert(Expert expert);
	Expert expertLogin(String id);
	int profileUpdate(Expert_Profile profile);
	Expert_Profile profileDetail(String expert_Id);
	Expert expertDetail(String expert_Id);
	List<Expert_FindInfo> listExpertFind(HashMap<String, String> map);
	
   List<Category> categoryCode();	
   List<Question> q_Info();
   List<Answer> a_Info();
 
   int insertExpertSum(Expert_Information expert_Info);
   int updateRegisterLog(String searchCode);
   int updateLicenseImg(Expert_Profile_License epl);
   Expert_Profile_License licenseDetail(String epl_Expert_Id);
}
