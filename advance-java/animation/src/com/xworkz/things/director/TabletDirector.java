package com.xworkz.things.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.things.Tablet;

public class TabletDirector {

	public static void main(String[] args) {
		
		String string="resources/spring1.xml";
		//Boolean b="resources/spring1.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(string);
		//ApplicationContext context1=new ClassPathXmlApplicationContext();

		Tablet tablet=context.getBean(Tablet.class);
		
		
		Boolean refOfBoolean=tablet.recover();
		System.out.println(refOfBoolean.toString());
		
		String reOfStr=tablet.recover1();
		System.out.println(reOfStr.toUpperCase());
		
		Integer reOfInt=tablet.recover3();
		System.out.println(reOfInt.doubleValue());		
	} 

}
