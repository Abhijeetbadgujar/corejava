package com.xworkz.exceptioncreate.panOperator;

import javax.management.RuntimeErrorException;

public class PanOperator {
	private String[] panOperators=new String[4];
	private int counter=0;
	
	public PanOperator() {
		System.out.println("invoked the Pan operator no-arg constructor");
	}
	public void save(String operator)throws PanValidationExpection {
		if(operator!=null && counter<=this.panOperators.length) {
			System.out.println("operator is not null");
			if(operator.contains("EE") && operator.endsWith(operator)){
				System.out.println(" memory not is full ");
			}
			else {
				System.err.println("memory is full");
				throw new PanValidationExpection();
			}
		}else {
			System.err.println("operator is null");
			throw new RuntimeErrorException(null);
		}
	}
	
}
