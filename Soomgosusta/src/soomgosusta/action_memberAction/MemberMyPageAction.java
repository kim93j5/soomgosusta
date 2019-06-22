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

public class MemberMyPageAction implements Action {

	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MemberService service = MemberService.getInstance();
		ActionForward forward = new ActionForward();
		
		Member memberMyInfo = service.memberMyPageService(request);
		request.setAttribute("memberMyInfo", memberMyInfo);

		String uploadPath = request.getRealPath("upload");
		int size = 20*1024*1024; //20MB
		
		if(memberMyInfo.getM_Photo() != null){ 
			String fname = memberMyInfo.getM_Photo();
			
			String pattern = fname.substring(fname.indexOf(".")+1);
			String head = fname.substring(0, fname.indexOf("."));

			String imagePath = uploadPath + "\\" + fname;
			File src = new File(imagePath);
			
			String thumPath = uploadPath + "\\"+ head + "_small."+pattern;
			File dest = new File(thumPath);
			if(pattern.equals("gif") || pattern.equals("jpg")){
				ImageUtil.resize(src, dest, 200, ImageUtil.RATIO);
			}
		}	
		forward.setRedirect(false);
		forward.setPath("/memberMyPage.jsp");
		return forward;
	}

}
