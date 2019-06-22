package soomgosusta.service;

import javax.servlet.http.HttpServletRequest;

import soomgosusta.dao.RequestDao;
import soomgosusta.domain.Request;

public class RequestService {
	private static RequestService service = new RequestService();
	private static RequestDao r_dao;

	public static RequestService getInstance() {
		r_dao = RequestDao.getInstance();
		return service;
	}

	public Request sendRequestService(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("utf-8");

		return r_dao.sendRequestInfo();
	}

}
