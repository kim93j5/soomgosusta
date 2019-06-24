package soomgosusta.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import soomgosusta.domain.Category;
import soomgosusta.domain.Expert;
import soomgosusta.domain.Member;
import soomgosusta.domain.Member_Information;
import soomgosusta.mapper.ExpertMapper;
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
			re = sqlSession.getMapper(MemberMapper.class).addMemberInterest(member_information);
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



	public int registerMember(Member member) {
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {

			re = sqlSession.getMapper(MemberMapper.class).registerMember(member);
			
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

	public Expert expertDetail(String expert_Id) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		Expert expert = null;
		System.out.println("DAO"+expert_Id);
		try {
			expert = sqlSession.getMapper(ExpertMapper.class).expertDetail(expert_Id);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		System.out.println(expert);
		return expert;
	}
	
	public Member memberMypage(String member_Id){
		SqlSession sqlsession = getSqlSessionFactory().openSession();
		Member memberMypage = new Member();
		try {
			memberMypage = sqlsession.getMapper(MemberMapper.class).memberMypage(member_Id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlsession != null){
				sqlsession.close();
			}
		}
		return memberMypage;
	}
	public int memberImageUpdate(Member member){
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			re = sqlSession.getMapper(MemberMapper.class).memberImageUpdate(member);
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
	public int memberNameUpdate(Member member){
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			re = sqlSession.getMapper(MemberMapper.class).memberNameUpdate(member);
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
	public int memberPwUpdate(Member member){
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			re = sqlSession.getMapper(MemberMapper.class).memberPwUpdate(member);
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
	public int memberPnumUpdate(Member member){
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			re = sqlSession.getMapper(MemberMapper.class).memberPnumUpdate(member);
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
	
