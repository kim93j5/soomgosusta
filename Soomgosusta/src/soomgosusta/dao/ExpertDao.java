package soomgosusta.dao;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import soomgosusta.domain.Expert;
import soomgosusta.domain.Member;
import soomgosusta.mapper.ExpertMapper;
import soomgosusta.mapper.MemberMapper;

public class ExpertDao {
	private static ExpertDao dao = new ExpertDao();
	
	public static ExpertDao getInstance() {
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
	
	public int registerExpert(Expert expert ) {
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			re = sqlSession.getMapper(ExpertMapper.class).registerExpert(expert);
			
		if(re>0) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return re;
	}
	
	public Expert expertLogin(String id) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		System.out.println("dao "+ id);
		
		
		Expert expert = null;
		
		try {
			expert = (Expert)sqlSession.getMapper(ExpertMapper.class).expertLogin(id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		
		return expert;
	}

	
	
}
	
