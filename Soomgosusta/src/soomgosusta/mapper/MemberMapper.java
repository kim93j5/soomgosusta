package soomgosusta.mapper;

import java.util.List;

import soomgosusta.domain.Category;
import soomgosusta.domain.Member_Information;

public interface MemberMapper {
<<<<<<< HEAD
	int registerMember(Member member);

	Member login(String id);

=======
	int addMemberInterest(Member_Information member_information);
	List<Category> categoryCode();
>>>>>>> branch 'kwon0316' of https://github.com/kim93j5/soomgosusta.git
}
