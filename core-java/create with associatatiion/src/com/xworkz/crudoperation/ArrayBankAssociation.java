package com.xworkz.crudoperation;

public class ArrayBankAssociation {
	BankDAO dao;

	public ArrayBankAssociation(BankDAO dao) {
		super();
		this.dao = dao;
	}
	void saveBankDAO(BankDTO dto) {
		boolean ref=dao.save(dto);
		System.out.println("the save method in association :"+ref);
		System.out.println("----------------------");
	}
	void updateBankDAO(int index,BankDTO dto) {
		boolean ref1=dao.update(0, null);
			System.out.println("the update method in association:"+ref1);
			System.out.println("--------------------");
	}
	void deleteBankDAO(int index) {
		boolean ref2=dao.delete(index);
			System.out.println("the delete method in association:"+ref2);
	}
	void displayDetails() {
		dao.display();
	}
}
