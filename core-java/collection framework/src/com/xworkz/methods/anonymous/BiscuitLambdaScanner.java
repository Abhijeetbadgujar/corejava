package com.xworkz.methods.anonymous;

public class BiscuitLambdaScanner {

	public static void main(String[] args) {

		BiscuitDAO biscuitDAO=new BiscuitDAO();
		
		boolean match = biscuitDAO.operation((arg1,arg2)->{return arg1.equals(arg2);},"parle" );
		System.out.println(match);
		
		boolean matchIgnore= biscuitDAO.operation((arg1, arg2)->{return arg1.equals(arg2);},"borbon");
		System.out.println(matchIgnore);
		
		boolean startsWith = biscuitDAO.operation((arg1,arg2)->{return arg1.startsWith(arg2);}, "p");
		System.out.println(startsWith);
		
		boolean endsWith = biscuitDAO.operation((arg1,arg2)->{return arg1.endsWith(arg2);}, "on");
		System.out.println(endsWith);
		
	}

}
