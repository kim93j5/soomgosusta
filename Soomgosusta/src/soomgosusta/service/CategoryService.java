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
   List<Category>listPopular = null;
   
   public static CategoryService getInstance(){
      dao = CategoryDao.getInstance();
      return service;
   }
   
   //��ü �о� �˻��� �������� json
   public JSONArray listPopularService(HttpServletRequest request) throws Exception{
      request.setCharacterEncoding("utf-8");
      listPopular = dao.listPopular();
      

      JSONArray arr = new JSONArray();
      try {
         for(int i=0; i<listPopular.size(); i++){
            JSONObject group = new JSONObject(); //�׷� Json����      
            
            String str = listPopular.get(i).getCategory_Group();
            String groupArr[] = str.split("/");
            
            group.put("code", listPopular.get(i).getCategory_Code());
            group.put("group1", groupArr[0]);
            group.put("group2", groupArr[1]);
            group.put("group3", groupArr[2]);
            group.put("image", listPopular.get(i).getCategory_Image());
            
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
   
   //��ü �о� �˻��� �������� json
   public JSONArray listPopularService(HttpServletRequest request) throws Exception{
      request.setCharacterEncoding("utf-8");
      listPopular = dao.listPopular();
      
      //JSONObject sendGroup = new JSONObject();
      JSONArray arr= new JSONArray();
      
      try {
         for(int i=0; i<listPopular.size(); i++){
            JSONObject group = new JSONObject(); //�׷� Json��ü��
            
            String str = listPopular.get(i).getCategory_Group();
            String groupArr[] = str.split("/");
            
            group.put("code", listPopular.get(i).getCategory_Code());
            group.put("group1", groupArr[0]);
            group.put("group2", groupArr[1]);
            group.put("group3", groupArr[2]);
            group.put("image", listPopular.get(i).getCategory_Image());
            
            arr.add(group); //jsonarray�� json��ü ���
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
   
   //�˻��� �߰�
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