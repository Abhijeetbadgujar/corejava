package com.xworkz.bridge.VotingRules.citizen;

import com.xworkz.bridge.VotingRules.DevottesRules;
import com.xworkz.bridge.VotingRules.DevottesRules;
import com.xworkz.bridge.VotingRules.TempleAssociation;
import com.xworkz.bridge.VotingRules.TempleRules;

public class TempleHakker {

	public static void main(String[] args) {
		
		//DevottesRules DevottesRules1=new DevottesRules();
		DevottesRules devoteeRule=new TempleRules();
		TempleAssociation templeAssociation=new TempleAssociation(devoteeRule,"Iskon");
		//TempleAssociation templeAssociation =new TempleAssociation();
		templeAssociation.allowDevottessRules();
		
	}
	
}
