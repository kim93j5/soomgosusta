package soomgosusta.action_requestAction;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soomgosusta.action_interface.Action;
import soomgosusta.action_interface.ActionForward;
import soomgosusta.domain.Answer;
import soomgosusta.domain.Category;
import soomgosusta.domain.Question;
import soomgosusta.domain.Request;
import soomgosusta.service.ExpertService;
import soomgosusta.service.RequestService;

public class DetailRequestAction implements Action {

   public ActionForward excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        RequestService service = RequestService.getInstance();
         ExpertService ex_service = ExpertService.getInstance();
         ActionForward forward = new ActionForward();
         
         request.setCharacterEncoding("utf-8");
         Request detailRequest = service.requestDetailService(request);
         
         
        
         /////////////////////////////////////////////////////////////////////////////////////////   
         /////////////////////////////질문답 리스트 뽑아내기//////////////////////////////////////////////
         /////////////////////////////////////////////////////////////////////////////////////////

         
         List<Question> questionList = ex_service.qInfoService(request);  
         
         String[] Q1= detailRequest.getR_QA_01().split("/");
         for(int i = 0; i < questionList.size(); i++){
            if( Q1[0].equals(questionList.get(i).getQ_Code())){
               String Q1_contents = questionList.get(i).getQ_Contents();
               request.setAttribute("Q1_contents", Q1_contents);
            }
         }     
         
         String[] Q2 = detailRequest.getR_QA_02().split("/");
         for(int i = 0; i < questionList.size(); i++){
            if( Q2[0].equals(questionList.get(i).getQ_Code())){
               String Q2_contents = questionList.get(i).getQ_Contents();
               request.setAttribute("Q2_contents", Q2_contents);
            }
         }   
         
         String[] Q3 = detailRequest.getR_QA_03().split("/");
         for(int i = 0; i < questionList.size(); i++){
            if( Q3[0].equals(questionList.get(i).getQ_Code())){
               String Q3_contents = questionList.get(i).getQ_Contents();
               request.setAttribute("Q3_contents", Q3_contents);
            }
         }
         
         String[] Q4 = detailRequest.getR_QA_04().split("/");
         for(int i = 0; i < questionList.size(); i++){
            if( Q4[0].equals(questionList.get(i).getQ_Code())){
               String Q4_contents = questionList.get(i).getQ_Contents();
               request.setAttribute("Q4_contents", Q4_contents);
            }
         }
         
         String[] Q5 = detailRequest.getR_QA_05().split("/");
         for(int i = 0; i < questionList.size(); i++){
            if( Q5[0].equals(questionList.get(i).getQ_Code())){
               String Q5_contents = questionList.get(i).getQ_Contents();
               request.setAttribute("Q5_contents", Q5_contents);
            }
         }   
         
         String[] Q6 = detailRequest.getR_QA_06().split("/");
         for(int i = 0; i < questionList.size(); i++){
            if( Q6[0].equals(questionList.get(i).getQ_Code())){
               String Q6_contents = questionList.get(i).getQ_Contents();
               request.setAttribute("Q6_contents", Q6_contents);
            }
         }   
         
         String[] Q7 = detailRequest.getR_QA_07().split("/");
         for(int i = 0; i < questionList.size(); i++){
            if( Q7[0].equals(questionList.get(i).getQ_Code())){
               String Q7_contents = questionList.get(i).getQ_Contents();
               request.setAttribute("Q7_contents", Q7_contents);
            }
         }   
         
         
         String[] Q8 = detailRequest.getR_QA_08().split("/");
         for(int i = 0; i < questionList.size(); i++){
            if( Q8[0].equals(questionList.get(i).getQ_Code())){
               String Q8_contents = questionList.get(i).getQ_Contents();
               request.setAttribute("Q8_contents", Q8_contents);
            }
         }   
         
         String[] Q9 = detailRequest.getR_QA_09().split("/");
         for(int i = 0; i < questionList.size(); i++){
            if( Q9[0].equals(questionList.get(i).getQ_Code())){
               String Q9_contents = questionList.get(i).getQ_Contents();
               request.setAttribute("Q9_contents", Q9_contents);
            }
         }   
         
         String[] Q10 = detailRequest.getR_QA_10().split("/");
         for(int i = 0; i < questionList.size(); i++){
            if( Q10[0].equals(questionList.get(i).getQ_Code())){
               String Q10_contents = questionList.get(i).getQ_Contents();
               request.setAttribute("Q10_contents", Q10_contents);
            }
         }   
         
