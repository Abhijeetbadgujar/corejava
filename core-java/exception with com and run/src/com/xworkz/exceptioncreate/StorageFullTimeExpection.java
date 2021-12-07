package com.xworkz.exceptioncreate;

public class StorageFullTimeExpection extends RuntimeException{

	public StorageFullTimeExpection() {
		System.out.println("invoked the Stroage full time expection constructor");	
	}
	public StorageFullTimeExpection(String msd) {
		super(msd);
		
	}
}
