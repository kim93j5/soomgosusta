package soomgosusta.dao;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import soomgosusta.domain.Member_Information;
import soomgosusta.mapper.MemberMapper;

public class MemberMainDao {
	private static MemberMainDao m_dao = new MemberMainDao();
	
	public static MemberMainDao getInstance() {
		return m_dao;
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
	
	public Member_Information recommendInfo() {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
	    Member_Information member_info = null;
		try {
			member_info = sqlSession.getMapper(MemberMapper.class).recommendInfo();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}

		return member_info;
	}
	

	
}
	
