package com.xworkz.Stater;

import com.xworkz.DTO.IPLDAO;
import com.xworkz.DTO.IPLDTO;
//import com.xworkz.DAO.*;

public class IPLStater {

	public static void main(String[] args) {
		IPLDTO ipldto = new IPLDTO(8, 10, "vijay mallya", "kukar");
		IPLDTO ipldto1 = new IPLDTO(3, 11, "vijay arjun", "pan");
		IPLDTO ipldto2 = new IPLDTO(4, 12, "trishul", "BMW");
		IPLDTO ipldto3 = new IPLDTO();

		IPLDAO bat = new IPLDAO();
		bat.save(ipldto);
		
		bat.create(new IPLDTO(4, 12, "trishul", "BMW"),2);
		bat.noOfIndexFull();
		bat.matchTeamByName("trishul");
		System.out.println("`````````````````````");
		
		IPLDTO[] array = bat.getIpldtos();
		
		for (int a = 0; a < array.length; a++) {
			IPLDTO arr = array[a];
			System.out.println("~~~~~~~~~~");
			if (arr != null) {
				System.out.println("no of team: " + arr.getNoOfTeams());
				System.out.println("no of coutch: ".concat(String.valueOf(arr.getNoOfcoutch())));
				System.out.println("owner name: " + arr.getOwner());
				System.out.println("sponcer name: ".concat(String.valueOf(arr.getSponcer())));
			} else {
				System.err.println("error");
			}
		}

	}

}
