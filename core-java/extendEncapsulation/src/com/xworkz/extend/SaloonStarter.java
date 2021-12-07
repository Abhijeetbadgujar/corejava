package com.xworkz.extend;

import com.xworkz.extend.shop.NaturalSaloon;
import com.xworkz.extend.shop.Saloon;

public class SaloonStarter {

	public static void main(String[] args) {
		NaturalSaloon naturalSaloon=new NaturalSaloon();
		Saloon saloon=new Saloon();
		Saloon naturalSaloon1=new NaturalSaloon();
		//Saloon saloon=new NaturalSaloon();
		System.out.println(naturalSaloon.name);
		System.out.println(naturalSaloon.location);
		System.out.println(naturalSaloon.age);
		
		System.out.println(saloon.name);
		System.out.println(saloon.location);
		System.out.println(saloon.age);
		
		

	}

}
