package soomgosusta.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import soomgosusta.dao.RequestDao;
import soomgosusta.domain.Answer;
import soomgosusta.domain.Question;

public class RequestService {
	private static RequestService service = new RequestService();
	private static RequestDao dao;
	
	public static RequestService getInstance() {
		dao= RequestDao.getInstance();
		return service;
	}
	
	public List<Question> listQuestionService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("utf-8");
		List<Question> list = null;
		HashMap<String, String> map = new HashMap<String, String>();
		
		String searchCode = request.getParameter("searchCode");
		
		
		map.put("question_Code1", searchCode.substring(0, 2)+"_CQ%");
		map.put("question_Code2", searchCode+"_%");
		map.put("question_Code3", "CQ%");
		
		list = dao.listQuestion(map);
			
		return list;
	}
	
	public List<Answer> listAnswerService(List<Question> q_List) throws Exception{
		List<Answer> list = null;
		List<Answer> answerList = new ArrayList<Answer>();
		
		for(int i=0; i<q_List.size(); i++){
			list = dao.listAnswer(q_List.get(i).getQuestion_Code());
			for(int j=0; j<list.size(); j++){
				answerList.add(list.get(j));
			}
		}
		
		return answerList;
	}
}
