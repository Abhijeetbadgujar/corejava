package com.xworkz.methods.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class specs {

	public static void main(String[] args) {
		String specs1="Ray-Ban";
		String specs2="Oakley";
		String specs3="Carrera";
		String specs4="Fastrack";
		String specs5="Polaroid";
		String specs6="Farenheit";
		String specs7="Armani Exchange";
		String specs8="IDEE";
		String specs9="Titan";
		String specs10="dior";
		String specs11="COSTA DEL MAR";
		String specs12="nike";
		String specs13="sant raurent";
		String specs14="tory burch";
		String specs15="kate spade";
		String specs16="fendi";
		String specs17="choch";
		String specs18="kors";
		String specs19="gabana";
		String specs20="gucchi";
		
		Stream<String> stream=Stream.of(specs1,specs2,specs3,specs4,specs5,specs6,specs7,specs8,specs9,specs10,
				specs11,specs12,specs13,specs14,specs15,specs16,specs17,specs18,specs19,specs20);
		List<String> list=stream.parallel().map(t->t.toUpperCase()).collect(Collectors.toList());
		list.forEach(q-> System.out.println(q));
		System.err.println("-------------------");
	}

}
