package soomgosusta.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import soomgosusta.domain.Expert_Information;
import soomgosusta.domain.Request;
import soomgosusta.mapper.MatchMapper;

public class MatchDao {
	private static MatchDao dao = new MatchDao();
	
	public static MatchDao getInstance() {
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

		public List<Expert_Information> matchCandidateList(String request_C_Code){
			List<Expert_Information> candidateList = null;
			SqlSession sqlSession = getSqlSessionFactory().openSession();
			
			try {
				candidateList = sqlSession.getMapper(MatchMapper.class).matchCandidateList(request_C_Code);
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				sqlSession.close();
			}
			return candidateList;
		}
		
		
		public Request MemberRequest(){
			Request requestedMember = null;
			SqlSession sqlSession = getSqlSessionFactory().openSession();
			
			try {
				requestedMember = sqlSession.getMapper(MatchMapper.class).MemberRequest();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				sqlSession.close();
			}
			return requestedMember;
		}
		
		
		
		
		
		
		
		
	}

