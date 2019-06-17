package soomgosusta.mapper;

import soomgosusta.domain.Member;

public interface MemberMapper {
	int registerMember(Member member);

	Member login(String id);

}
