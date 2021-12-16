package com.xworkz.methods.collectionEnheritet;

public class countryStater {

	public static void main(String[] args) {

		countryDAO countryDAO=new countryDAO();
		countryDAO.find("south korea");
		countryDAO.find("india");
		countryDAO.find("russia");
		boolean b=countryDAO.find("india");
		System.out.println(b);
		boolean c=countryDAO.contain("russia");
		System.out.println(c);
		boolean d=countryDAO.caseSensitive("India");
		System.out.println(d);
		boolean e=countryDAO.startswith("ru");
		System.out.println(e);
		boolean f=countryDAO.endswith("ea");
		System.out.println(f);
	}
	

}
