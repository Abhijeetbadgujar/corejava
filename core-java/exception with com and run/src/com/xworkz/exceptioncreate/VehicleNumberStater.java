package com.xworkz.exceptioncreate;

import com.xworkz.exceptioncreate.VehicleNumberOperator.VehicleNumberOperator;
import com.xworkz.exceptioncreate.VehicleNumberOperator.vehicleNumberOperatorValidExpection;

public class VehicleNumberStater {

	public static void main(String[] args) throws vehicleNumberOperatorValidExpection {

		VehicleNumberOperator vehicleNumberOperator=new VehicleNumberOperator();
		vehicleNumberOperator.save("MH. AB. 6520");
		vehicleNumberOperator.save("MH.20.weo");
		//vehicleNumberOperator.save("MH.");
	}

}
