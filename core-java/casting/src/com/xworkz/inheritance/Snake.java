package com.xworkz.inheritance;

public class Snake extends Object{
	String breed="tur";
	boolean poisionious;
	boolean milkDrink;
	
	public Snake() {
		this("panther",true,true);
		System.out.println("invoked the no-arg consturctor");
	}
	
	public Snake(String breed,boolean poisionious,boolean milkDrink) {
		
		System.out.println("the snake breed: "+breed);
		System.out.println("the poisionious: "+poisionious);
		System.out.println("the milkDrink : "+milkDrink);
	}
	
	
	
	
	
	
		
	}

