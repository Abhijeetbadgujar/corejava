package com.xworkz.Festival.Flower;

import com.xworkz.Festival.Festival;

public class flower {

	public static void main(String[] args) {
		
		
		Festival ref=new Festival("31Dec",12);
		System.out.println(ref.name);
		System.out.println(ref.nofflower);
		
		Festival ref1=new Festival();
		ref1.setFestival("kumodini");
		System.out.println(ref1.name);

	}

}

