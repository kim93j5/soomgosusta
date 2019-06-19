package soomgosusta.mapper;

import java.util.List;

import soomgosusta.domain.Category;
import soomgosusta.domain.Member_Information;

public interface MemberMapper {
	int addMemberInterest(Member_Information member_information);
	List<Category> categoryCode();
}
