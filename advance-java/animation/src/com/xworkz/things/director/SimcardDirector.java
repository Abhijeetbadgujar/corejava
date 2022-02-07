package com.xworkz.things.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.things.Simcard;

public class SimcardDirector {

	public static void main(String[] args) {

		String string="resources/spring1.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(string);
		
		Simcard simcard=context.getBean(Simcard.class);
		String string2=simcard.calling();
		System.out.println(string2.toUpperCase());
	}

}
