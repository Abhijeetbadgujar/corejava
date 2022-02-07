package com.xworkz.things.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.things.Sanitizer;


public class SanitizerDirector {

	public static void main(String[] args) {

		String string="resources/spring1.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(string);
		
		Sanitizer tissue=context.getBean(Sanitizer.class);
		
		Boolean boolean1=tissue.microorganisms();
		System.out.println(boolean1.toString());
		
		String string2=tissue.protect();
		System.out.println(string2.toLowerCase());
	}

}
