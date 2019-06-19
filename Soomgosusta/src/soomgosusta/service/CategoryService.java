package soomgosusta.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import soomgosusta.dao.CategoryDao;
import soomgosusta.domain.Category;

public class CategoryService {
   private static CategoryService service = new CategoryService();
   private static CategoryDao dao;
   List<Category> listSearch = null;
   
   public static CategoryService getInstance(){
      dao = CategoryDao.getInstance();
      return service;
   }
   
   //��ü �о� �˻��� �������� json
   public JSONArray listSearchService(HttpServletRequest request) throws Exception{
      request.setCharacterEncoding("utf-8");
      listSearch = dao.listSearch();
      

      JSONArray arr = new JSONArray();
      try {
         for(int i=0; i<listSearch.size(); i++){
            JSONObject group = new JSONObject(); //�׷� Json����      
            
            String str = listSearch.get(i).getC_Word();
            String groupArr[] = str.split("/");
            
            group.put("code", listSearch.get(i).getC_Code());
            group.put("group1", groupArr[0]);
            group.put("group2", groupArr[1]);
            group.put("group3", groupArr[2]);
            group.put("image", listSearch.get(i).getC_Image());
            
            arr.add(group);
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
      
      return arr;

   }
    
   public JSONArray listCategoryService(HttpServletRequest request) throws Exception{
	      request.setCharacterEncoding("utf-8");
	      List<Category> listCategory = dao.listCategory();

	      
	      JSONArray arr = new JSONArray();
	      try {
	         for(int i=0; i<listCategory.size(); i++){
	            JSONObject group = new JSONObject(); //�׷� Json����      
	            
	            String str = listCategory.get(i).getC_Word();
	            String groupArr[] = str.split("/");
	            
	            group.put("code", listCategory.get(i).getC_Code());
	            group.put("group1", groupArr[0]);
	            group.put("group2", groupArr[1]);
	            group.put("group3", groupArr[2]);
	            group.put("image", listCategory.get(i).getC_Image());
	            
	            arr.add(group);
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      
	      return arr;

	   }
   
   //�˻��� �߰�
   public String updateSearchLogService(String searchKey) throws Exception{
      String searchCode = null;
      
      for(int i=0; i<listSearch.size(); i++){
         String str = listSearch.get(i).getC_Word();
         String groupArr[] = str.split("/");
         
         if(groupArr[2].equals(searchKey)){
            searchCode= listSearch.get(i).getC_Code();
            break;
         }
      }
      
      if(searchCode != null){
         dao.updateSearchLog(searchCode);
      }
      
      return searchCode;
   }
}