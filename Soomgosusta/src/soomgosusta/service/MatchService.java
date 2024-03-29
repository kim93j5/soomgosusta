package soomgosusta.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import soomgosusta.dao.MatchDao;
import soomgosusta.domain.Esend;
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
	public Request requestMemberService(String member_Id,String member_Code){
		System.out.println(member_Id+"dfsdfsdfd");
		System.out.println(member_Code+"SDfsdfsdf");
		return dao.memberRequest(member_Id,member_Code);
	}
	public int matchTableInsertService(Match match){
		return dao.matchTableInsert(match);
	}
	public List<Match> matchService(HttpSession session) throws Exception {
		
		String login_Session = (String) session.getAttribute("id");
		
	
		List <Match> matchList = dao.matchList(login_Session);
		
		return matchList;  
	}

	public Match detailService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("utf-8");
		
		Esend esend = new Esend();
		esend.setE_id(request.getParameter("e_id"));
		esend.setM_id(request.getParameter("id"));
		System.out.println(esend.getE_id());
		System.out.println(esend.getM_id());
		return dao.detailMatch(esend);
	}
	
	public int matchUpdateService(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		Esend esend = new Esend();
		esend.setE_id(request.getParameter("expert_id"));
		esend.setM_id(request.getParameter("member_id"));
		
		return dao.updateMatch(esend);
		
		
	}

	public int matchLogUpdate(Category_Log category_log){
		return dao.matchLogUpdate(category_log);
	}
	public Expert expertGenderService(String expert_Id){
		return dao.expertGender(expert_Id);
	}
}
