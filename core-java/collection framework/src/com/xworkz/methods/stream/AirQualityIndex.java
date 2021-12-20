package com.xworkz.methods.stream;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AirQualityIndex {

	public static void main(String[] args) {

		int quality = 345;
		int quality1 = 242;
		int quality2 = 234;
		int quality3 = 134;
		int quality4 = 341;
		int quality5 = 434;
		int quality6 = 345;
		int quality7 = 345;
		int quality8 = 123;
		int quality9 = 321;
		int quality10 = 321;
		int quality11 = 333;
		int quality12 = 222;
		int quality13 = 111;
		int quality14 = 234;
		int quality15 = 235;
		int quality16 = 265;
		int quality17 = 335;
		int quality18 = 275;
		int quality19 = 136;
		int quality20 = 146;

		Stream<Integer> stream = Stream.of(quality, quality1, quality2, quality3, quality4, quality5, quality6,
				quality7, quality8, quality9, quality10, quality11, quality12, quality13, quality14, quality15,
				quality16, quality17, quality18, quality19, quality20);
		List<Integer> ref = stream.filter((e) -> e < 200).collect(Collectors.toList());
		ref.forEach(e -> System.out.println("air quality index:" + e));
	
		System.err.println("--------------------------");	
		System.out.println("descending order");
		Stream<Integer> stream1 = Stream.of(quality, quality1, quality2, quality3, quality4, quality5, quality6,
				quality7, quality8, quality9, quality10, quality11, quality12, quality13, quality14, quality15,
				quality16, quality17, quality18, quality19, quality20);

		List<Integer> integers = stream1.sorted((f1, f2) -> f2.compareTo(f1)).collect(Collectors.toList());
		integers.forEach(e -> System.out.println(e));

		Stream<Integer> stream2 = Stream.of(quality, quality1, quality2, quality3, quality4, quality5, quality6,
				quality7, quality8, quality9, quality10, quality11, quality12, quality13, quality14, quality15,
				quality16, quality17, quality18, quality19, quality20);
		
		System.err.println("-------------------------");
		System.out.println("ascending order");
		List<Integer> integers1= stream2.sorted().collect(Collectors.toList());
		integers1.forEach(e -> System.out.println(e));
		
	}

}
