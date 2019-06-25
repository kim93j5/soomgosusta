package soomgosusta.action_memberAction;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.util.ImageUtil;
import soomgosusta.domain.Member;
import soomgosusta.service.MemberService;

public class MemberImageUpdateAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MemberService service = MemberService.getInstance();
		ActionForward forward = new ActionForward();
		String id= request.getParameter("member_Id");
		Member memberMyInfo = service.memberMyPageService(id);
		String uploadPath = request.getRealPath("upload");
		int size = 20*1024*1024; //20MB
		MultipartRequest multi = new MultipartRequest(request, uploadPath, size, "utf-8", new DefaultFileRenamePolicy());
		
		if(multi.getFilesystemName("m_Photo") != null){
			String fname = multi.getFilesystemName("m_Photo");
			memberMyInfo.setM_Photo(fname);
			service.memberImageUpdate(memberMyInfo);
			
			String pattern = fname.substring(fname.indexOf(".")+1);
			String head = fname.substring(0, fname.indexOf("."));

			String imagePath = uploadPath + "\\" + fname;
			File src = new File(imagePath);
			
			String thumPath = uploadPath + "\\"+ head + "_small."+pattern;
			File dest = new File(thumPath);
			if(pattern.equals("gif") || pattern.equals("jpg")){
				ImageUtil.resize(src, dest, 500, ImageUtil.RATIO);
			}
		}
		request.setAttribute("memberMyInfo", memberMyInfo);
	
		forward.setRedirect(false);
		forward.setPath("/memberMyPage.jsp");
		return forward;
	}

}
