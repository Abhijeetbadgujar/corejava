package com.xworkz.methods.stream;

import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AirportName {

	public static void main(String[] args) {

		 String airport=" Rajiv Gandhi International Airport";
		 String airport1="Sri Guru Ram Dass Jee International Airport";
		 String airport2=" Lokpriya Gopinath Bordoloi International Airport";
		 String airport3=" Biju Patnaik International Airport";
		 String airport4="Saya Airport";
		 String airport5=" Indira Gandhi International Airport";
		 String airport6="Veer Savarkar International Airport";
		 String airport7="Sardar Vallabhbhai Patel International Airport";
		 String airport8="Kempegowda International Airport";
		 String airport9="Mangalore International Airport";
		 String airport10="Cochin International Airport";
		 String airport11="Calicut International Airport";
		 String airport12="Trivandrum International Airport";
		 String airport13=" Chhatrapati Shivaji Maharaj International Airport";
		 String airport14="Dr. Babasaheb Ambedkar International Airport";
		 String airport15="Jaipur International Airport";
		 String airport16="Chennai International Airport";
		 String airport17="Tiruchirappalli International Airport";
		 String airport18="SAL BAHADUR SHASTRI INTERNATIONAL AIRPORT";
		 String airport19="SURAT AIRPORT";

		 Stream<String> stream=Stream.of(airport,airport1,airport2,airport3,airport4,airport5,airport6,airport7,airport8,airport9,airport10,
				 airport11,airport12,airport13,airport14,airport15,airport16,airport17,airport18,airport19);
		 List<String> list=stream.filter(s-> s.startsWith("S")).collect(Collectors.toList());
		 list.forEach(e-> System.out.println(e));
		 System.err.println("-----------------------------");	
		 
		 Stream<String> stream1=Stream.of(/*airport,airport1,airport2,airport3,airport4,airport5,airport6,airport7,airport8,airport9,airport10,
				 airport11,airport12,airport13,airport14,airport15,airport16,airport17,*/airport18,airport19);
		 List<String> list1=stream1.parallel().map(l->l.toLowerCase()).collect(Collectors.toList());//sorted().filter(l-> l.toLowerCase()).collect(Collectors.toList());
		 list1.forEach(r-> System.out.println(r));
		 System.err.println("------------------------------");
	}
		
}
