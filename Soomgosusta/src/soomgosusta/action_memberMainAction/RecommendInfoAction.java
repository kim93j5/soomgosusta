package soomgosusta.action_memberMainAction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Category;
import soomgosusta.domain.Member_Information;
import soomgosusta.service.ExpertService;
import soomgosusta.service.MemberService;

public class RecommendInfoAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MemberService service = MemberService.getInstance();
		ExpertService ex_service = ExpertService.getInstance();

		ActionForward forward = new ActionForward();
		request.setCharacterEncoding("utf-8");

		Member_Information recommendCode = service.recommendInfoService(request);

		/////////////////// 카테고리 테이블에서 분야코드, 이미지 가져옴/////////////////
		List<Category> categoryList = ex_service.categoryListService(request);
		List<Category> list_LI = new ArrayList<Category>();
		List<Category> list_LS = new ArrayList<Category>();

		for (int i = 0; i < categoryList.size(); i++) {
			if (categoryList.get(i).getC_Image().contains("LI")) {
				list_LI.add(categoryList.get(i));
			} else if (categoryList.get(i).getC_Image().contains("LS")) {
				list_LS.add(categoryList.get(i));
				
			}

			Collections.shuffle(list_LI);
			Collections.shuffle(list_LS);
		}
		
		// 이용자 부가정보에서 관심분야코드를 "/"기준으로 쪼개고 코드의 앞에 두글자만 따옴.
		// 이용자의 관심분야코드에서 랜덤으로 세개(추천서비스에 보여지는 개수 :3개로 지정했을 때) 추출
		String[] recommendList = recommendCode.getC_Code().split("/");
		String[] randomList = new String[3];
		String tmp;

		for (int i = 0; i < 3; i++) {
			randomList[i] = recommendList[(int) (Math.random() * 4)];
			// System.out.println(randomList[i]);

			for (int j = i - 1; j >= 0; j--) {
				if (randomList[i] == randomList[j]) {
					i--;
					break;
				}

			}
		}
		System.out.println(Arrays.toString(randomList));

		for (String recommend : randomList) {
			tmp = recommend.substring(0, 2);
			// System.out.println(tmp);
		}

		int count_LI = 0;
		int count_LS = 0;
        
		//이용자 부가정보에서 랜덤출력한 요소 중 LI 개수
		for (int i = 0; i < randomList.length; i++) {
			if (randomList[i].contains("LI")) {
				count_LI++;
			}
		}
		
		//카테고리 테이블에서 LI로 시작하는 요소들(위의 개수만큼 추출) 		
		for (int i = 0; i < count_LI; i++) {
			list_LI.get(i).getC_Image();
			
			System.out.println(list_LI);
		}

		//이용자 부가정보에서 랜덤출력한 요소 중 LS개수
		for (int i = 0; i < randomList.length; i++) {
			if (randomList[i].contains("LS")) {
				count_LS++;
			}
		}
		//System.out.println(count_LS);
		
		//카테고리 테이블에서 LS로 시작하는 요소들(위의 개수만큼 추출)
		for (int i = 0; i < count_LS; i++) {
			list_LS.get(i).getC_Image();
			
			System.out.println(list_LS);
		}

		request.setAttribute("randomList", randomList);
		
		forward.setRedirect(false);
		forward.setPath("/RecommendInfoForm.jsp");
		

		return forward;
		
	}

}
