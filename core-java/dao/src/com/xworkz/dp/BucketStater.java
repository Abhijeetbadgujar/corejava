package com.xworkz.dp;

import com.xworkz.dto.BucketDTO;
import com.xworkz.dao.BucketDAO;

public class BucketStater {

	public static void main(String[] args) {
		
		BucketDTO bucket=new BucketDTO();
		BucketDTO bucket1=new BucketDTO("black","lakxmi",10,25,100,25.3f);
		BucketDTO bucket2=new BucketDTO("red","lakxmi",10,25,100,25.3f);
		BucketDTO bucket3=new BucketDTO("blue","lakxmi",10,25,100,25.3f);
		
		
		BucketDAO bucKetDAO=new BucketDAO();
		bucKetDAO.save(bucket1);
		bucKetDAO.save(bucket2);
		bucKetDAO.save(bucket3);
		bucKetDAO.delete(1);
		bucKetDAO.update(2, null);
		
		BucketDTO[] ref=bucKetDAO.getBucketdto();
		
		for(int i=0;i<ref.length;i++) {
			BucketDTO result=ref[i];
			if(result!=null) {
				System.out.println(result.getColour());
				System.out.println(result.getCompany());
			}
			else {
				System.err.println("error");
			}
		}
		
		
	}

}
