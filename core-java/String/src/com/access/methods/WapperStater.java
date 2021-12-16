package com.access.methods;

public class WapperStater {

	public static void main(String[] args) {

		String amit = "Amit";
		String patil = new String("Amit");

		boolean same = amit.equals(patil);
		System.out.println("same=" + same);

		char[] chars = { 'A', 'B', 'H', 'I' };
		String convertedString = String.copyValueOf(chars);
		System.out.println(convertedString);

		//String length = "anmoal";
		String ref = new String("anmol");
		System.out.println(ref);

		// charAT
		String myself = "abhi";
		char result = myself.charAt(3);
		System.out.println(result);

		// cordPoint(0)
		String friname = "gomu";
		int result1 = friname.codePointAt(2);
		System.out.println(result1);

		// codePointAt()
		String friname1 = "sanju";
		int result2 = friname1.codePointAt(3);
		System.out.println(result2);

		// codePointCount(String, int)
		String friname2 = "kiran";
		int result3 = friname2.codePointCount(1, 4);
		System.out.println(result3);

		// concat()
		String firname = "abhi";
		String lastname = "bad";
		System.out.println(firname.concat(lastname));

		// contains()
		String mySelf = "abhijeet";
		System.out.println(mySelf.contains("ab"));
		System.out.println(mySelf.contains("ee"));
		System.out.println(mySelf.contains("bi"));

		// getByte()

	}
}