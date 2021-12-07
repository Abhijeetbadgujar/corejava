package com.xworkz.crudoperation;

public interface BankDAO {
	boolean save(BankDTO bankDTO);
	boolean update(int index, BankDTO bankDTO);
	boolean delete(int index);
	void display();
	
}
