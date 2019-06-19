package soomgosusta.service;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;


import soomgosusta.dao.FileDao;

public class FileService {
	
		private static FileService service = new FileService();
		private static FileDao dao;
		
		public static FileService getInstance() {
			dao= FileDao.getInstance();
			return service;
		}
		
		public int uploadFile (HttpServletRequest request)throws Exception{
			
			request.setCharacterEncoding("utf-8");
			String uploadPath= request.getRealPath("/upload/");
			int size = 20 * 1024 * 1024;
			
			MultipartRequest multi=
					new MultipartRequest(request, uploadPath, size, "utf-8", new DefaultFileRenamePolicy());
			String fileName = multi.getOriginalFileName("file");
			String fileRealName = multi.getFilesystemName("file");
			
			new FileDao().uploadFile(fileName, fileRealName);
		
			return 0;
			
			
		}
}
