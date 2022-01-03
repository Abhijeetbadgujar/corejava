package com.xworkz.mysql.DTO.DAO.Interface;

import com.xworkz.mysql.DTO.IceCreamDTO;
import com.xworkz.mysql.DTO.DAO.IceCreamDAO;

public class IceCreamRunner {

	public static void main(String[] args) {

		IceCreamDTO creamDTO=new IceCreamDTO(7, 200, "choclate","choclate");
		IceCreamDTO creamDTO2=new IceCreamDTO(9, 100, "venela", "venela");
		IceCreamDAO creamDAO=new IceCreamDAO();
		//creamDAO.save(creamDTO);
		//creamDAO.save(creamDTO2);
		//creamDAO.delete(7);
		creamDAO.delete(8);
	}

}
