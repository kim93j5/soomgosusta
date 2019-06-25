package soomgosusta.action_memberAction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Category_Log;
import soomgosusta.domain.Expert;
import soomgosusta.domain.Expert_Information;
import soomgosusta.domain.Match;
import soomgosusta.domain.Request;
import soomgosusta.service.MatchService;

public class MatchCalculateAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MatchService service = MatchService.getInstance();
		String member_Id = request.getParameter("member_Id");
		Request requestedMember = service.requestMemberService(member_Id);
		System.out.println(requestedMember);
		List<String> memberRequest = new ArrayList<String>();
		memberRequest.add(requestedMember.getR_QA_01()); // Q_Day/Q_Day_A3/Q_Day_A5
		memberRequest.add(requestedMember.getR_QA_02()); // Q_Time/Q_Time_A4/Q_Time_A5/Q_Time_A6
		memberRequest.add(requestedMember.getR_QA_03()); // Q_Start/Q_Start_A3
		memberRequest.add(requestedMember.getR_QA_04()); // 서울특별시/종로구,서울특별시/중구,서울특별시/성북구
		memberRequest.add(requestedMember.getR_QA_05());
		memberRequest.add(requestedMember.getR_QA_06());
		memberRequest.add(requestedMember.getR_QA_07());
		memberRequest.add(requestedMember.getR_QA_08());
		memberRequest.add(requestedMember.getR_QA_09());
		memberRequest.add(requestedMember.getR_QA_10());
		memberRequest.add(requestedMember.getR_QA_11());
		memberRequest.add(requestedMember.getR_QA_12());
		memberRequest.add(requestedMember.getR_QA_13());
		memberRequest.add(requestedMember.getR_QA_14());
		memberRequest.add(requestedMember.getR_QA_15());

		String request_C_Code = requestedMember.getRequest_C_Code();

		List<Expert_Information> matchCandidateList = service.matchCandidateListService(request_C_Code);

		for (int i = 0; i < matchCandidateList.size(); i++) {
			System.out.println(matchCandidateList.get(i));
		}

		String qDay = "";
		String qTime = "";
		String qstart = "";
		String qdistrict = "";
		String qGender = "";

		List<String> compareMember = new ArrayList<String>();

		for (int i = 0; i < 15; i++) {
			memberRequest.remove("null");
		}

		for (int i = 0; i < memberRequest.size(); i++) {
			String qCode = memberRequest.get(i);
			if (qCode.contains("CQ1")) {
				qDay = qCode;
				String groupArr2[] = qDay.split("/");
				for (int j = 1; j < groupArr2.length; j++) {
					compareMember.add(groupArr2[j]);
				}
			} else if (qCode.contains("CQ2")) {
				qTime = qCode;
				String groupArr2[] = qTime.split("/");
				for (int j = 1; j < groupArr2.length; j++) {
					compareMember.add(groupArr2[j]);
				}
			} else if (qCode.contains("CQ3")) {
				qstart = qCode;
				String groupArr2[] = qstart.split("/");
				for (int j = 1; j < groupArr2.length; j++) {
					compareMember.add(groupArr2[j]);
				}
			} else if (qCode.contains("Dis")) {
				qdistrict = qCode;
				String groupArr2[] = qdistrict.split("/");
				for (int j = 0; j < groupArr2.length; j++) {
					compareMember.add(groupArr2[j]);
				}
			} else if (qCode.contains("Gen")) {
				String groupArr2[] = qCode.split("/");
				qGender = groupArr2[1];
			}
		}
		System.out.println(qDay);
		System.out.println(qTime);
		System.out.println(qstart);
		System.out.println(compareMember);

		int compareMemberScore = compareMember.size() * 100;

		for (int i = 0; i < matchCandidateList.size(); i++) {// 5번 돌아감
			List<String> compareExpert = new ArrayList<String>();
			int matchScore = 0;
			String expertId = matchCandidateList.get(i).getInfor_Expert_Id();
			String expertDay = matchCandidateList.get(i).getEi_Day(); // 0번에 있는 yena2, ei_Day깂인 Q_Day/Q_Day_A3/Q_Day_A5가 들어옴
			String expertTime = matchCandidateList.get(i).getEi_Time(); // 0번에 있는 yena2, ei_Time깂인 Q_Time/Q_Time_A4/Q_Time_A5/Q_Time_A6가 들어옴
			String expertStart = matchCandidateList.get(i).getEi_Start(); // 0번에 있는 yena2,ei_Start깂인 Q_Start/Q_Start_A3가 들어옴
			String expertDistrict = matchCandidateList.get(i).getEi_District(); // 0번에 있는 yena2,ei_District깂인 서울특별시/종로구,서울특별시/중구,서울특별시/성북구3가 들어옴

			Expert expertInfo = service.expertGenderService(expertId);
			String ExpertGender = expertInfo.getE_Gender();

			if (qGender.equals(ExpertGender) || qGender.equals("무관")) {
				String expertArr[] = expertDay.split("/");
				for (int j = 1; j < expertArr.length; j++) {
					compareExpert.add(expertArr[j]);
				}
				String expertArr2[] = expertTime.split("/");
				for (int j = 1; j < expertArr2.length; j++) {
					compareExpert.add(expertArr2[j]);
				}
				String expertArr3[] = expertStart.split("/");
				for (int j = 1; j < expertArr3.length; j++) {
					compareExpert.add(expertArr3[j]);
				}
				String expertArr4[] = expertDistrict.split("/");
				for (int j = 0; j < expertArr4.length; j++) {
					compareExpert.add(expertArr4[j]);
				}

				for (String matchWord : compareMember) {
					if (compareExpert.contains(matchWord)) {
						matchScore += 100;
					}
				}

				System.out.println(compareExpert);
				System.out.println(matchScore);

				float m_Percent = matchScore / compareMemberScore * 100;

				Match insertMatch = new Match();
				insertMatch.setM_Percent(m_Percent);
				insertMatch.setMatch_C_Code(request_C_Code);
				insertMatch.setMatch_Expert_Id(matchCandidateList.get(i).getInfor_Expert_Id());
				insertMatch.setMatch_Member_Id(requestedMember.getRequest_Member_Id());
				insertMatch.setMatch_R_Seq(requestedMember.getR_Seq());

				service.matchTableInsertService(insertMatch);
				Category_Log updateMatch = new Category_Log();
				updateMatch.setLog_c_Code(request_C_Code);
				service.matchLogUpdate(updateMatch);
			}
		}

		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/memberAddInfoForm.jsp");
		return forward;
	}
}
