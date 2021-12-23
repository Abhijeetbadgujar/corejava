package com.xworkz.methods.operational;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartyDTORunner {

	public static void main(String[] args) {

		PartyDTO dto=new PartyDTO(1,P_Name.BJP,"Modi",20, "ruthik");
		PartyDTO dto1=new PartyDTO(3,P_Name.CONGRES,"rahul",22, "gandhi");
		PartyDTO dto2=new PartyDTO(5,P_Name.MANSE,"rajthakre",10, "rajthakre");
		PartyDTO dto3=new PartyDTO(2,P_Name.SHIVSENA,"thakre",18, "thakre");
		
		Stream<PartyDTO> stream1=Stream.of(dto,dto1,dto2,dto3);
		Set<PartyDTO> list1=stream1.collect(Collectors.toSet());
		Comparator<PartyDTO> comparator=(t1,t2)->{
			int t1totoalMember=t1.getTotoalMember();
			int t2totoalMember=t2.getTotoalMember();
			if(t1totoalMember==t2totoalMember) return 0;
			if(t1totoalMember>t2totoalMember) return 1000;
			if(t1totoalMember<t2totoalMember) return -199;
			return 0;
		};
		list1.stream().sorted(comparator).forEach(t->System.out.println(t));
		System.out.println("-----------------------------------");

		System.out.println("max total members");
		Stream<PartyDTO> stream=Stream.of(dto,dto1,dto2,dto3);
		List<PartyDTO> list=stream.filter(f->f.getTotoalMember()<20).collect(Collectors.toList());
		list.forEach(f->System.out.println(f));
		list.forEach(f->System.out.println(f.getTotoalMember()));
		System.out.println("--------------------------------------");
		

//			int t1totoalMember=t1.getTotoalMember();
//			int t2totoalMember=t2.getTotoalMember();
//			if(t1totoalMember==t2totoalMember) return 0;
//			if(t1totoalMember>t2totoalMember) return 1000;
//			if(t1totoalMember<t2totoalMember) return -199;
//			return 0;
//		};		Comparator<PartyDTO> comparator=(t1,t2)->{
//		list.stream().forEach(t->System.out.println(t));

	}

}
