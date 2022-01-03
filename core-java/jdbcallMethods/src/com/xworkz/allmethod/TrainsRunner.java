package com.xworkz.allmethod;

//import com.xworkz.drone.dto.TrainDTO;

import java.util.Collection;

//import com.xworkz.drone.dao.TrainDAO;


public class TrainsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrainsDTO dto1=new TrainsDTO(1,26,900.00,"A","b","ac");
		TrainsDTO dto2=new TrainsDTO(2,52,1700.00,"A","b","midium");
		TrainsDTO dto3=new TrainsDTO(3,15,400.00,"A","b","seat");
		TrainsDTO dto4=new TrainsDTO(4,8,150.00,"A","b","ac");
		TrainsDTO dto5=new TrainsDTO(6,26,800.00,"A","b","midium");
		TrainsDTO dto6=new TrainsDTO(7,26,200.00,"A","b","seat");
		
		TrainsDAO dao=new TrainsDAO();
		dao.save(dto1);
	

	}

}
