package com.xworkz.exceptioncreate;

public class EmailValidationExpection extends Exception{
	
	public EmailValidationExpection() {
		super();
		System.out.println("invoked the no-arg EmailValiadationexpection constructor");
	}
	
	public EmailValidationExpection(String operators) {
		super(operators);

	}
}
