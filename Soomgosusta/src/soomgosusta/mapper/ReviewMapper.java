package soomgosusta.mapper;

import java.util.List;

import soomgosusta.domain.Review;

public interface ReviewMapper {
	List<Review> detailAvgStarPoint(String searchId);
	int insertReview(Review review);
	List<Review> reviewList(String review_Expert_Id);
}
