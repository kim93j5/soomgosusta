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
    HashMap<String, String> requestMap = null;

    
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
			list = dao.listAnswer(q_List.get(i).getQ_Code());
			
			for(int j=0; j<list.size(); j++){
				answerList.add(list.get(j));
			}
		}
		
		return answerList;
	}
	
	public int insertRequestService(String member_Id, String searchCode, String requestQnA) throws Exception{
        String[] qna = requestQnA.split(",");
  		requestMap = new HashMap<String, String>();
        String col = "";
  		
        requestMap.put("member_Id", member_Id);
        requestMap.put("searchCode", searchCode);
                
     	for(int i=0; i < qna.length; i++){
			col= "r_qa_" + (i+1);
			qna[i] = qna[i].substring(0, qna[i].length()-1);
			requestMap.put(col, qna[i]);
		}
     	
        if(qna.length < 15){
        	for(int i=qna.length; i < 15; i++){
        		col = "r_qa_" + (i+1);
        		requestMap.put(col, "null");
        	}
        }
        		
		return dao.insertRequest(requestMap);
	}

	public int updateLogRequestService(String searchCode) throws Exception{
		
		return dao.updateLogRequest(searchCode);
	}
}
