package com.xworkz.things.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.things.Mask;


public class MaskDirector {

	public static void main(String[] args) {

		String string="resources/spring1.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(string);
		
		Mask steamer=context.getBean(Mask.class);
		
		Boolean refOfBoo=steamer.protect();
		System.out.println(refOfBoo.toString());
		
		String string2=steamer.wearing();
		System.out.println(string2.toUpperCase());
	}

}
