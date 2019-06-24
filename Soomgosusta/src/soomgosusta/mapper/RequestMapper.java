package soomgosusta.mapper;

import java.util.HashMap;
import java.util.List;

import soomgosusta.domain.Answer;
import soomgosusta.domain.Question;
import soomgosusta.domain.Request;

public interface RequestMapper {
	List<Question> listQuestion(HashMap<String, String> map);
	List<Answer> listAnswer(String question_Code);
	int insertRequest(HashMap<String, String> requestMap);
	int updateLogRequest(String searchCode);
	List<Request> listAlreadySend(HashMap<String, String> map);   
	Request sendRequestInfo();
	Request detailRequest(String id);
}
