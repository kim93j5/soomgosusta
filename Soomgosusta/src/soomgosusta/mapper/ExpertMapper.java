package soomgosusta.mapper;

import java.util.HashMap;
import java.util.List;

import soomgosusta.domain.Expert;
import soomgosusta.domain.Expert_FindInfo;

public interface ExpertMapper {

	int registerExpert(Expert expert);

	Expert expertLogin(String id);
	List<Expert_FindInfo> listExpertFind(HashMap<String, String> map);
}
