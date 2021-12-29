package com.xworkz.methods.keyAndValuesDTO;

import java.util.ArrayList; 
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import com.xworkz.methods.operational.MLADTO;
import com.xworkz.methods.operational.MLADTOName;

public class PersonDTORunner {

	public static void main(String[] args) {

		Map<PersonDTO, String> map = new HashMap<PersonDTO, String>();
		map.put(new PersonDTO(1, "abhi", 22, "Pass@123"), "BLR");
		map.put(new PersonDTO(4, "gomu", 30, "Pass@153"), "BLR");
		map.put(new PersonDTO(3, "kiran", 40, "Pass@12323"), "BLR");
		map.put(new PersonDTO(2, "thrishul", 50, "Pass@1643523"), "BLR");
		map.put(new PersonDTO(1, "rakesh", 60, "Passsss@123"), "BLR");
		List<String> collect = map.keySet().stream().map(x -> x.getName()).collect(Collectors.toList());
		System.out.println(collect);
		System.out.println("------------------------");

        System.out.println("read only key...");
		Set<PersonDTO> set=map.keySet(); 
		set.stream().sorted().forEach(u->System.out.println(u));
		System.out.println("---------------------");

		
		System.out.println("read only value...");
		Collection<String> set2=map.values();
		set2.stream().sorted(Comparator.reverseOrder()).forEach(i->System.out.println(i));
		System.out.println("---------------------");
		
		System.out.println("read key and value");
		Set<Entry<PersonDTO, String>> set1=map.entrySet();
		set1.stream().forEach(y->System.out.println(y));
		System.out.println("-----------------------");

		System.out.println("ascending using comparable...");
		Set<PersonDTO> set3=map.keySet();
		set3.stream().sorted().map(j->j).forEach(d->System.out.println(d));
	    //set3.keyset().stream().sorted().forEach((d)->System.out.println(d ));
		System.out.println("---------------------");
		System.out.println("descending using comparable...");
		Set<PersonDTO> set4=map.keySet();
		set4.stream().sorted(Comparator.reverseOrder()).forEach(u->System.out.println(u));
		// list.stream().sorted(Comparator.reverseOrder()).forEach((c)->System.out.println(c));
		System.out.println("---------------------");

		System.out.println("descending using comparator...");
		Comparator<PersonDTO> comparator = (p1, p2) -> {
			String c1 = p1.getName();
			String c2 = p2.getName();
			int value = c1.compareTo(c2);
			return value;
		};
		Set<PersonDTO> set5=map.keySet();
		 set5.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.println(t));

	}

}
