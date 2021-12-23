package com.xworkz.methods.operational;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.Stream;

public class PresidentDTORunner {

	public static void main(String[] args) {

		PresidentDTO dto=new PresidentDTO("pass123","modi",5,"india");
		PresidentDTO dto1=new PresidentDTO("pass12","rahul",6,"italy");
		PresidentDTO dto2=new PresidentDTO("pass13","kejriwal",8,"delhi");
		PresidentDTO dto3=new PresidentDTO("pass23","trum",2,"russsia");
		PresidentDTO dto4=new PresidentDTO("pas123","baidan",7,"us");
		
		System.out.println("stream through...");
		Stream<PresidentDTO> stream1=Stream.of(dto,dto1,dto2,dto3,dto4);
		List<PresidentDTO> list1=stream1.collect(Collectors.toList());
		list1.forEach(t->System.out.println(t));
		System.out.println("--------------------------------");
		System.out.println("sort tenure...");
		Stream<PresidentDTO> stream2=Stream.of(dto,dto1,dto2,dto3,dto4);
		List<PresidentDTO> list2=stream2.sorted(Comparator.comparingInt(PresidentDTO:: getTenure)).collect(Collectors.toList());
		list2.forEach(t->System.out.println(t.getTenure()));
		System.out.println("--------------------------------");
		System.out.println("max tenure...");
		Stream<PresidentDTO> stream=Stream.of(dto,dto1,dto2,dto3,dto4);
		List<Integer> list=stream.filter(y->y.tenure>6).map(i->i.tenure).collect(Collectors.toList());
		
//		if(list.isPresent()) {
//			System.out.println(list.get());
//		}
//		else {
//			System.err.println("no value");
//		}
		list.forEach(t->System.out.println(t));
		
		System.err.println("--------------------------------------------------");
		System.out.println("collection through");
		Stream.of(dto,dto1,dto2,dto3,dto4);
		List<PresidentDTO> dtos=new ArrayList<PresidentDTO>();
		
		dtos.add(dto);
		dtos.add(dto1);
		dtos.add(dto2);
		dtos.add(dto3);
		dtos.add(dto4);
		
		
		List<PresidentDTO> e=dtos.stream().collect(Collectors.toList());
		e.forEach(g-> System.out.println(g));
	}

}
