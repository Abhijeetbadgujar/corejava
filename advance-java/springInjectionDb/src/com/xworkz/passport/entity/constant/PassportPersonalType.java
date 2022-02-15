package com.xworkz.passport.entity.constant;

public enum PassportPersonalType {
	REGULAR('R'), DIPLOMATIC('D');

	private char value;

	PassportPersonalType(char value) {
		System.out.println(
				this.getClass().getSimpleName().concat("invoked the no-arg constructor in passportpersonalType"));
	}

	private void setvalue(char value) {
		this.value = value;
	}

	public char getValue() {
		return value;
	}

}
