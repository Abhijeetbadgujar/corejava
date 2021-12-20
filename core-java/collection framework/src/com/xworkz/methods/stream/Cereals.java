package com.xworkz.methods.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cereals {

	public static void main(String[] args) {
		
		Float cereals= 2.3f;
		Float cereals1= 2.6f;
		Float cereals2= 7.5f;
		Float cereals3= 4.6f;
		Float cereals4= 3.8f;
		Float cereals5= 5.5f;
		Float cereals6= 6.0f;
		Float cereals7= 7.0f;
		Float cereals8= 1.3f;
		Float cereals9= 7.6f;
		Float cereals10= 2.4f;
		Float cereals11= 6.6f;
		Float cereals12= 6.7f;
		Float cereals13= 4.6f;
		Float cereals14= 3.3f;
		Float cereals15= 3.9f;
		Float cereals16= 2.5f;
		Float cereals17= 9.9f;
		Float cereals18= 8.4f;
		Float cereals19= 1.3f;
		
		Stream<Float> stream=Stream.of(cereals,cereals1,cereals2,cereals3,cereals4,cereals5,cereals6,cereals7,cereals8,cereals9,
				cereals10,cereals11,cereals12,cereals13,cereals14,cereals15,cereals16,cereals17,cereals18,cereals19);
		List<Float> floats=stream.filter((f)-> f<4.0f).collect(Collectors.toList());
		floats.forEach(e-> System.out.println(e));
		
		
		
	}

}
