package com.xworkz.exceptioncreate.panOperator;

public class PanValidationExpection extends Exception  {
	
	public PanValidationExpection(){
		System.out.println("invoked the no-arg pan valid expection constructor");
	}
	public PanValidationExpection(String msg) {
		super(msg);
	}
}
