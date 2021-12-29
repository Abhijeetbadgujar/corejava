package com.xworkz.mysql.DTO.DAO.Interface;

import com.xworkz.mysql.DTO.ClubDTO;
import com.xworkz.mysql.DTO.DAO.ClubDAO;

public class ClubScammer {

	public static void main(String[] args) {

		ClubDTO dto=new ClubDTO(2, "mama",4,2000);
		ClubDAO dao=new ClubDAO();
		dao.save(dto);
	}

}
