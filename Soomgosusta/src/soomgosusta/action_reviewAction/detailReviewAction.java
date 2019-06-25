package soomgosusta.action_reviewAction;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Review;
import soomgosusta.service.ReviewService;

public class detailReviewAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		ReviewService service = ReviewService.getInstance();
		List<Review> reviewList=service.reviewListService(request);
		
		request.setAttribute("reviewList",reviewList);
		
		forward.setRedirect(false);
		forward.setPath("expertProfile.jsp");
		return forward;
	}

}
