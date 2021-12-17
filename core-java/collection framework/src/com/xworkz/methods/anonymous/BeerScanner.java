package com.xworkz.methods.anonymous;

public class BeerScanner {

	public static void main(String[] args) {

		BeerDAO beerDAO = new BeerDAO();

		System.out.println("equals methos");
		Search searchElement = new Search() {
			@Override
			public boolean expression(String operation, String value) {
				return operation.equals(value);
			}
		};

		boolean match = beerDAO.operations(searchElement, "Corona");
		System.out.println(match);
		System.out.println("-------------------------");
		System.out.println("equal ignore case method");
		Search equalIgnor = new Search() {

			@Override
			public boolean expression(String operation, String value) {
				return operation.equalsIgnoreCase(value);
			}
		};

		match = beerDAO.operations(equalIgnor, "heIneken");
		System.out.println(match);
		System.out.println("starts with method");
		Search startsWith = new Search() {

			@Override
			public boolean expression(String operation, String value) {
				return operation.startsWith(value);
			}
		};

		match = beerDAO.operations(startsWith, "H");
		System.out.println(match);
		System.out.println("ends with method");
		Search endsWith = new Search() {

			@Override
			public boolean expression(String operation, String value) {
				return operation.endsWith(value);
			}
		};
		match = beerDAO.operations(endsWith, "r");
		System.out.println(match);

	}

}
