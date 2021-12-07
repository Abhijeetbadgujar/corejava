package com.xworkz.bridge.VotingRules;

public class TempleRules implements DevottesRules {
	
	public TempleRules() {
		System.out.println("no- arg constructor in TempleRules");
	}
	
	@Override
	public boolean SlipperRules() {
	System.out.println("slipperRules:");
	return true;
	}
	@Override
	public boolean MakeSilence() {
		System.out.println("makeSilence:");
		return true;
	}
	@Override
	public boolean DontSplit() {
		System.out.println("dont split:");
		return true;
	}
	
}
