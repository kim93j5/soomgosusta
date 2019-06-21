package soomgosusta.mapper;

import java.util.List;

import soomgosusta.domain.Category;
import soomgosusta.domain.Member_Information;

public interface MemberMapper {
<<<<<<< HEAD
	int addMemberInterest(Member_Information member_information);
	List<Category> categoryCode();
=======
	int registerMember(Member member);

	Member login(String id);

>>>>>>> branch 'master' of https://github.com/kim93j5/soomgosusta.git
}
