package soomgosusta.mapper;

import soomgosusta.domain.Expert;

public interface ExpertMapper {

	int registerExpert(Expert expert);

	Expert expertLogin(String id);

}
