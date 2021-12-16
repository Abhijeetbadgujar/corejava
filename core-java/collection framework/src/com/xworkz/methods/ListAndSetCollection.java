package com.xworkz.methods;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListAndSetCollection {

	public static void main(String[] args) {

		System.out.println("phone no");
		System.out.println("List collection");
		List<Long> list = new LinkedList<Long>();
		list.add(7276759230l);
		list.add(7249347298l);
		list.add(2348309428l);
		list.add(9035385784l);
		list.add(8934565365l);
		list.add(7834253454l);
		list.add(9035729457l);
		list.add(6874583797l);
		list.add(9834526876l);
		list.add(7245798437l);
		System.out.println("asending order...");
		Collections.sort(list);
		// System.out.println(list);
		Iterator<Long> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("--------------------------");
		System.out.println("descending order...");
		Collections.sort(list, Collections.reverseOrder());
		Iterator<Long> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.err.println("**************************");
		
		System.out.println("set collection");
		Set<Long> set = new TreeSet<Long>();
		set.add(7276759230l);
		set.add(7249347298l);
		set.add(2348309428l);
		set.add(9035385784l);
		set.add(8934565365l);
		set.add(7834253454l);
		set.add(9035729457l);
		set.add(6874583797l);
		set.add(9834526876l);
		set.add(7245798437l);
		System.out.println("asending order...");
		// Collections.sort(set);
		Iterator<Long> iterator2 = set.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		System.out.println("--------------------------");
		System.out.println("descending order..."+"/n");
		Collections.sort(list, Collections.reverseOrder());
		Iterator<Long> iterator3 = set.iterator();
		while (iterator3.hasNext()) {
			System.out.println(iterator3.next());
		}

		System.out.println("train NO");
		System.out.println("List collection");
		List<Long> list1=new LinkedList<Long>();
		list1.add(234533l);
		list1.add(544533l);
		list1.add(734533l);
		list1.add(434533l);
		list1.add(454533l);
		list1.add(834533l);
		list1.add(934533l);
		list1.add(564533l);
		list1.add(344533l);
		list1.add(774533l);
		System.out.println("ascending order");
		Collections.sort(list1);
		Iterator<Long> iterator4= list1.iterator();
		while(iterator4.hasNext()) {
			System.out.println(iterator4.next());
		}
		System.out.println("--------------------------");
		System.out.println("descending order...");
		Collections.sort(list1, Collections.reverseOrder());
		Iterator<Long> iterator5=list.iterator();
		while(iterator5.hasNext()) {
			System.out.println(iterator5.next());
		}
		System.err.println("****************************");
		System.out.println("Set collection");
		Set<Long> set2=new TreeSet<Long>();
		set2.add(234533l);
		set2.add(544533l);
		set2.add(734533l);
		set2.add(434533l);
		set2.add(454533l);
		set2.add(834533l);
		set2.add(934533l);
		set2.add(564533l);
		set2.add(344533l);
		set2.add(774533l);
		System.out.println("ascending order...");
		Iterator<Long> iterator6=set2.iterator();
		while(iterator6.hasNext()) {
			System.out.println(iterator6.next());
		}
		System.out.println("-----------------------------");
		System.out.println("descending order...");
		//Collections.sort(set2, Collections.reverseOrder());
		Iterator<Long> iterator7 = set2.iterator();
		while (iterator7.hasNext()) {
			System.out.println(iterator7.next());
		}
		
		System.out.println("developer");
		System.out.println("List collection");
		List<String> list2=new LinkedList<String>();
		list2.add("abhi");
		list2.add("gomu");
		list2.add("pappu");
		list2.add("kiran");
		list2.add("varsha");
		list2.add("teju");
		list2.add("thrishul");
		list2.add("rakesh");
		list2.add("ayyappa");
		list2.add("renu");
		System.out.println("ascending order");
		Collections.sort(list2);
		Iterator<String> iterator8= list2.iterator();
		while(iterator8.hasNext()) {
			System.out.println(iterator8.next());
		}
		System.out.println("--------------------------");
		System.out.println("descending order...");
		Collections.sort(list2, Collections.reverseOrder());
		Iterator<String> iterator9=list2.iterator();
		while(iterator9.hasNext()) {
			System.out.println(iterator9.next());
		}
		System.err.println("****************************");
		System.out.println("Set collection");
		Set<String> set3=new TreeSet<String>();
		set3.add("abhi");
		set3.add("gomu");
		set3.add("pappu");
		set3.add("kiran");
		set3.add("varsha");
		set3.add("teju");
		set3.add("thrishul");
		set3.add("rakesh");
		set3.add("ayyappa");
		set3.add("renu");
		System.out.println("ascending order...");
		Iterator<String> iterator10=set3.iterator();
		while(iterator10.hasNext()) {
			System.out.println(iterator10.next());
		}
		System.out.println("-----------------------------");
		System.out.println("descending order...");
		//Collections.sort(set3, Collections.reverseOrder());
		Iterator<String> iterator11= set3.iterator();
	
		while (iterator11.hasNext()) {
			System.out.println(iterator11.next());
		}
		
		System.out.println("product base companies");
		System.out.println("List collection");
		List<String> list3=new LinkedList<String>();
		list3.add("intel");
		list3.add("mobability");
		list3.add("trinity mobality");
		list3.add("adobe");
		list3.add("amazon");
		list3.add("cisco");
		list3.add("amdocs");
		list3.add("facebook");
		list3.add("google");
		list3.add("microsoft");
		System.out.println("ascending order");
		Collections.sort(list3);
		Iterator<String> iterator15= list3.iterator();
		while(iterator15.hasNext()) {
			System.out.println(iterator15.next());
		}
		System.out.println("--------------------------");
		System.out.println("descending order...");
		Collections.sort(list3, Collections.reverseOrder());
		Iterator<String> iterator16=list3.iterator();
		while(iterator16.hasNext()) {
			System.out.println(iterator16.next());
		}
		System.err.println("****************************");
		System.out.println("Set collection");
		Set<String> set4=new TreeSet<String>();
		set4.add("intel");
		set4.add("mobability");
		set4.add("trinity mobality");
		set4.add("adobe");
		set4.add("amazon");
		set4.add("cisco");
		set4.add("amdocs");
		set4.add("facebook");
		set4.add("google");
		set4.add("microsoft");
		System.out.println("ascending order...");
		Iterator<String> iterator17=set4.iterator();
		while(iterator17.hasNext()) {
			System.out.println(iterator17.next());
		}
		System.out.println("-----------------------------");
		System.out.println("descending order...");
		//Collections.sort(set3, Collections.reverseOrder());
		Iterator<String> iterator18= set4.iterator();
	
		while (iterator18.hasNext()) {
			System.out.println(iterator18.next());
		}
		
		System.out.println("Indian IT giants");
		System.out.println("List collection");
		List<String> list4=new LinkedList<String>();
		list4.add("wipro");
		list4.add("infosys");
		list4.add("accenture");
		list4.add("tcs");
		list4.add("IBM");
		list4.add("oracle");
		list4.add("cognizant");
		list4.add("capgemini");
		list4.add("google");
		list4.add("microsoft");
		System.out.println("ascending order");
		Collections.sort(list4);
		Iterator<String> iterator21= list4.iterator();
		while(iterator21.hasNext()) {
			System.out.println(iterator21.next());
		}
		System.out.println("--------------------------");
		System.out.println("descending order...");
		Collections.sort(list4, Collections.reverseOrder());
		Iterator<String> iterator22=list4.iterator();
		while(iterator22.hasNext()) {
			System.out.println(iterator22.next());
		}
		System.err.println("****************************");
		System.out.println("Set collection");
		Set<String> set5=new TreeSet<String>();
		set5.add("wipro");
		set5.add("infosys");
		set5.add("accenture");
		set5.add("tcs");
		set5.add("IBM");
		set5.add("oracle");
		set5.add("cognizant");
		set5.add("capgemini");
		set5.add("google");
		set5.add("microsoft");
		System.out.println("ascending order...");
		Iterator<String> iterator23=set5.iterator();
		while(iterator23.hasNext()) {
			System.out.println(iterator23.next());
		}
		System.out.println("-----------------------------");
		System.out.println("descending order...");
		//Collections.sort(set3, Collections.reverseOrder());
		Iterator<String> iterator24= set5.iterator();
	
		while (iterator24.hasNext()) {
			System.out.println(iterator24.next());
		}
}
}