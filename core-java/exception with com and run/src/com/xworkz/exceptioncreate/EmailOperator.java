package com.xworkz.exceptioncreate;

import javax.management.RuntimeErrorException;

public class EmailOperator {
	private String[] emailOperators=new String[5];
	private int counter=0;
	
	public EmailOperator() {
		System.out.println("invoked the no-arg email operator constructor");
	}
	public void save(String operator)throws EmailValidationExpection {
		System.out.println("invoked the save method");
		if(counter<this.emailOperators.length && counter>=0) {
			this.emailOperators[counter++]=operator;
			System.out.println("value in memory or it not full memory:"+operator);
			if(operator.contains("@") && operator.endsWith(".com") || operator.endsWith(".in")) {
				System.out.println("in value in mandetory");
				
			}else {
				System.err.println("show the compile time exception");
				throw new EmailValidationExpection();
			}
		}else {
			System.err.println("show the run time exception	");
			throw new RuntimeErrorException(null);
		}
	}
}

