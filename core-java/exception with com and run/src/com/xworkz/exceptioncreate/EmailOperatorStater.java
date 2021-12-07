package com.xworkz.exceptioncreate;

public class EmailOperatorStater {

	public static void main(String[] args) throws EmailValidationExpection {

		EmailOperator emailOperator=new EmailOperator();
		
		emailOperator.save("aos.com");
		//emailOperator.save("aos@.com");
		//emailOperator.save("aos@.com");
		//emailOperator.save("aos@.com");
		//emailOperator.save("aos@.com");
		//emailOperator.save("aos@.com");
	}

}
