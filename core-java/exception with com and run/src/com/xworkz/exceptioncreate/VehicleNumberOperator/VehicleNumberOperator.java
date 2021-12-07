package com.xworkz.exceptioncreate.VehicleNumberOperator;

import javax.management.RuntimeErrorException;

public class VehicleNumberOperator {
	private String[] vehicleNumberOperators=new String[4];
	private int counter=0;
	
	public void save(String operator)throws vehicleNumberOperatorValidExpection {
		if(operator!=null && counter<=this.vehicleNumberOperators.length) {
			if(operator.contains("MH.") && operator.endsWith("20") || operator.endsWith("AB.")) {
				System.out.println("not compiler exception");
			}else {
				System.err.println("compile exception");
				throw new vehicleNumberOperatorValidExpection();
			}
		}else {
			System.err.println("operator is null");
			throw new RuntimeErrorException(null);
		}
	}
}
