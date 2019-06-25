package soomgosusta.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import soomgosusta.dao.ChatDao;
import soomgosusta.domain.Chat;
import soomgosusta.domain.Esend;


public class ChatService {

	private static ChatService service = new ChatService();
	private static ChatDao dao;
	
	public static ChatService getInstance(){
		dao = ChatDao.getInstance();
		
		return service;
	}

	public int chatInsertService(HttpServletRequest request) throws Exception {
	
		request.setCharacterEncoding("utf-8");
		
		Chat chat = new Chat();
		chat.setChat_Expert_Id(request.getParameter("expert_id"));
		chat.setChat_Member_Id(request.getParameter("member_id"));
		chat.setChat_Contents(request.getParameter("e_contents"));
		

		return dao.insertChat(chat);
		
	}

	public List<Chat> chatListService(HttpServletRequest request) throws Exception{
		
		
		Esend esend = new Esend();
		esend.setE_id(request.getParameter("expert_id"));
		esend.setM_id(request.getParameter("member_id"));
		
		
		List<Chat> chatList = dao.chatList(esend);
		
		
		return chatList;
		
	}


}
