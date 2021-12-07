package com.xworkz.dp;
import com.xworkz.dao.*;
import com.xworkz.dto.MetroStationDTO;
import com.xworkz.dto.Route;

public class MetroStationTester {

	public static void main(String[] args) {
		MetroStationDTO metroStationDTO=new MetroStationDTO("namma",Route.LALBAGH,3,"5AM","9PM");
		MetroStationDTO metroStationDTO1=new MetroStationDTO("kiyto",Route.JPROAD,4,"5AM","9PM");
		MetroStationDTO metroStationDTO2=new MetroStationDTO("osaka",Route.SILKROAD,6,"5AM","9PM");
		MetroStationDTO metroStationDTO3=new MetroStationDTO("hiroshima",Route.SPROAD,7,"5AM","9PM");
		MetroStationDTO metroStationDTO4=new MetroStationDTO("tokiyo",Route.LALBAGH,8,"5AM","9PM");
		
		MetroStationDAO dto=new MetroStationDAO();
		dto.save(metroStationDTO);
		dto.save(metroStationDTO1);
		dto.save(metroStationDTO2);
		dto.save(metroStationDTO3);
		dto.save(metroStationDTO4);
	
		MetroStationDTO[] result=dto.getMetroStationDTOs();
		
		for(int i=0;i<result.length;i++) {
			MetroStationDTO res=result[i];
			if(res!=null) {
				System.out.println("name of metro :"+res.getName());
			}
			else {
				System.err.println("index is not pointing ");
			}
		}	
		
	}
	
	
}
