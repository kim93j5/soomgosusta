package soomgosusta.mapper;

import java.util.List;

import soomgosusta.domain.Expert_Information;
import soomgosusta.domain.Match;
import soomgosusta.domain.Request;

public interface MatchMapper {
	List<Expert_Information> matchCandidateList(String request_C_Code);
	Request memberRequest(String member_id);
	int matchTableInsert(Match match);
	
}
