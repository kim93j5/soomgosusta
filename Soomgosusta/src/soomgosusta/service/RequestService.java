package soomgosusta.service;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import soomgosusta.dao.RequestDao;
import soomgosusta.domain.Request;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import soomgosusta.dao.RequestDao;
import soomgosusta.domain.Answer;
import soomgosusta.domain.Question;
import soomgosusta.domain.Request;

public class RequestService {
	private static RequestService service = new RequestService();
	private static RequestDao dao;
	HashMap<String, String> requestMap = null;

	public static RequestService getInstance() {
		dao = RequestDao.getInstance();
		return service;
	}

	public Request sendRequestService(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("utf-8");

		return dao.sendRequestInfo();
	}

	public int updateLogRequestService(String searchCode) throws Exception {

		return dao.updateLogRequest(searchCode);
	}

	public int listAlreadySendService(HashMap<String, String> map) throws Exception {
		List<Request> list = dao.listAlreadySend(map);

		return list.size();
	}

	public int insertRequestService(String member_Id, String searchCode, String requestQnA, String dist) throws Exception {
		String[] qna = requestQnA.split(",");
		requestMap = new HashMap<String, String>();
		String col = "";

		requestMap.put("member_Id", member_Id);
		requestMap.put("searchCode", searchCode);
		dist = dist.substring(0, dist.length()-1);
		
		System.out.println(dist);
		for (int i = 0; i <= qna.length; i++) {
			col = "r_qa_" + (i + 1);
			if(i == qna.length) {
				requestMap.put(col, dist);
				break;
			}
			
			qna[i] = qna[i].substring(0, qna[i].length() - 1);
			requestMap.put(col, qna[i]);
		}

		for (int i = qna.length+1; i < 15; i++) {
			col = "r_qa_" + (i + 1);
			requestMap.put(col, "null");
		}

		return dao.insertRequest(requestMap);
	}

	public List<Question> listQuestionService(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("utf-8");
		List<Question> list = null;
		HashMap<String, String> map = new HashMap<String, String>();

		String searchCode = request.getParameter("searchCode");

		map.put("question_Code1", searchCode.substring(0, 2) + "_CQ%");
		map.put("question_Code2", searchCode + "_%");
		map.put("question_Code3", "CQ%");

		list = dao.listQuestion(map);

		return list;
	}

	public List<Answer> listAnswerService(List<Question> q_List) throws Exception {
		List<Answer> list = null;
		List<Answer> answerList = new ArrayList<Answer>();

		for (int i = 0; i < q_List.size(); i++) {
			list = dao.listAnswer(q_List.get(i).getQ_Code());

			for (int j = 0; j < list.size(); j++) {
				answerList.add(list.get(j));
			}
		}

		return answerList;
	}

	public int listEmploymentLog(String searchKey) {

		return dao.listEmploymentLog(searchKey);
	}

}
