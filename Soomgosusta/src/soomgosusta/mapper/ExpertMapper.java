package soomgosusta.mapper;

import soomgosusta.domain.Expert;
import soomgosusta.domain.Expert_Profile;

public interface ExpertMapper {

	int registerExpert(Expert expert);
	Expert expertLogin(String id);
	int profileUpdate(Expert_Profile profile);
	Expert_Profile profileDetail(String expert_Id);
	Expert expertDetail(String expert_Id);

}
