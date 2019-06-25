package soomgosusta.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import soomgosusta.dao.EstimateDao;
import soomgosusta.domain.Esend;
import soomgosusta.domain.Estimate;





public class EstimateService {

	private static EstimateService service = new EstimateService();
	private static EstimateDao dao;
	
	public static EstimateService getInstance(){
		dao = EstimateDao.getInstance();
		
		return service;
	}

	public int estimateInsertService(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		Estimate estimate = new Estimate();
		estimate.setEstimate_R_Seq(Integer.parseInt(request.getParameter("seq")));
		estimate.setEstimate_Member_Id(request.getParameter("member_id"));
		estimate.setEstimate_Expert_Id(request.getParameter("expert_id"));
		estimate.setEstimate_C_Code(request.getParameter("c_code"));
		estimate.setE_Amountpart(request.getParameter("e_amountpart"));
		estimate.setE_Amount(request.getParameter("e_amount"));
		estimate.setE_Contents(request.getParameter("e_contents"));
		
	
		
		return dao.insertEstimate(estimate);
	}



	public List<Estimate> estimateListService(HttpSession session) {
		
		String login_Session = (String) session.getAttribute("id");
		
		List<Estimate> estimateList = dao.estimateList(login_Session);
		
		return estimateList;
	}
	
	public Estimate detailService(HttpServletRequest request) {
		
		Esend esend = new Esend();
		esend.setE_id(request.getParameter("member_id"));
		esend.setM_id(request.getParameter("expert_id"));
		
		Estimate estimateDetail = dao.detailEstimate(esend);
		return estimateDetail;
	}
}
