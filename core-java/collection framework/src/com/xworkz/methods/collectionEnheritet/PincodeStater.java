package com.xworkz.methods.collectionEnheritet;

public class PincodeStater {

	public static void main(String[] args) {

		PincodeDAO dao=new PincodeDAO();
		dao.find(293394);
		dao.find(983245);
		dao.find(304585);
		dao.find(459384);
		boolean a=dao.find(459384);
		System.out.println(a);
		boolean b=dao.save(293394);
		System.out.println(b);
		boolean c=dao.caseSensitive(3423);
		System.out.println(c);
		boolean d=dao.startWith(3);
		System.out.println(d);
		boolean e=dao.endWith(4);
		System.out.println(e);
	}

}
