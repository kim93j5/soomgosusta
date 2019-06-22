package soomgosusta.mapper;

import java.util.List;

import soomgosusta.domain.Category;
import soomgosusta.domain.Member;
import soomgosusta.domain.Member_Information;

public interface MemberMapper {

	int registerMember(Member member);

	Member login(String id);


	int addMemberInterest(Member_Information member_information);
	List<Category> categoryCode();
	Member memberMypage(/*String member*/);
	int memberImageUpdate(Member member);
	int memberNameUpdate(Member member);
	int memberPwUpdate(Member member);
	int memberPnumUpdate(Member member);
}
