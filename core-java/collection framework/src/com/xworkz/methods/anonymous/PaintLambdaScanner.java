package com.xworkz.methods.anonymous;

public class PaintLambdaScanner {

	public static void main(String[] args) {

		PaintDAO dao=new PaintDAO();
		
		boolean match = dao.operation((arg1,arg2)->{return arg1.equals(arg2);},"nerolux" );
		System.out.println(match);
		
		boolean matchIgnore = 
				dao.operation((arg1,arg2)->{return arg1.equalsIgnoreCase(arg2); },"delux");
		System.out.println(matchIgnore);

		boolean startsWith = dao.operation((arg1,arg2)->{return arg1.startsWith(arg2);}, "ne");
		System.out.println(startsWith);
		
		boolean endsWith = dao.operation((arg1,arg2)->{return arg1.endsWith(arg2);}, "ux");
		System.out.println(endsWith);
		
	}

}
