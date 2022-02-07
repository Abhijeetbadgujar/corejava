package com.xworkz.things.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.things.Paint;


public class PaintDirector {

	public static void main(String[] args) {
		String string="resources/spring1.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(string);
		
		Paint steamer=context.getBean(Paint.class);
		
		Boolean refOfBoo=steamer.colour();
		System.out.println(refOfBoo.toString());
		
		String string2=steamer.shine();
		System.out.println(string2.toLowerCase());
	}

}
