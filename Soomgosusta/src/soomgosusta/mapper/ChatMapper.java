package soomgosusta.mapper;

import java.util.List;

import soomgosusta.domain.Chat;
import soomgosusta.domain.Esend;



public interface ChatMapper {

	int insertChat(Chat chat);

	List<Chat> chatList(Esend esend);

	Chat chatDetail(Chat chat);



}
