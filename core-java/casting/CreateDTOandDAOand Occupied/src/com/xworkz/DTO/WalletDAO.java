package com.xworkz.DTO;

public class WalletDAO {
	
	private WalletDTO[] wallDTOs=new WalletDTO[12];
	private int ameba=0;
	
	public WalletDAO() {
		System.out.println("invoked the no-parameterized constructor");
	}
	public void create(WalletDTO name) {
		System.out.println("invoked the create method");
		if(ameba<this.wallDTOs.length ) {
			this.wallDTOs[this.ameba++]=name;
			System.out.println("create the company name: "+name.getCompany());
		}else {
			System.err.println("index is full");
		}
	}
	public void create(WalletDTO name,int no) {
		System.out.println("invoked the create by two parameter or overloading ");
		if(ameba<this.wallDTOs.length && name!=null && no>=0) {
			this.wallDTOs[no++]=name;
		}else {
			System.err.println("index is full in overloading");
		}
	}
	
	public void IndexOccupied() {
		System.out.println("index occupied : "+ameba);
	}
	public boolean matchTerm(String material) {
		for(int match=0;match<this.wallDTOs.length;match++) {
		WalletDTO ref=wallDTOs[match];
		if(ref!=null) {
			System.out.println("referance of index is not full: ".concat(String.valueOf(ref)));
			String ref1=ref.getCompany();
			if(material.equals(ref1)) {
				System.out.println("system is found");
				return true;
			}
		}
		
		}
		return false;
	}
	public WalletDTO[] getDtos() {
	return wallDTOs;
	}
}
