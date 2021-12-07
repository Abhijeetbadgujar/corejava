package com.xworkz.crudoperation;

public class BankStater {

	public static void main(String[] args) {

		BankDTO bankDTOs=new BankDTO("23436234252536","deutsch","iwef3455","BTM");
		
		BankDAO bankDAO=new ArrayBankDAO();
		ArrayBankAssociation arrayBankAssociation=new ArrayBankAssociation(bankDAO);
		arrayBankAssociation.updateBankDAO(5, null);
		arrayBankAssociation.saveBankDAO(null);
		arrayBankAssociation.deleteBankDAO(0);
		arrayBankAssociation.displayDetails();
	}

}
