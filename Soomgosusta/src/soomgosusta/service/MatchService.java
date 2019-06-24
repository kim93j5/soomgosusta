package soomgosusta.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import soomgosusta.dao.MatchDao;
import soomgosusta.domain.Category_Log;
import soomgosusta.domain.Expert;
import soomgosusta.domain.Expert_Information;
import soomgosusta.domain.Match;
import soomgosusta.domain.Request;

public class MatchService {
	private static MatchService service = new MatchService();
	private static MatchDao dao;
	
	public static MatchService getInstance() {
		dao= MatchDao.getInstance();
		return service;
	}
	
	public List<Expert_Information> matchCandidateListService (String request_C_Code){
		return dao.matchCandidateList(request_C_Code);
	}
	public Request requestMemberService(HttpServletRequest request){
		return dao.memberRequest();
	}
	public int matchTableInsertService(Match match){
		return dao.matchTableInsert(match);
	}
	public int matchLogUpdate(Category_Log category_log){
		return dao.matchLogUpdate(category_log);
	}
	public Expert expertGenderService(String expert_Id){
		return dao.expertGender(expert_Id);
	}
}
