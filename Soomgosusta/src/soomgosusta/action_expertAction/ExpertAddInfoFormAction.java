package soomgosusta.action_expertAction;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Answer;
import soomgosusta.domain.Category;
import soomgosusta.domain.Question;
import soomgosusta.service.ExpertService;

public class ExpertAddInfoFormAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		ExpertService service = ExpertService.getInstance();
		
		List<Category> categoryList = service.categoryListService(request);
		List<String> list1 = new ArrayList<String>(); // [레슨,레슨,레슨,레슨]
		List<String> list2 = new ArrayList<String>(); // [학업,학업,악기,악기]
		List<String> list3 = new ArrayList<String>(); // [외국어,논술,가야금,거문고]
		List<String> categoryList1 = new ArrayList<String>(); // [레슨]
		List<String> categoryList2 = new ArrayList<String>(); // [학업,악기]
		List<String> categoryList3_1 = new ArrayList<String>(); // [외국어,논술]
		List<String> categoryList3_2 = new ArrayList<String>(); // [가야금,거문고]
		String expert_Id = request.getParameter("expert_Id");
		request.setAttribute("id", expert_Id);
		
		for (int i = 0; i < categoryList.size(); i++) {
			String groupList = categoryList.get(i).getC_Word();
			if (groupList.contains("레슨/학업")) {
				String groupArr2[] = groupList.split("/");
				// groupArr2[0]=레슨,groupArr2[1]=학업,groupArr2[2]=외국어
				categoryList3_1.add(groupArr2[2]); // 외국어만 categoryList3_1에 넣어줌
			} else if (groupList.contains("레슨/악기")) {
				String groupArr2[] = groupList.split("/");
				categoryList3_2.add(groupArr2[2]);
			}

			String groupArr[] = groupList.split("/");

			
			list1.add(groupArr[0]);
			list2.add(groupArr[1]);
			list3.add(groupArr[2]);
		}

		for (int i = 0; i < list1.size(); i++) {
			if (!categoryList1.contains(list1.get(i))) {
				categoryList1.add(list1.get(i));
			}
		} // 레슨 중복제거
		for (int i = 0; i < list2.size(); i++) {
			if (!categoryList2.contains(list2.get(i))) {
				categoryList2.add(list2.get(i));
			}
		} // 학업,악기 중복제거

		request.setAttribute("categoryList1", categoryList1);
		request.setAttribute("categoryList2", categoryList2);
		request.setAttribute("categoryList3_1", categoryList3_1);
		request.setAttribute("categoryList3_2", categoryList3_2);

		request.setAttribute("categoryList1", categoryList1);
		request.setAttribute("categoryList2", categoryList2);
		request.setAttribute("categoryList3_1", categoryList3_1);
		request.setAttribute("categoryList3_2", categoryList3_2);

		String id = request.getParameter("id");
		request.setAttribute("id", id);
////////////////////////////////////////////////////////////////////////////////
		
		List<Question> questionList = service.qInfoService(request);
		request.setAttribute("questionList", questionList);
		//System.out.println("질문");
		//System.out.println(questionList);

		List<Answer> answerList = service.aInfoService(request);
		request.setAttribute("answerList", answerList);
		//System.out.println("답");
		//System.out.println(answerList);
		
		request.setAttribute("id",request.getParameter("id"));
		
		
		forward.setPath("/ExpertAddInfoForm.jsp");
		forward.setRedirect(false);
		
		return forward;

	}

}
