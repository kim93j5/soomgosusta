package soomgosusta.mapper;

import java.util.HashMap;
import java.util.List;

import soomgosusta.domain.Answer;
import soomgosusta.domain.Question;

public interface RequestMapper {
	List<Question> listQuestion(HashMap<String, String> map);
	List<Answer> listAnswer(String question_Code);
}
