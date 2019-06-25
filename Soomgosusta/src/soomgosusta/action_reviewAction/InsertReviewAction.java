package soomgosusta.action_reviewAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Review;
import soomgosusta.service.ReviewService;

public class InsertReviewAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward= new ActionForward();
		ReviewService service = ReviewService.getInstance();
		service.insertReviewService(request);
		
		
		
		forward.setRedirect(true);
		forward.setPath("detailReview.do?expert_Id="+request.getParameter("review_Expert_Id"));
//		forward.setPath("detailReview.do");
		return forward;
	}

}
