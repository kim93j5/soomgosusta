package soomgosusta.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import soomgosusta.dao.ReviewDao;
import soomgosusta.domain.Review;

public class ReviewService {
	private static ReviewService service = new ReviewService();
	private static ReviewDao dao;

	public static ReviewService getInstance() {
		dao = ReviewDao.getInstance();
		return service;
	}

	public List<Review> detailAvgStarPointService(String searchId) throws Exception {
		return dao.detailAvgStarPoint(searchId);
	}

	public int insertReviewService(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("utf-8");
		Review review = new Review();

		review.setMember_Id(request.getParameter("member_Id"));
		review.setReview_Contents(request.getParameter("review_Contents"));
		int starPoint = Integer.parseInt(request.getParameter("review_StarPoint"));
		review.setReview_StarPoint(starPoint);
		review.setReview_Expert_Id(request.getParameter("review_Expert_Id"));

		System.out.println("review  " + review);
		return dao.insertReview(review);
	}

	public List<Review> reviewListService(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("utf-8");
		String review_Expert_Id=request.getParameter("expert_Id");
		List<Review> reviewList = dao.reviewList(review_Expert_Id);
		return reviewList;
	};

	
}
