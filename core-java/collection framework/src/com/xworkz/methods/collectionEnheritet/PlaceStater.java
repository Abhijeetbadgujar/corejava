package com.xworkz.methods.collectionEnheritet;

public class PlaceStater {

	public static void main(String[] args) {

		PlaceDAO dao=new PlaceDAO();
		dao.save("charminar");
		dao.save("virajpet");
		dao.save("parathalli");
		boolean ref=dao.find("charminar");
		System.out.println(ref);
		boolean ref1=dao.casesencetive("virajPET");
		System.out.println(ref1);
		boolean ref2=dao.startwith("char");
		System.out.println(ref2);
		boolean ref3=dao.endwith("lli");
		System.out.println(ref3);
	}

}
