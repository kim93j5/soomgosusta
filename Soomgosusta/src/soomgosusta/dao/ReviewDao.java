package soomgosusta.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import soomgosusta.domain.Review;
import soomgosusta.mapper.ReviewMapper;

public class ReviewDao {
private static ReviewDao dao = new ReviewDao();
	
	public static ReviewDao getInstance(){
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
	
	public List<Review> detailAvgStarPoint(String searchId){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Review> list = null;
		
		try {
			list = sqlSession.getMapper(ReviewMapper.class).detailAvgStarPoint(searchId);
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		
		return list;
	}

	public int insertReview(Review review) {
		
			int re = -1;
			
			SqlSession sqlSession = getSqlSessionFactory().openSession();
			
			try { 
				re= sqlSession.getMapper(ReviewMapper.class).insertReview(review);
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

	public List<Review> reviewList(String review_Expert_Id) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Review> review = null;
		try {
			review = sqlSession.getMapper(ReviewMapper.class).reviewList(review_Expert_Id);
			System.out.println("Dao review"+review);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		
		return review;
	}

	
	

	
}
