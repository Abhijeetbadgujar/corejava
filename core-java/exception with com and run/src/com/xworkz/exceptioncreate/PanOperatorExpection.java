package com.xworkz.exceptioncreate;

import com.xworkz.exceptioncreate.panOperator.PanOperator;
import com.xworkz.exceptioncreate.panOperator.PanValidationExpection;

public class PanOperatorExpection {

	public static void main(String[] args) throws PanValidationExpection {

		PanOperator operator=new PanOperator();
		operator.save("weodEEn122");
		operator.save("ewonsd24EE");
	}

}