         String[] Q11 = detailRequest.getR_QA_11().split("/");
         for(int i = 0; i < questionList.size(); i++){
            if( Q11[0].equals(questionList.get(i).getQ_Code())){
               String Q11_contents = questionList.get(i).getQ_Contents();
               request.setAttribute("Q11_contents", Q11_contents);
            }
         }   
         
         String[] Q12 = detailRequest.getR_QA_12().split("/");
         for(int i = 0; i < questionList.size(); i++){
            if( Q12[0].equals(questionList.get(i).getQ_Code())){
               String Q12_contents = questionList.get(i).getQ_Contents();
               request.setAttribute("Q12_contents", Q12_contents);
            }
         }   
         
         String[] Q13 = detailRequest.getR_QA_13().split("/");
         for(int i = 0; i < questionList.size(); i++){
            if( Q13[0].equals(questionList.get(i).getQ_Code())){
               String Q13_contents = questionList.get(i).getQ_Contents();
               request.setAttribute("Q13_contents", Q13_contents);
            }
         }   
         
         String[] Q14 = detailRequest.getR_QA_14().split("/");
         for(int i = 0; i < questionList.size(); i++){
            if( Q14[0].equals(questionList.get(i).getQ_Code())){
               String Q14_contents = questionList.get(i).getQ_Contents();
               request.setAttribute("Q14_contents", Q14_contents);
            }
         }   
         
         //////////////////////////답/////////////////////////////
         List<Answer> answerList = ex_service.aInfoService(request);
         request.setAttribute("answerList", answerList);
         System.out.println(answerList);
         
         String[] A1 = detailRequest.getR_QA_01().split("/"); //A1[1] = CQ1_A6, A1[2] = CQ1_A7, A1[0]은 질문코드
         String a1 = "";
         List<String> list_a1 = new ArrayList<String>();
 
         for(int i = 0; i < A1.length; i++){
            for(int j = 0; j < answerList.size(); j++){
               if(A1[i].equals(answerList.get(j).getA_Code())){
                  a1 = answerList.get(j).getA_Contents();

                  list_a1.add(a1);
                  request.setAttribute("list_a1", list_a1);
               }   
            }
         }
         
        String[] A2 = detailRequest.getR_QA_02().split("/"); 
         String a2 = "";
         List<String> list_a2 = new ArrayList<String>();

         for(int i = 0; i < A2.length; i++){
            for(int j = 0; j < answerList.size(); j++){
               if(A2[i].equals(answerList.get(j).getA_Code())){
                  a2 = answerList.get(j).getA_Contents();
             
                  list_a2.add(a2);
                  request.setAttribute("list_a2", list_a2);
               }   
            }
         }
           String[] A3 = detailRequest.getR_QA_03().split("/");
            String a3 = "";
            List<String> list_a3 = new ArrayList<String>();
         
         for(int i = 0; i < A3.length; i++){
            for(int j = 0; j < answerList.size(); j++){
               if(A3[i].equals(answerList.get(j).getA_Code())){
                  a3 = answerList.get(j).getA_Contents();
             
                  list_a3.add(a3);
                  request.setAttribute("list_a3", list_a3);
               }   
            }
         }
         
           String[] A4 = detailRequest.getR_QA_04().split("/");
            String a4 = "";
            List<String> list_a4 = new ArrayList<String>();
         
         for(int i = 0; i < A4.length; i++){
            for(int j = 0; j < answerList.size(); j++){
               if(A4[i].equals(answerList.get(j).getA_Code())){
                  a4 = answerList.get(j).getA_Contents();
             
                  list_a4.add(a4);
                  request.setAttribute("list_a4", list_a4);
               }   
            }
         }
         
           String[] A5 = detailRequest.getR_QA_05().split("/");
            String a5 = "";
            List<String> list_a5 = new ArrayList<String>();
         
         for(int i = 0; i < A5.length; i++){
            for(int j = 0; j < answerList.size(); j++){
               if(A5[i].equals(answerList.get(j).getA_Code())){
                  a5 = answerList.get(j).getA_Contents();
             
                  list_a5.add(a5);
                  request.setAttribute("list_a5", list_a5);
               }   
            }
         }
         
           String[] A6 = detailRequest.getR_QA_06().split("/");
            String a6 = "";
            List<String> list_a6 = new ArrayList<String>();
         
