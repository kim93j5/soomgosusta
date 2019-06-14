package soomgosusta.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import soomgosusta.dao.CategoryDao;
import soomgosusta.domain.Category;

public class CategoryService {
	private static CategoryService service = new CategoryService();
	private static CategoryDao dao;
	
	public static CategoryService getInstance(){
		dao = CategoryDao.getInstance();
		return service;
	}
	
	public List<Category> listPopularService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("utf-8");
		List<Category> list = null;
		
		list = dao.listPopular();
		
		return list;
	}
}
