package com.xworkz.passport.entity.constant;

public enum VerifiedDocument {

	ADARCARD('A'), PANCARD('P'), CRIMIALRECORD('C');

	private char c;

	VerifiedDocument(char c) {
		System.out.println(
				"created".getClass().getSimpleName().concat("invoked the no-arg constructor in verifiedDocument"));
	}

	public void setC(char c) {
		this.c = c;
	}

	public char getC() {
		return c;
	}
}
