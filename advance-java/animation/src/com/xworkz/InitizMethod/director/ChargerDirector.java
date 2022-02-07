package com.xworkz.InitizMethod.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.InitizMethod.Charger;

public class ChargerDirector {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("resources/spring2.xml");
		
		Charger refOfChar=context.getBean(Charger.class);
		System.out.println(refOfChar.getBrand());
		System.out.println(refOfChar.getPrice());

		//System.out.println(refOfChar.getColour());
		//System.out.println(refOfChar.getVolt());
	}

}
