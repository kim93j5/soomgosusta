package soomgosusta.mapper;

import java.util.List;

import soomgosusta.domain.Answer;
import soomgosusta.domain.Category;

import soomgosusta.domain.Expert_Information;
import soomgosusta.domain.Question;

public interface ExpertMapper {
   List<Category> categoryCode();	
   List<Question> q_Info();
   List<Answer> a_Info();
 
   int insertExpertSum(Expert_Information expert_Info);
}
