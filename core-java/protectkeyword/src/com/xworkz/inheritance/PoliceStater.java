package com.xworkz.inheritance;

import com.xworkz.inheritance.dewali.CrimePolice;

public class PoliceStater {

	public static void main(String[] args) {

		CrimePolice crimePolice=new CrimePolice();
		TrafficPolice police=new TrafficPolice();
		crimePolice.testMethod();
		police.testMethod();
	}

}
