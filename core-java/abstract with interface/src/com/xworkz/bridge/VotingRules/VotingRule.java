package com.xworkz.bridge.VotingRules;

import jdk.internal.dynalink.linker.LinkerServices.Implementation;

public interface VotingRule {
	int validAge();
	String validId();
}
