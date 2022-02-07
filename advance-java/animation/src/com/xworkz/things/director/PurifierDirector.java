package com.xworkz.things.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.things.Purifier;

public class PurifierDirector {

	public static void main(String[] args) {

		String string="resources/spring1.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(string);
		
		Purifier purifier=applicationContext.getBean(Purifier.class);
		
		Boolean boolean1=purifier.purify();
		System.out.println(boolean1.toString());
		
		String boolean2=purifier.purify1();
		System.out.println(boolean1.hashCode());
	}

}
