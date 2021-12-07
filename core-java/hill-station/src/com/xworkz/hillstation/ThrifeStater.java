package com.xworkz.hillstation;

import com.xworkz.hillstation.state.MobileThrife;
import com.xworkz.hillstation.state.Thrife;

public class ThrifeStater {

	public static void main(String[] args) {

		MobileThrife mobileThrife=new MobileThrife("pappu","waterbotal","BTM",5,25) ;
		mobileThrife.runningThrife("single shoe");
		//mobileThrife.sellItem();
		String arg=mobileThrife.sellItem();
		System.out.println(arg);
		
		Thrife thrife=new MobileThrife("chota Bhem","watch","jp nagar",3,34);
		String arg1=thrife.sellItem();
		System.out.println(arg1);
		
		System.out.println("------------------------------");
		
		mobileThrife.displayDetails();
		
		
		
	}

}
