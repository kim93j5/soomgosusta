package soomgosusta.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import soomgosusta.dao.MatchDao;
import soomgosusta.domain.Expert_Information;
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
		return dao.MemberRequest();
	}
	
}
