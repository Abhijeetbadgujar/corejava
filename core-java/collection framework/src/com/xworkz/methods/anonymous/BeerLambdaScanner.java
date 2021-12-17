package com.xworkz.methods.anonymous;

public class BeerLambdaScanner {

	public static void main(String[] args) {

				BeerDAO beerDAO = new BeerDAO();
				
				boolean match = beerDAO.operations((arg1,arg2)->{return arg1.equals(arg2);},"Budweiser" );
				System.out.println(match);
				
				boolean matchIgnore = 
						beerDAO.operations((arg1,arg2)->{return arg1.equalsIgnoreCase(arg2); },"budweiser");
				System.out.println(matchIgnore);

				boolean startsWith = beerDAO.operations((arg1,arg2)->{return arg1.startsWith(arg2);}, "K");
				System.out.println(startsWith);
				
				boolean endsWith = beerDAO.operations((arg1,arg2)->{return arg1.endsWith(arg2);}, "r");
				System.out.println(endsWith);
				
				
		}
	}

