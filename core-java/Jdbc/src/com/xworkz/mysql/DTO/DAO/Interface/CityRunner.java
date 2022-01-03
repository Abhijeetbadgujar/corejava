package com.xworkz.mysql.DTO.DAO.Interface;

import com.xworkz.mysql.DTO.CityDTO;
import com.xworkz.mysql.DTO.DAO.CityDAO;

public class CityRunner {

	public static void main(String[] args)  {

		CityDTO dto=new CityDTO(8, "pune", "study",800000L);
		CityDAO dao=new CityDAO();
		dao.save(dto);
	}

}
