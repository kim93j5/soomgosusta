package soomgosusta.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import soomgosusta.domain.Category;
import soomgosusta.domain.Member;
import soomgosusta.domain.Member_Information;
import soomgosusta.mapper.MemberMapper;

public class MemberDao {
	private static MemberDao dao = new MemberDao();
	
	public static MemberDao getInstance() {
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
	
	public int addMemberInterest(Member_Information member_information){
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
<<<<<<< HEAD
			re = sqlSession.getMapper(MemberMapper.class).addMemberInterest(member_information);
=======
			re = sqlSession.getMapper(MemberMapper.class).registerMember(member);
			
>>>>>>> branch 'master' of https://github.com/kim93j5/soomgosusta.git
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

	
	public List<Category> categoryCode(){
		
		SqlSession sqlsession = getSqlSessionFactory().openSession();
		List<Category> categoryList = null;
		try {
			categoryList = sqlsession.getMapper(MemberMapper.class).categoryCode();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlsession != null){
				sqlsession.close();
			}
		}
		return categoryList;
	}
	
	public Member login(String id) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		System.out.println("dao "+ id);
		
		
		Member member = null;
		
		try {
			member = (Member)sqlSession.getMapper(MemberMapper.class).login(id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		
		return member;
	}
	
}
	
