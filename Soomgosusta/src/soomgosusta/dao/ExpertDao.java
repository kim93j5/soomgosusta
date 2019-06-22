package soomgosusta.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import soomgosusta.domain.Answer;
import soomgosusta.domain.Category;
import soomgosusta.domain.Expert_Information;
import soomgosusta.domain.Question;
import soomgosusta.mapper.ExpertMapper;

public class ExpertDao {
	private static ExpertDao e_dao = new ExpertDao();

	public static ExpertDao getInstance() {
		return e_dao;
	}

	public SqlSessionFactory getSqlSessionFactory() {
		String resource = "mybatis-config.xml";
		InputStream in = null;

		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new SqlSessionFactoryBuilder().build(in);

	}
	
    public List<Category> categoryCode(){
		
		SqlSession sqlsession = getSqlSessionFactory().openSession();
		List<Category> categoryList = null;
		try {
			categoryList = sqlsession.getMapper(ExpertMapper.class).categoryCode();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlsession != null){
				sqlsession.close();
			}
		}
		return categoryList;
	}
	
	

	public List<Question> q_Info() {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Question> list = null;
		try {
			list = sqlSession.getMapper(ExpertMapper.class).q_Info();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		
		System.out.println(list);
		return list;
	}
	
	public List<Answer> a_Info() {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Answer> list = null;
		try {
			list = sqlSession.getMapper(ExpertMapper.class).a_Info();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		System.out.println(list);
		return list;
	}
	
	
	  public int insertExpertSum(Expert_Information expert_Info ){
		  int re = -1;
		  SqlSession sqlSession = getSqlSessionFactory().openSession();
		  
		  try {
			re = sqlSession.getMapper(ExpertMapper.class).insertExpertSum(expert_Info);
			
			if(re > 0){
				sqlSession.commit();
			}else{
				sqlSession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		return re;
	 
	  }
	
}
