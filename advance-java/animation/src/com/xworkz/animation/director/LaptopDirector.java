package com.xworkz.animation.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.animation.LaptopSpring;

public class LaptopDirector {

	public static void main(String[] args) {

		String string="resources/spring.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(string);
		
		LaptopSpring laptopSpring=applicationContext.getBean(LaptopSpring.class);
		laptopSpring.start();
		
	}

}
