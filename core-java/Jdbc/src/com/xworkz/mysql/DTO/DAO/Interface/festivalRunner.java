package com.xworkz.mysql.DTO.DAO.Interface;

import com.xworkz.mysql.DTO.FestivalDTO;
import com.xworkz.mysql.DTO.DAO.FestivalDAO;

public class festivalRunner {

	public static void main(String[] args) {

		FestivalDTO festivalDTO =new FestivalDTO("diwali", 28, "crakers", 3);
		FestivalDAO dao=new FestivalDAO();
		dao.save(festivalDTO);
	}

}
