package soomgosusta.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import soomgosusta.domain.Esend;
import soomgosusta.domain.Category_Log;
import soomgosusta.domain.Expert;
import soomgosusta.domain.Expert_Information;
import soomgosusta.domain.Match;
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
		
		
		public Request memberRequest(String member_Id,String member_Code){
			Request requestedMember = null;
			SqlSession sqlSession = getSqlSessionFactory().openSession();
			
			try {
				requestedMember = sqlSession.getMapper(MatchMapper.class).memberRequest(member_Id,member_Code);
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				sqlSession.close();
			}
			return requestedMember;
		}
		public int matchTableInsert(Match match){
			SqlSession sqlsession = getSqlSessionFactory().openSession();
			int re = -1;
			
			try {
				re = sqlsession.getMapper(MatchMapper.class).matchTableInsert(match);
				if(re >0){
					sqlsession.commit();
				}else{
					sqlsession.rollback();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				if(sqlsession != null){
					sqlsession.close();
				}
			}
			return re;
		}
		public int matchLogUpdate(Category_Log category_log){
			SqlSession sqlsession = getSqlSessionFactory().openSession();
			int re = -1;
			
			try {
				re = sqlsession.getMapper(MatchMapper.class).matchLogUpdate(category_log);
				if(re >0){
					sqlsession.commit();
				}else{
					sqlsession.rollback();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				if(sqlsession != null){
					sqlsession.close();
				}
			}
			return re;
		}
		public Expert expertGender(String expert_Id){
			Expert expertGender = null;
			SqlSession sqlSession = getSqlSessionFactory().openSession();
			
			try {
				expertGender = sqlSession.getMapper(MatchMapper.class).expertGender(expert_Id);
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				sqlSession.close();
			}
			return expertGender;
		}
		
		public List<Match> matchList(String login_Session) {
			SqlSession sqlSession = getSqlSessionFactory().openSession();
			List<Match> matchList = null;
			try {
				matchList = sqlSession.getMapper(MatchMapper.class).matchList(login_Session);
			
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if(sqlSession != null){
					sqlSession.close();
				}
			}
			return matchList;
		}

		public Match detailMatch(Esend esend) {
			SqlSession sqlSession = getSqlSessionFactory().openSession();
			Match match = null;
			try {
				match = sqlSession.getMapper(MatchMapper.class).detailMatch(esend);
			} catch (Exception e) {
				e.printStackTrace();
			} finally{
				if(sqlSession != null){
					sqlSession.close();
				}
			}
			return match;
		}
		
		public int updateMatch(Esend esend) {
			int re = -1;
			
			SqlSession sqlSession = getSqlSessionFactory().openSession();
			
			try { 
				re= sqlSession.getMapper(MatchMapper.class).updateMatch(esend);
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
		
		
		
	}

