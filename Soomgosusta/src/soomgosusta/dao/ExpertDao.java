package soomgosusta.dao;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import soomgosusta.domain.Expert;
import soomgosusta.domain.Expert_Profile;
import soomgosusta.domain.Expert_Profile_License;
import soomgosusta.domain.Expert_FindInfo;
import soomgosusta.domain.Answer;
import soomgosusta.domain.Category;
import soomgosusta.domain.Expert_Information;
import soomgosusta.domain.Question;
import soomgosusta.mapper.ExpertMapper;

public class ExpertDao {
	private static ExpertDao dao = new ExpertDao();

	public static ExpertDao getInstance() {
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
	
		public Expert expertLogin(String id) {
			SqlSession sqlSession = getSqlSessionFactory().openSession();
			System.out.println("dao "+ id);
			
			Expert expert = null;
			
			try {
				expert = sqlSession.getMapper(ExpertMapper.class).expertLogin(id);
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				sqlSession.close();
			}
			System.out.println("Dao "+expert);
			return expert;
		}

	
	public Expert_Profile profileDetail(String expert_Id) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		Expert_Profile profile = null;
		System.out.println("Dao profileDetail  "+expert_Id);
		try {
			profile = sqlSession.getMapper(ExpertMapper.class).profileDetail(expert_Id);
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		System.out.println(profile);
		return profile;
	}
	
	public int profileUpdate(Expert_Profile profile) {
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			re = sqlSession.getMapper(ExpertMapper.class).profileUpdate(profile);
			
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
		System.out.println("DAO expertDetail  "+expert_Id);
		try {
			expert = sqlSession.getMapper(ExpertMapper.class).expertDetail(expert_Id);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		System.out.println("DAO임"+expert);
		return expert;
	}
	

	public int registerExpert(Expert expert ) {
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			re = sqlSession.getMapper(ExpertMapper.class).registerExpert(expert);
			
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
	

	public List<Expert_FindInfo> listExpertFind(HashMap<String, String> map){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Expert_FindInfo> list = null;
		
		try {
			list = sqlSession.getMapper(ExpertMapper.class).listExpertFind(map);
			System.out.println(list);

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		
		return list;
	}

	public int updateLicenseImg(Expert_Profile_License epl) {
		int re = -1;
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			re = sqlSession.getMapper(ExpertMapper.class).updateLicenseImg(epl);
			
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

	public Expert_Profile_License licenseDetail(String epl_Expert_Id) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		System.out.println("@++++++"+epl_Expert_Id);
		Expert_Profile_License epl= null;
		try {
			epl = sqlSession.getMapper(ExpertMapper.class).licenseDetail(epl_Expert_Id);
			System.out.println("@@@@@@@"+epl);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return epl;
	}
	
}
