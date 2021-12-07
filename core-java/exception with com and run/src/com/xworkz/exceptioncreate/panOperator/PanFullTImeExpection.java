package com.xworkz.exceptioncreate.panOperator;

public class PanFullTImeExpection extends RuntimeException {
	
	public PanFullTImeExpection() {
		System.out.println("invoked the no-arg pan full expection");
	}
	public PanFullTImeExpection(String omg) {
		super(omg);
	}
}
