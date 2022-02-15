package com.xworkz.passport.entity.constant;

public enum Gender {
	MALE('M'),FEMELE('F'),OTHER('O');

	private char c;
	 Gender(char c) {
		System.out.println(this.getClass().getSimpleName().concat("invoked the no-arg constructor"));
		this.c=c;	
	}
	 public void setC(char c) {
		this.c = c;
		
	}
	 public char getC() {
		return c;
	}

}
