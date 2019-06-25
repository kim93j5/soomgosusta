package soomgosusta.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import soomgosusta.domain.Esend;
import soomgosusta.domain.Category_Log;
import soomgosusta.domain.Expert;
import soomgosusta.domain.Expert_Information;
import soomgosusta.domain.Match;
import soomgosusta.domain.Request;

public interface MatchMapper {
	List<Expert_Information> matchCandidateList(String request_C_Code);
	Request memberRequest(@Param("request_Member_Id") String request_Member_Id,@Param("request_C_Code") String request_C_Code);
	int matchTableInsert(Match match);
	List<Match> matchList(String login_Session);
	Match detailMatch(String id);
	int updateMatch(Esend esend);
	int matchLogUpdate(Category_Log category_log);
	Expert expertGender(String expert_Id);
}