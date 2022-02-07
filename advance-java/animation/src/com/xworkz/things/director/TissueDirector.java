package com.xworkz.things.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.things.Tissue;

public class TissueDirector {

	public static void main(String[] args) {

		String string="resources/spring1.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(string);
		
		Tissue tissue=context.getBean(Tissue.class);
		
		Boolean boolean1=tissue.cleaner();
		System.out.println(boolean1.toString());
		
		String string2=tissue.sucssion();
		System.out.println(string2.hashCode());
	}

}
