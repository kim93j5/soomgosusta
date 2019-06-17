package soomgosusta.dao;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import soomgosusta.domain.Answer;
import soomgosusta.domain.Question;
import soomgosusta.mapper.MemberMapper;
import soomgosusta.mapper.RequestMapper;

public class RequestDao {
private static RequestDao dao = new RequestDao();
	
	public static RequestDao getInstance() {
		return dao;
	}
	
	public SqlSessionFactory getSqlSessionFactory() {
		String resource ="mybatis-config.xml";
		InputStream in = null;
		
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new SqlSessionFactoryBuilder().build(in);

	
	}
	
	public List<Question> listQuestion(HashMap<String, String> map) throws Exception{
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Question> list = null;
		
		try {
			list = sqlSession.getMapper(RequestMapper.class).listQuestion(map);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		
		return list;
	}
	
	public List<Answer> listAnswer(String question_Code) throws Exception{
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Answer> list = null;
		
		try {
			list = sqlSession.getMapper(RequestMapper.class).listAnswer(question_Code);

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
	
		return list;
	}
}
