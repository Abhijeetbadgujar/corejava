package com.xworkz.things.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.things.Steamer;

public class SteamerDirector {

	public static void main(String[] args) {

		String string="resources/spring1.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(string);
		
		Steamer steamer=context.getBean(Steamer.class);
		
		Boolean refOfBoo=steamer.heat();
		System.out.println(refOfBoo.toString());
		
		String string2=steamer.heat1();
		System.out.println(string2.hashCode());
	}

}
