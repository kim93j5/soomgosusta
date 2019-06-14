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
		
	public List<Category> listPopular(){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Category> list = null;
		
		try {
			list = sqlSession.getMapper(CategoryMapper.class).listPopular();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
