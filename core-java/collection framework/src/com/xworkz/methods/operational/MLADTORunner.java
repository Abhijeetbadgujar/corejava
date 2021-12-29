package com.xworkz.methods.operational;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MLADTORunner {

	public static void main(String[] args) {

		MLADTO mladto=new MLADTO(1,MLADTOName.ABDULASTTAR,"central aurangabad",20,"rajpal yadav");
		MLADTO mladto1=new MLADTO(3,MLADTOName.ATULSALVE,"east aurangabad",15,"pappu");
		MLADTO mladto2=new MLADTO(2,MLADTOName.JAISWALPRADEEP,"north aurangabad",17,"rahul");
		MLADTO mladto3=new MLADTO(4,MLADTOName.SANJAYPANDURANG,"south aurangabad",22,"pandya");
		
		Stream<MLADTO> stream=Stream.of(mladto,mladto1,mladto2,mladto3);
		//Comparator<MLADTO> comparator=
		//stream.filter((r)->r.forEach((r)->System.out.println(r)));
		List<MLADTO> list=stream.collect(Collectors.toList());
		list.forEach(w->System.out.println(w));			
		
		System.out.println("--------------------------------------------------");
		System.out.println("qualification...");
		Comparator<MLADTO> comparator=(w1,w2)->{
			String c1=w1.getConstituency();
			String c2=w2.getConstituency();
			int value=c2.compareTo(c1);
			return value;
		};
		System.out.println("@@@@@@@@@@@@");
		list.stream().sorted().forEach((d)->System.out.println(d ));
		System.out.println("@@@@@@@@@@@@");
		list.stream().filter(u->u.getName().equals(MLADTOName.ABDULASTTAR)).forEach(t->System.out.println(t));
		System.out.println("--------------------------------------------------");
		System.out.println("max totolAssect...");
		Stream<MLADTO> stream2=Stream.of(mladto,mladto1,mladto2,mladto3);
		List<MLADTO> list2=stream2.filter(s->s.getTotalAssect()>20).collect(Collectors.toList());
		list2.forEach(w->System.out.println(w));

	}

	
}
