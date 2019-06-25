package soomgosusta.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import soomgosusta.domain.Category;
import soomgosusta.mapper.CategoryMapper;

public class CategoryDao {
	private static CategoryDao dao = new CategoryDao();
	
	public static CategoryDao getInstance(){
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
		
	//인기 서비스
	public List<Category> listSearch(){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Category> list = null;
		
		try {
			list = sqlSession.getMapper(CategoryMapper.class).listSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		
		return list;
	}
	
	//전체 분야
	public List<Category> listCategory(){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Category> list = null;
		
		try{
			list = sqlSession.getMapper(CategoryMapper.class).listCategory();
	
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		
		return list;
	}
	
	//검색량 추가
	public int updateSearchLog(String searchCode){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = -1;

		try {
			re = sqlSession.getMapper(CategoryMapper.class).updateSearchLog(searchCode);
			if(re > 0){
				sqlSession.commit();
			}else{
				sqlSession.rollback();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return re;
	}
	
	public String searchCategory(String searchCode){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		String code="";
		
		try {
			code = sqlSession.getMapper(CategoryMapper.class).searchCategory(searchCode);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return code;
	}
	
	public List<Category> searchKey(String searchKey){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Category> list = null;
		
		try {
			list = sqlSession.getMapper(CategoryMapper.class).searchKey(searchKey);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return list;
	}
	
	
}
