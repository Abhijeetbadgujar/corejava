package com.xworkz.bridge.VotingRules.citizen;

import com.xworkz.bridge.VotingRules.*;
public abstract class IndianCitizen implements VotingRule,TrafficRule,MarriagRule{
	protected int validAge;
	public String validId="kim gi won";
	public boolean validLicense=true;
	public String licenseNo="ricipt123";
	public boolean validInsurance=true;

	@Override
	public int validAge() {
		this.validAge=21;
		System.out.println("voting age:"+validAge);
		return 12;
	}	
	@Override
	public String validId() {
		System.out.println("vlid id:"+validId);
		return null;
	}
	
	@Override
	public boolean validLicense() {
		System.out.println("valid License:"+validLicense);
		return false;
	}
	@Override
	public String licenseNo() {
		System.out.println("License Number:"+licenseNo);
		return null;
	}
	@Override
	public boolean validInsurance() {
		System.out.println("validInsurance:"+validInsurance);
		return false;
	}
	
	/*public boolean MarrigRule() {
		super.validAge('M', 24);
		//System.out.println("validAge:"+MarriagRule);
		System.out.println("marrige gender:"+gender);
		System.out.println("person age:"+age);
		return false;
	}*/
	
}
