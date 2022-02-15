package com.xworkz.passport.entity.constant;

public enum BloodGroup {

	B_POSSITIVE("B+"), AB_NEGATIVE("AB-");

	private String string;
	BloodGroup(String string) {
		System.out.println("created".getClass().getSimpleName().concat("invoked the no-arg constructor bloodGroup"));
	}
	public void setString(String string) {
		this.string = string;
	}
	public String getString() {
		return string;
	}
}
