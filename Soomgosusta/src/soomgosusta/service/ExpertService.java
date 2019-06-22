package soomgosusta.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import soomgosusta.dao.ExpertDao;
import soomgosusta.domain.Answer;
import soomgosusta.domain.Category;
import soomgosusta.domain.Expert_Information;
import soomgosusta.domain.Question;

public class ExpertService {
	private static ExpertService service = new ExpertService();
	private static ExpertDao e_dao;

	public static ExpertService getInstance() {
		e_dao = ExpertDao.getInstance();

		return service;
	}

	public List<Category> categoryListService(HttpServletRequest request) throws Exception {

		return e_dao.categoryCode();
	}

	public List<Question> qInfoService(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("utf-8");

		return e_dao.q_Info();
	}

	public List<Answer> aInfoService(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("utf-8");

		return e_dao.a_Info();
	}

	public int insertExpertSumService(Expert_Information expert_Info) throws Exception {

		return e_dao.insertExpertSum(expert_Info);

	}
}
