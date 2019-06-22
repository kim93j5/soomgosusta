package soomgosusta.service;

import java.util.List;

import soomgosusta.dao.ReviewDao;
import soomgosusta.domain.Review;

public class ReviewService {
	private static ReviewService service = new ReviewService();
	   private static ReviewDao dao;
	   
	   public static ReviewService getInstance(){
	      dao = ReviewDao.getInstance();
	      return service;
	   }
	   
	   public List<Review> detailAvgStarPointService(String searchId) throws Exception{
		   
		   return dao.detailAvgStarPoint(searchId);
	   }
}
