package com.xworkz.bridge.VotingRules;

public class Patient implements HospitalAdmitRule,HospitalDischargeRules{
	
	@Override
	public String register() {
		System.out.println("invoked the register");
		return null;
	}
	@Override
	public double payAdvance() {
		System.out.println("invoked the payAdvance");
		return 0.2;
	}
	@Override
	public boolean validInsurance() {
		System.out.println("invoked the validInsurance");
		return true;
	}
	@Override
	public boolean payBill() {
		System.out.println("invoked the payBill");
		return true;
	}
	@Override
	public double discount() {
		System.out.println("Invoked the discount");
		return 2.3;
	}
	
}

