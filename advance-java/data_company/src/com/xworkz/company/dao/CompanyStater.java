package com.xworkz.company.dao;

import com.xworkz.company.entity.CompanyEntity;

public class CompanyStater {

	public static void main(String[] args) {

		CompanyEntity companyEntity=new CompanyEntity(3, "Abhi cargo software", "planes", "online", "www.AbhiCargo.com");
		CompanyInterface companyInterface=new CompanyDAOImplement();
		companyInterface.create(companyEntity);
	}

}
