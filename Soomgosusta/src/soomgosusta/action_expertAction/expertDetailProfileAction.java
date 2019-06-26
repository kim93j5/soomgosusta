package soomgosusta.action_expertAction;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Expert;
import soomgosusta.domain.Expert_Profile;
import soomgosusta.domain.Expert_Profile_License;
import soomgosusta.domain.Review;
import soomgosusta.service.ExpertService;
import soomgosusta.service.MemberService;
import soomgosusta.service.ReviewService;

public class expertDetailProfileAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		ExpertService service = ExpertService.getInstance();
		ExpertService service2 = ExpertService.getInstance();
		ReviewService service3 = ReviewService.getInstance();
		
		
		List<Review> reviewList;
		reviewList=service3.reviewListService(request);
		

		Expert_Profile profile;
		profile = service.profileDetailService(request);
		
		Expert expert;
		expert = service2.expertDetailService(request);
		
		Expert_Profile_License	epl;
		epl= service.LicenseDetailService(request);
		
		request.setAttribute("reviewList",reviewList);
		request.setAttribute("profile",profile);
		request.setAttribute("expert",expert);
		request.setAttribute("epl", epl);
		
		forward.setRedirect(false);
		forward.setPath("expertProfile.jsp");
		return forward;
	}

}
