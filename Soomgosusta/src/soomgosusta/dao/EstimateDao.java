package soomgosusta.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import soomgosusta.domain.Esend;
import soomgosusta.domain.Estimate;
import soomgosusta.mapper.EstimateMapper;

public class EstimateDao {
	
private static EstimateDao dao = new EstimateDao();
	
	public static EstimateDao getInstance(){
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

	
	public int insertEstimate(Estimate estimate) {
		int re = -1;
		
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try { 
			re= sqlSession.getMapper(EstimateMapper.class).insertEstimate(estimate);
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

	public List<Estimate> estimateList(String login_Session) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Estimate> estimate = null;
		try {
			estimate = sqlSession.getMapper(EstimateMapper.class).estimateList(login_Session);
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlSession != null){
				sqlSession.close();
			}
		}
		
		return estimate;
	}

	public Estimate detailEstimate(Esend esend) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		Estimate estimateDetail = null;
		try {
			estimateDetail = (Estimate) sqlSession.getMapper(EstimateMapper.class).detailEstimate(esend);
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlSession != null){
				sqlSession.close();
			}
		}
		
		return estimateDetail;
	}
	
	

}
