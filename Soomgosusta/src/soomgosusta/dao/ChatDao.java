package soomgosusta.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import soomgosusta.domain.Chat;
import soomgosusta.domain.Esend;
import soomgosusta.mapper.ChatMapper;



public class ChatDao {

	private static ChatDao dao = new ChatDao();
	
	public static ChatDao getInstance(){
		return dao;
	}

	public SqlSessionFactory getSqlSessionFactory(){
		String resource = "mybatis-config.xml";
		InputStream in = null;
		
		try{
			in = Resources.getResourceAsStream(resource);
		}catch (Exception e){
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(in);
	}

	public int insertChat(Chat chat) {
		int re = -1;
		
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try { 
			re= sqlSession.getMapper(ChatMapper.class).insertChat(chat);
			if(re > 0){
				sqlSession.commit();
			}else{
				sqlSession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession != null ){
				sqlSession.close();
			}
		}
		return re;
	}

	public List<Chat> chatList(Esend esend) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Chat> chatList = null;
		try {
			chatList = sqlSession.getMapper(ChatMapper.class).chatList(esend);
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlSession != null){
				sqlSession.close();
			}
		}
		return chatList;
	}

	
}
