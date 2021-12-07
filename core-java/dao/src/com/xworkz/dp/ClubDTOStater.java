package com.xworkz.dp;

import com.xworkz.dto.ClubDTO;
import com.xworkz.dao.*;
public class ClubDTOStater {

	public static void main(String[] args) {
		
		 ClubDTO club = new ClubDTO(10,20,5,200,100);
		 ClubDTO club1 = new ClubDTO(10,20,5,200,100);
		 ClubDTO club2 = new ClubDTO(10,20,5,200,100);
		 ClubDTO club3 = new ClubDTO(10,20,5,200,100);
		 ClubDTO club4 = new ClubDTO(10,20,5,200,100);
		 ClubDTO club5 = new ClubDTO(10,20,5,200,100);
		
		 ClubDTO clb=new ClubDTO();
		 clb.save(club);
		 clb.save(club1);
		 clb.save(club2);
		 clb.save(club3);
		 clb.save(club4);
		 clb.save(club5);
		
	}

}
