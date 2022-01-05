package com.xworkz.allmethod;

//import com.xworkz.drone.dto.TrainDTO;

import java.util.Collection;

//import com.xworkz.drone.dao.TrainDAO;


public class TrainsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrainsDTO dto1=new TrainsDTO(1,33993,26,900,"A","b","ac");
//		TrainsDTO dto2=new TrainsDTO(2,28383,52,1700,"A","b","midium");
//		TrainsDTO dto3=new TrainsDTO(3,43892,15,400,"A","b","seat");	
//		TrainsDTO dto4=new TrainsDTO(4,58433,8,150,"A","b","ac");
//		TrainsDTO dto5=new TrainsDTO(6,34983,26,800,"A","b","midium");
//		TrainsDTO dto6=new TrainsDTO(7,45932,26,200,"A","b","seat");
		
		TrainsDAO dao=new TrainsDAO();
		dao.save(dto1);
	

	}

}
