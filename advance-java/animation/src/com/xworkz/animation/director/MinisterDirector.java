package com.xworkz.animation.director;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.animation.MinisterSpring;

public class MinisterDirector {

	public static void main(String[] args) {

		String string= "resources/spring.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(string);
		
		MinisterSpring director=applicationContext.getBean(MinisterSpring.class);
		
		String refOfString=director.corruption();
		System.out.println(refOfString.toUpperCase());

		Integer refOfInt=director.corruption1();
		System.out.println(refOfInt.toString());
		
		Boolean refOfBoo=director.corruption2();
		System.out.println(refOfBoo.toString());
		
		Double refOfDouble=director.corruption3();
		System.out.println(refOfDouble.hashCode());
	}

	

}
