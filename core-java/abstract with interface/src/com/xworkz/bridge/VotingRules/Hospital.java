package com.xworkz.bridge.VotingRules;

public class Hospital {
	private String stateName;
	private String location;
	private boolean govt;
	private HospitalAdmitRule hospitalAdmitRule;
	private HospitalDischargeRules hospitalDischargeRule;

	public Hospital() {
		System.out.println("Invoked the hosital constructor which is no-arg");
	}

	public Hospital(String stateName, String location, boolean govt, HospitalAdmitRule hospitalAdmitRule,
			HospitalDischargeRules hospitalDischargeRule) {
		super();
		this.stateName = stateName;
		this.location = location;
		this.govt = govt;
		this.hospitalAdmitRule = hospitalAdmitRule;
		this.hospitalDischargeRule= hospitalDischargeRule;

	}

	public void allowPatient() {
		System.out.println("invoked the allowpatient");
		if(hospitalAdmitRule!=null) {
			System.out.println("invoked the hospital admit rules");
			String register=hospitalAdmitRule.register();
			System.out.println("patient register"+register);
			double payAdvance=this.hospitalAdmitRule.payAdvance();
			System.out.println("first pay advance fees:"+payAdvance);
			boolean validInsurance=this.hospitalAdmitRule.validInsurance();
			System.out.println("patient valid insurance:"+validInsurance);
			if(payAdvance>=20 && validInsurance==true) {
				System.out.println("pay advance");
				if(validInsurance) {
					System.out.println("insurance is their so no need to pay");
					
				}
				else {
					System.err.println("insurance not then its dead");
				}
			}
		}
	
	}
	public void exitPatient() {
		System.out.println("invoked the exitPatient");
		if(hospitalDischargeRule!=null) {
			System.out.println("invoked the discharge rules");
			boolean payBill=this.hospitalDischargeRule.payBill();
			System.out.println("Pay bill is paid or not:"+payBill);
			double discount=this.hospitalDischargeRule.discount();
			System.out.println("patient have discount:"+discount);
			if(payBill==true && discount==0) {
				System.out.println("relize patient");
			}
			if(payBill) {
				System.out.println("apply the discount");
			}
			else {
				System.err.println("dont give the discount");
			}
		}
	}
}