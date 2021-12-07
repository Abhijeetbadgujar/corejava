package com.xworkz.bridge.VotingRules;

public class TempleAssociation{
	private DevottesRules devottesRules;
	private String associationName;
	
	public TempleAssociation() {
		System.out.println("invoked the TempleAssociation no- arg constructor");
	}
	
	public TempleAssociation(DevottesRules devottesRules, String associationName) {
		super();
		this.devottesRules = devottesRules;
		this.associationName = associationName;
	}
	public void allowDevottessRules() {
		System.out.println("invoked the allow Devottes");
		if(this.devottesRules!=null) {
			System.out.println("invoked devottes ruels");
			boolean SlipperRules=this.devottesRules.SlipperRules();
			if(SlipperRules) {
				boolean MakeSilence=this.devottesRules.MakeSilence();
				boolean DontSplit=this.devottesRules.DontSplit();
				if(MakeSilence && DontSplit) {
					System.out.println("invoked makedSilence and Dont split");
				}else {
					System.err.println("dont make silence and dont split");
				}
				System.out.println("slipper is off");
			}else {
				System.err.println("please leave your slipper");
			}
			
		}
		else {
			System.err.println("devottes not allow");
		}
	}
	
	
}
