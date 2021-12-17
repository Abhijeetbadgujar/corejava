package com.xworkz.methods.funtionInterface;


	public class EqualsIgnoreCaseBeerSearch implements BeerSearch {

		@Override
		public boolean expressions(String arg1, String arg2) {
			System.out.println("Invoked expressions EqualsIgnoreCaseBeerSearch");
			return arg1.equals(arg2);
		}

	
}