         for(int i = 0; i < A6.length; i++){
            for(int j = 0; j < answerList.size(); j++){
               if(A6[i].equals(answerList.get(j).getA_Code())){
                  a6 = answerList.get(j).getA_Contents();
             
                  list_a6.add(a6);
                  request.setAttribute("list_a6", list_a6);
               }   
            }
         }
         
           String[] A7 = detailRequest.getR_QA_07().split("/");
            String a7 = "";
            List<String> list_a7 = new ArrayList<String>();
         
         for(int i = 0; i < A7.length; i++){
            for(int j = 0; j < answerList.size(); j++){
               if(A7[i].equals(answerList.get(j).getA_Code())){
                  a7 = answerList.get(j).getA_Contents();
             
                  list_a7.add(a7);
                  request.setAttribute("list_a7", list_a7);
               }   
            }
         }
         
           String[] A8 = detailRequest.getR_QA_08().split("/");
            String a8 = "";
            List<String> list_a8 = new ArrayList<String>();
         
         for(int i = 0; i < A8.length; i++){
            for(int j = 0; j < answerList.size(); j++){
               if(A8[i].equals(answerList.get(j).getA_Code())){
                  a8 = answerList.get(j).getA_Contents();
             
                  list_a8.add(a8);
                  request.setAttribute("list_a8", list_a8);
               }   
            }
         }
         
           String[] A9 = detailRequest.getR_QA_09().split("/");
            String a9 = "";
            List<String> list_a9 = new ArrayList<String>();
         
         for(int i = 0; i < A9.length; i++){
            for(int j = 0; j < answerList.size(); j++){
               if(A9[i].equals(answerList.get(j).getA_Code())){
                  a9 = answerList.get(j).getA_Contents();
             
                  list_a9.add(a9);
                  request.setAttribute("list_a9", list_a9);
               }   
            }
         }
         
           String[] A10 = detailRequest.getR_QA_10().split("/");
            String a10 = "";
            List<String> list_a10 = new ArrayList<String>();
         
         for(int i = 0; i < A10.length; i++){
            for(int j = 0; j < answerList.size(); j++){
               if(A10[i].equals(answerList.get(j).getA_Code())){
                  a10 = answerList.get(j).getA_Contents();
             
                  list_a10.add(a10);
                  request.setAttribute("list_a10", list_a10);
               }   
            }
         }
         
           String[] A11 = detailRequest.getR_QA_11().split("/");
            String a11 = "";
            List<String> list_a11 = new ArrayList<String>();
         
         for(int i = 0; i < A11.length; i++){
            for(int j = 0; j < answerList.size(); j++){
               if(A11[i].equals(answerList.get(j).getA_Code())){
                  a11 = answerList.get(j).getA_Contents();
             
                  list_a11.add(a11);
                  request.setAttribute("list_a11", list_a11);
               }   
            }
         }
         
           String[] A12 = detailRequest.getR_QA_12().split("/");
            String a12 = "";
            List<String> list_a12 = new ArrayList<String>();
         
         for(int i = 0; i < A12.length; i++){
            for(int j = 0; j < answerList.size(); j++){
               if(A12[i].equals(answerList.get(j).getA_Code())){
                  a12 = answerList.get(j).getA_Contents();
             
                  list_a12.add(a12);
                  request.setAttribute("list_a12", list_a12);
               }   
            }
         }
         
           String[] A13 = detailRequest.getR_QA_13().split("/");
            String a13 = "";
            List<String> list_a13 = new ArrayList<String>();
         
         for(int i = 0; i < A13.length; i++){
            for(int j = 0; j < answerList.size(); j++){
               if(A13[i].equals(answerList.get(j).getA_Code())){
                  a13 = answerList.get(j).getA_Contents();
             
                  list_a13.add(a13);
                  request.setAttribute("list_a13", list_a13);
               }   
            }
         }
         
           String[] A14 = detailRequest.getR_QA_14().split("/");
            String a14 = "";
            List<String> list_a14 = new ArrayList<String>();
         
         for(int i = 0; i < A14.length; i++){
            for(int j = 0; j < answerList.size(); j++){
               if(A14[i].equals(answerList.get(j).getA_Code())){
                  a14 = answerList.get(j).getA_Contents();
             
                  list_a14.add(a14);
                  request.setAttribute("list_a14", list_a14);
               }   
            }
         }

          forward.setPath("/detailRequestForm.jsp");
          forward.setRedirect(false);         

      return forward;
      }

}