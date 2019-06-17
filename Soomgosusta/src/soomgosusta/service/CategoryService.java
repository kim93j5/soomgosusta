package soomgosusta.service;

import java.io.FileWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONObject;

import soomgosusta.dao.CategoryDao;
import soomgosusta.domain.Category;

public class CategoryService {
	private static CategoryService service = new CategoryService();
	private static CategoryDao dao;
	List<Category>listPopular = null;
	
	public static CategoryService getInstance(){
		dao = CategoryDao.getInstance();
		return service;
	}
	
	//전체 분야 검색량 기준으로 json
	public List<Category> listPopularService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("utf-8");
		listPopular = dao.listPopular();
		
		FileWriter file = new FileWriter("C:\\Users\\NYJ\\Desktop\\kosta\\kosta_jsp\\board_test\\Soomgosusta\\WebContent\\script\\category.json");
		JSONObject group = new JSONObject(); //그룹 Json으로		

		file.write("[");
		try {
			for(int i=0; i<listPopular.size(); i++){
				String str = listPopular.get(i).getCategory_Group();
				String groupArr[] = str.split("/");
				
				group.put("code", listPopular.get(i).getCategory_Code());
				group.put("group1", groupArr[0]);
				group.put("group2", groupArr[1]);
				group.put("group3", groupArr[2]);
				group.put("image", listPopular.get(i).getCategory_Image());
	
				file.write(group.toString());
				if(i != listPopular.size()-1) file.write(",\n");
		
			}
			file.write("]");
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return listPopular;

	}
		
	//검색량 추가
	public String updateSearchLogService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("utf-8");
		String searchKey = request.getParameter("searchKey");
		String searchCode = null;
		
		for(int i=0; i<listPopular.size(); i++){
			String str = listPopular.get(i).getCategory_Group();
			String groupArr[] = str.split("/");
			
			if(groupArr[2].equals(searchKey)){
				searchCode= listPopular.get(i).getCategory_Code();
				break;
			}
		}
		
		if(searchCode != null){
			dao.updateSearchLog(searchCode);
		}
		
		return searchCode;
	}
}


/*package soomgosusta.service;

import java.io.FileWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import soomgosusta.dao.CategoryDao;
import soomgosusta.domain.Category;

public class CategoryService {
	private static CategoryService service = new CategoryService();
	private static CategoryDao dao;
	List<Category>listPopular = null;
	
	public static CategoryService getInstance(){
		dao = CategoryDao.getInstance();
		return service;
	}
	
	//전체 분야 검색량 기준으로 json
	public JSONArray listPopularService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("utf-8");
		listPopular = dao.listPopular();
		
		//JSONObject sendGroup = new JSONObject();
		JSONArray arr= new JSONArray();
		
		try {
			for(int i=0; i<listPopular.size(); i++){
				JSONObject group = new JSONObject(); //그룹 Json객체로
				
				String str = listPopular.get(i).getCategory_Group();
				String groupArr[] = str.split("/");
				
				group.put("code", listPopular.get(i).getCategory_Code());
				group.put("group1", groupArr[0]);
				group.put("group2", groupArr[1]);
				group.put("group3", groupArr[2]);
				group.put("image", listPopular.get(i).getCategory_Image());
				
				arr.add(group); //jsonarray에 json객체 담기
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return arr;

	}
		
	public List<Category> listCategoryService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("utf-8");
		
		List<Category> list = null;
		list = dao.listCategory();
		
		return list;
	}
	
	//검색량 추가
	public String updateSearchLogService(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("utf-8");
		String searchKey = request.getParameter("searchKey");
		String searchCode = null;
		
		for(int i=0; i<listPopular.size(); i++){
			String str = listPopular.get(i).getCategory_Group();
			String groupArr[] = str.split("/");
			
			if(groupArr[2].equals(searchKey)){
				searchCode= listPopular.get(i).getCategory_Code();
				break;
			}
		}
		
		if(searchCode != null){
			dao.updateSearchLog(searchCode);
		}
		
		return searchCode;
	}
}
*/