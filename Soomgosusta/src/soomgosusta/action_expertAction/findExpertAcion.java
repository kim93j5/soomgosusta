package soomgosusta.action_expertAction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Expert_FindInfo;
import soomgosusta.domain.Review;
import soomgosusta.service.ExpertService;
import soomgosusta.service.ReviewService;

public class findExpertAcion implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		ExpertService service = ExpertService.getInstance();
		ReviewService r_service = ReviewService.getInstance();
		
		String district = request.getParameter("sido");
		String gugun = request.getParameter("gugun");
		String category = request.getParameter("service");
		String categoryInfo = request.getParameter("serviceInfo");
		
		request.setAttribute("category", category);
		request.setAttribute("district", district);
		
		HashMap<String, String> findInfo = new HashMap<String, String>();

		if(!district.equals("지역 전체") && !gugun.equals("전체")){
			district += "/"+gugun;
			request.setAttribute("district", district);			
			findInfo.put("district", "%" + district + "%");
		}else if(!district.equals("지역 전체")){
			request.setAttribute("district", district);			
			findInfo.put("district", "%" + district + "%");
		}else{
			request.setAttribute("district", district);
			findInfo.put("district", "%");
		}
		
		if(!category.equals("분야 전체") && !categoryInfo.equals("전체")){
			category += "/"+categoryInfo;
			request.setAttribute("category", category);

			findInfo.put("category", "%" + category + "%");
		}else if(!category.equals("분야 전체")){
			request.setAttribute("category", category);
			findInfo.put("category", "%" + category + "%");
		}else{
			request.setAttribute("category", category);

			findInfo.put("category", "%");
		}
		
		List<Expert_FindInfo> listFindInfo = service.listExpertFindService(findInfo);		

		for(int i=0; i < listFindInfo.size(); i++){
			List<Review> listReview = r_service.detailAvgStarPointService(listFindInfo.get(i).getEf_Id());
			double avg_starPoint=0;
			int cnt_Review=0;
			
			if(listReview.size() == 0){
				listFindInfo.get(i).setEf_Cnt_Review(0);
				listFindInfo.get(i).setEf_Avg_StarPoint(0);
			}else{
				cnt_Review = listReview.size();
				listFindInfo.get(i).setEf_Cnt_Review(cnt_Review);
				for(int j=0; j<listReview.size(); j++){
					avg_starPoint += listReview.get(j).getReview_StarPoint();
				}
				listFindInfo.get(i).setEf_Avg_StarPoint(avg_starPoint/cnt_Review);
			}
		}
		
		request.setAttribute("listFindInfo", listFindInfo);
		
		forward.setRedirect(false);
		forward.setPath("findExpertForm.jsp");
		
		return forward;
	}

}
