package soomgosusta.dao;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import soomgosusta.domain.Answer;
import soomgosusta.domain.Question;
import soomgosusta.domain.Request;
import soomgosusta.mapper.CategoryMapper;
import soomgosusta.mapper.RequestMapper;

public class RequestDao {
	private static RequestDao dao = new RequestDao();

	public static RequestDao getInstance() {
		return dao;
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

	public List<Request> sendRequestInfo(String request_Member_Id) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Request> request_c_Code = null;
		try {
			request_c_Code = sqlSession.getMapper(RequestMapper.class).sendRequestInfo(request_Member_Id);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}

		return request_c_Code;

	}
	
	public List<Request> listAlreadySend(HashMap<String, String> map){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Request> list = null;
		
		try {
			list = sqlSession.getMapper(RequestMapper.class).listAlreadySend(map);
			System.out.println(map);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		
		return list;
	}

	public int updateLogRequest(String searchCode) throws Exception{
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = -1;
		
		try {
			re=  sqlSession.getMapper(RequestMapper.class).updateLogRequest(searchCode);
			if(re>0)
				sqlSession.commit();
			else
				sqlSession.rollback();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
		return re;
	}
	
	
		
			
			public List<Question> listQuestion(HashMap<String, String> map) throws Exception{
				SqlSession sqlSession = getSqlSessionFactory().openSession();
				List<Question> list = null;
				
				try {
					list = sqlSession.getMapper(RequestMapper.class).listQuestion(map);
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					sqlSession.close();
				}
				
				return list;
			}
			
			public List<Answer> listAnswer(String question_Code) throws Exception{
				SqlSession sqlSession = getSqlSessionFactory().openSession();
				List<Answer> list = null;
				
				try {
					list = sqlSession.getMapper(RequestMapper.class).listAnswer(question_Code);

				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					sqlSession.close();
				}
			
				return list;
			}
			
			

			public int insertRequest(HashMap<String, String> requestMap) throws Exception{
				SqlSession sqlSession = getSqlSessionFactory().openSession();
				int re = -1;
				
				try {
					re = sqlSession.getMapper(RequestMapper.class).insertRequest(requestMap);
					
					if(re>0) 
						sqlSession.commit();
					else 
						sqlSession.rollback();
					
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					sqlSession.close();
				}
				
				return re; 
			}
			
			public int listRegisterLog(String searchKey){
				SqlSession sqlSession = getSqlSessionFactory().openSession();
				int re = -1;
				
				try {
					re = sqlSession.getMapper(RequestMapper.class).listRegisterLog(searchKey);
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					sqlSession.close();
				}
				return re;
			}

			public Request detailRequest(String id) {
				SqlSession sqlSession = getSqlSessionFactory().openSession();
				Request re = null;
				try {
					re = sqlSession.getMapper(RequestMapper.class).detailRequest(id);
				} catch (Exception e) {
					e.printStackTrace();
				} finally{
					if(sqlSession != null){
						sqlSession.close();
					}
				}
				return re;
			}
		}


