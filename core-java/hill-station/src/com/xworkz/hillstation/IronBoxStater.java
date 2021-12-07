package com.xworkz.hillstation;

import com.xworkz.hillstation.state.IronBox;
import com.xworkz.hillstation.state.PhilipIronBox;

public class IronBoxStater {

	public static void main(String[] args) {

		PhilipIronBox philipIronBox=new PhilipIronBox("PHILIP","Digital",true,180.3f,220.4f);
		System.out.println(philipIronBox.getBrand());
		philipIronBox.displayDetails();
		PhilipIronBox box=new PhilipIronBox();
		IronBox ironBox=new IronBox();
		philipIronBox.produceHeat();
	}

}
