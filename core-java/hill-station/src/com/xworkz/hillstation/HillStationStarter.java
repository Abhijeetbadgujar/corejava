package com.xworkz.hillstation;

//import com.xworkz.hillstation.state.HillStation;
import com.xworkz.hillstation.state.NandiHillStation;

public class HillStationStarter {

	public static void main(String[] args) {

		// parent ref = child instance
		// class type =new instance
		// instance var = literals, const,methods and ref
		NandiHillStation hillStation = new NandiHillStation("Nandi", 1400);
		System.out.println(hillStation.name);
		System.out.println(hillStation.elevation);
		// The method updateElevation(int) is undefined for the type HillStation
		((NandiHillStation) hillStation).updateElevation(1500);
		System.out.println(hillStation.elevation);

		String rep = hillStation.toString();
		System.out.println(rep);
		System.out.println(hillStation);
		System.out.println(hillStation.hashCode());
		String name = "Xworkz";
		System.out.println(name.hashCode());
	}

}
