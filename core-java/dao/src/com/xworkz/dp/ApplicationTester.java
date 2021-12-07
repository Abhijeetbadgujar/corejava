package com.xworkz.dp;

import com.xworkz.dao.ApplicationDAO;
import com.xworkz.dto.ApplicationDTO;
import com.xworkz.dto.FaceBookDTO;
import com.xworkz.dto.InstagramDTO;

public class ApplicationTester {

	public static void main(String[] args) {

		ApplicationDTO applicationDTO=new ApplicationDTO("hakker","Panther","2.0f","pune");
		ApplicationDTO applicationDTO1=new ApplicationDTO("mafiya","Panther","2.0f","aurangabad");
		ApplicationDTO applicationDTO2=new ApplicationDTO("shotter","Panther","2.0f","hubli");
		ApplicationDTO applicationDTO3=new ApplicationDTO("ridder","Panther","2.0f","delhi");
		ApplicationDTO applicationDTO4=new ApplicationDTO("jailer","Panther","2.0f","indoor");
		FaceBookDTO bookDTO=new FaceBookDTO("trakker", "pinkker", "2.4", "akshta","teju", "banglore");
		FaceBookDTO bookDTO1=new FaceBookDTO("gamer", "pinkker", "2.4", "akshta","teju", "banglore");
		FaceBookDTO bookDTO2=new FaceBookDTO("trakker", "pinkker", "2.4", "akshta","teju", "banglore");

		InstagramDTO instagramDTO=new InstagramDTO(500,"space","mafiya","Panther","mafiya","Panther");
		InstagramDTO instagramDTO1=new InstagramDTO(250,"galaxy","gomu","panter","4.3f","elon musk");
		
		
		ApplicationDAO dao=new ApplicationDAO();
		dao.save(applicationDTO);
		dao.save(applicationDTO1);
		dao.save(applicationDTO2);
		dao.save(applicationDTO3);
		dao.save(bookDTO);
		dao.save(bookDTO1);
		dao.save(instagramDTO);
		dao.save(instagramDTO1);
		
		ApplicationDTO[] app =dao.getApplicationDTOs();
		app[0]=applicationDTO;
		app[1]=applicationDTO1;
		app[2]=bookDTO;
		app[3]=bookDTO1;
		app[4]=instagramDTO;
		app[5]=instagramDTO1;
		
		for(int c=0;c<app.length;c++) {
			ApplicationDTO arg=app[c];
			if(arg!=null) {
				System.out.println("Display application Name : "+arg.getName());
				System.out.println("Display application company :"+arg.getCompany());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
		}
		FaceBookDTO[] face=dao.getFaceBookApplicationDTOs();
		//face[0]=bookDTO;
	//	face[1]=bookDTO1;
		
		for(int f=0;f<face.length;f++) {
			FaceBookDTO ref=face[f];
			if(ref!=null) {
				System.out.println("display facebook name:"+ref.getName());
				System.out.println("display application company:"+ref.getCompany());
				System.out.println("display facebook head Quater:"+ref.getHeadQuater());
				System.out.println("display facebook ceo:"+ref.getCeoName());
				System.out.println("----------------------------------------------");
				
			}
		}
		InstagramDTO[] insta=dao.getInstagramDTOs();
		insta[3]=instagramDTO;
		insta[2]=instagramDTO1;
		
		for(int i=0;i<insta.length;i++) {
			InstagramDTO ref1=insta[i];
			if(ref1!=null) {
				System.out.println("display application name:"+ref1.getName());
				System.out.println("display application company:"+ref1.getCompany());
				System.out.println("display instagram total users:"+ref1.getTotalUsers());
				System.out.println("display instagram server location:"+ref1.getServerLocation());
				System.out.println("==================================================");
			}
		}
		
	}

}
