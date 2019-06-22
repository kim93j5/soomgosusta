package soomgosusta.dao;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import soomgosusta.domain.Request;
import soomgosusta.mapper.RequestMapper;

public class RequestDao {
	private static RequestDao r_dao = new RequestDao();

	public static RequestDao getInstance() {
		return r_dao;
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

	public Request sendRequestInfo() {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		Request request_c_Code = null;
		try {
			request_c_Code = sqlSession.getMapper(RequestMapper.class).sendRequestInfo();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}

		return request_c_Code;

	}
}
