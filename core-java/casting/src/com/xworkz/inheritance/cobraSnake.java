package com.xworkz.inheritance;

public class cobraSnake extends Snake{
	
	private String breed="black mamba";
	private boolean milkDrink;
	public cobraSnake() {
		//()
		System.out.println("invoked the cobraSnake no-arg constructor");
	}
	public void Hide(boolean milkDrink,String breed) {
		System.out.println(super.breed);
		System.out.println(this.breed);
		System.out.println(milkDrink);
		System.out.println(breed);
	}
	
	
}
