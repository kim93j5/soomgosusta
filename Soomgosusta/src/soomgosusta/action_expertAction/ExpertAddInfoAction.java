package soomgosusta.action_expertAction;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Category;
import soomgosusta.domain.Expert_Information;
import soomgosusta.service.ExpertService;

public class ExpertAddInfoAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ExpertService service = ExpertService.getInstance();
		ActionForward forward = new ActionForward();

		request.setCharacterEncoding("utf-8");

		List<Category> categoryList = service.categoryListService(request);

		String[] expert_Interest3 = request.getParameterValues("category3");
		String str = "";

		for (int i = 0; i < expert_Interest3.length; i++) {
			for (int j = 0; j < categoryList.size(); j++) {
				if (categoryList.get(j).getC_Word().contains(expert_Interest3[i])) {
					str += categoryList.get(j).getC_Code();
					service.updateRegisterLogService(categoryList.get(j).getC_Code());
					
					if (i != expert_Interest3.length - 1) {
						str += "/";
					}
				}
			}
		}


		/////////////// 활동범위//////////////////

		String[] district_Sido = request.getParameterValues("sido");
		String[] district_Sigungu = request.getParameterValues("sigungu");
		String[] district = new String[3];
		String sub_ei_District = "";
		String ei_District = "";

		for (int i = 0; i < district_Sido.length; i++) {
			district[i] = district_Sido[i] + "/" + district_Sigungu[i];
			if (!district[i].equals("시/도 선택/")) {
				sub_ei_District += district[i];
				sub_ei_District += ",";
			}
		}

		ei_District = sub_ei_District.substring(0, sub_ei_District.length() - 1);

		//////////////////////////////////////////////////////

		String[] q_Code = request.getParameterValues("q_Code");
		String[] a_Code = request.getParameterValues("a_Code");
		String[] requestQnA = new String[3];
		String requestQ1_A = "";
		String requestQ2_A = "";
		String requestQ3_A = "";

		for (int i = 0; i < q_Code.length; i++) {
			requestQnA[i] = q_Code[i] + "/";

			for (int j = 0; j < a_Code.length; j++) {
				if (q_Code[i].equals(a_Code[j].substring(0, a_Code[j].indexOf('A') - 1))) {
					requestQnA[i] += a_Code[j] += "/";
				}
			}
		}

		requestQ1_A = requestQnA[0];
		requestQ2_A = requestQnA[1];
		requestQ3_A = requestQnA[2];

		String requestQ1_A_sub = requestQ1_A.substring(0, requestQ1_A.length() - 1);
		String requestQ2_A_sub = requestQ2_A.substring(0, requestQ2_A.length() - 1);
		String requestQ3_A_sub = requestQ3_A.substring(0, requestQ3_A.length() - 1);

		System.out.println(requestQ1_A_sub);
		System.out.println(requestQ2_A_sub);
		System.out.println(requestQ3_A_sub);

		
		Expert_Information expert_Info = new Expert_Information();

		expert_Info.setInfor_Expert_Id(request.getParameter("id"));
		expert_Info.setEi_Day(requestQ1_A_sub);
		expert_Info.setEi_Time(requestQ2_A_sub);
		expert_Info.setEi_Start(requestQ3_A_sub);
		expert_Info.setC_Code(str);
		expert_Info.setEi_District(ei_District);

		service.insertExpertSumService(expert_Info);

		forward.setPath("/ExpertAddInfoForm.jsp");
		forward.setRedirect(false);

		return forward;
	}

}
