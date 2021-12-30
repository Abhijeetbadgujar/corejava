package com.xworkz.mysql.DTO.DAO.Interface;

import com.xworkz.mysql.DTO.ClubDTO;
import com.xworkz.mysql.DTO.CountryDTO;
import com.xworkz.mysql.DTO.DAO.ClubDAO;
import com.xworkz.mysql.DTO.DAO.CountryDAO;

public class CountryRunner {

	public static void main(String[] args) {

		CountryDTO dto=new CountryDTO(2, 430119,"india","dilhi");
		CountryDTO dto1=new CountryDTO(4,344432,"germany","berlin");
		CountryDAO dao=new CountryDAO();
		dao.save(dto1);
		dao.delete(2);
	}

}
