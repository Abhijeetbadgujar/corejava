package com.xworkz.crudoperation;

public class ArrayBankDAO implements BankDAO {
	private BankDTO[] arrayBankDTO = new BankDTO[9];
	private int counter = 0;

	@Override
	public boolean save(BankDTO bankDTO) {
		if (bankDTO != null) {
			this.arrayBankDTO[counter] = bankDTO;
			System.out.println("the save method in ArrayBankDAO:" + bankDTO);
			return true;
		}
		return false;
	}
	@Override
	public boolean update(int index, BankDTO bankDTO) {
		if (index <= 0 && index <= this.arrayBankDTO.length) {
			this.arrayBankDTO[index] = bankDTO;
			System.out.println("the update method in ArrayBankDAO:" + bankDTO);
			return false;
		}
		return true;
	}

	@Override
	public boolean delete(int index) {
		if(index<=0 && index<= this.arrayBankDTO.length) {
			this.arrayBankDTO[index]=null;
			System.out.println("the delete method in ArrayBankDAO, the delete found");
		}
		return false;
	}

	@Override
	public void display() {
		for(int money=0;money<this.arrayBankDTO.length;money++) {
			if(this.arrayBankDTO[money]!=null) {
				System.out.println(arrayBankDTO[money].getName());
				System.out.println(arrayBankDTO[money].getId());
				System.out.println(arrayBankDTO[money].getBranch());
				System.out.println(arrayBankDTO[money].getIfsc());
			}
		}
	
	}
}
