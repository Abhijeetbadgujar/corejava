package com.xworkz.dp;

import com.xworkz.dto.CameraDTO;

import com.xworkz.dao.*;

public class CameraTester {

	public static void main(String[] args) {
		
		CameraDTO camera=new CameraDTO("samsun","DSLR",512,50000,"good",6.5f,"2.o");
		CameraDTO camera1=new CameraDTO("iphone","DSLR",128,50000,"good",6.5f,"2.o");
		CameraDTO camera2=new CameraDTO("pixel","DSLR",212,50000,"good",6.5f,"2.o");
		CameraDTO camera3=new CameraDTO("lg","DSLR",1080,50000,"good",6.5f,"2.o");
		CameraDTO camera4=new CameraDTO("canon","DSLR",2010,50000,"good",6.5f,"2.o");
		CameraDTO camera5=new CameraDTO("samsun","DSLR",7020,100000,"good",6.5f,"2.o");

		CameraDAO cam=new CameraDAO();
		cam.save(camera);
		cam.save(camera1);
		cam.save(camera2);
		cam.save(camera4);
		cam.save(camera3);
		cam.save(camera5);
		
		CameraDTO[] cameraDTOs=cam.getCameraDTOs();
		
		for(int i=0;i<cameraDTOs.length;i++) {
			CameraDTO res=cameraDTOs[i];
			if(res!=null) {
				System.out.println("the company name is "+res.getCompany()+" and the is "+res.getPixel());
			}
			else {
				System.err.println(" error");
			}
		}
	}

}
