package com.xworkz.things.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.things.Oximeter;


public class OximeterDirector {

	public static void main(String[] args) {
		String string="resources/spring1.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(string);
		
		Oximeter steamer=context.getBean(Oximeter.class);
		
		Boolean refOfBoo=steamer.pulse();
		System.out.println(refOfBoo.toString());
		
		String string2=steamer.display();
		System.out.println(string2.toUpperCase());
	}

}
