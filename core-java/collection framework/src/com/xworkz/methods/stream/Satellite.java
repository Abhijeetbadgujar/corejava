package com.xworkz.methods.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Satellite {

	public static void main(String[] args) {

		String satellites = "Aryabhatta";
		String satellites1 = "Bhaskara Sega-I";
		String satellites2 = "Rohini Technolog Payload";
		String satellites3 = "OceanSat-";
		String satellites4 = "Kalpana-1";
		String satellites5 = "ResourceSat-1";
		String satellites6 = "CartoSat-1";
		String satellites7 = "HamSa";
		String satellites8 = "RISAT-2";
		String satellites9 = "TES";
		String satellites10 = "IRS-1C";
		String satellites11 = "INSAT-1";
		String satellites12 = "SROSS";
		String satellites13 = "IRS-1A";
		String satellites14 = "SROSS-";
		String satellites15 = "INSAT-";
		String satellites16 = "NSAT-1A";
		String satellites17 = "Bhaskara -II";
		String satellites18 = "APPLE";
		String satellites19 = "Rohini";

		Stream<String> stream = Stream.of(satellites,satellites1, satellites2, satellites3, satellites4, satellites5, satellites6,
				satellites7, satellites8, satellites9, satellites10, satellites11, satellites12, satellites13,
				satellites14, satellites15, satellites16, satellites17, satellites18, satellites19);
		List<String> list = stream.parallel().map(l -> l.toLowerCase()).collect(Collectors.toList());
		System.out.println("lower case...");
		list.forEach(r -> System.out.println(r));
		System.err.println("---------------------------");

		Stream<String> stream1 = Stream.of(satellites,satellites1, satellites2, satellites3, satellites4, satellites5, satellites6,
				satellites7, satellites8, satellites9, satellites10, satellites11, satellites12, satellites13,
				satellites14, satellites15, satellites16, satellites17, satellites18, satellites19);
		List<String> list2 = stream1.parallel().map(g -> g.toUpperCase()).collect(Collectors.toList());
		System.out.println("upper case...");
		list2.forEach(t -> System.out.println(t));
		System.err.println("----------------------------");

		Stream<String> stream2 = Stream.of(satellites,satellites1, satellites2, satellites3, satellites4, satellites5, satellites6,
				satellites7, satellites8, satellites9, satellites10, satellites11, satellites12, satellites13,
				satellites14, satellites15, satellites16, satellites17, satellites18, satellites19);
		List<String> list3=stream2.sorted().collect(Collectors.toList());
		System.out.println("ascending order...");
		list3.forEach(y-> System.out.println(y));
		System.out.println("-----------------------------");
		
		Stream<String> stream3 = Stream.of(satellites,satellites1, satellites2, satellites3, satellites4, satellites5, satellites6,
				satellites7, satellites8, satellites9, satellites10, satellites11, satellites12, satellites13,
				satellites14, satellites15, satellites16, satellites17, satellites18, satellites19);
		List<String> list4=stream3.sorted((d1,d2) ->d2.compareTo(d1)).collect(Collectors.toList());
		System.out.println("descending order...");
		list4.forEach(i-> System.out.println(i));
	}

}
