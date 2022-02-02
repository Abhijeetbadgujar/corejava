package com.xworkz.animation.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.animation.MinisterSpring;

public class MinisterDirector {

	public static void main(String[] args) {

		String string= "resources/spring.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(string);
		
		MinisterSpring director=applicationContext.getBean(MinisterSpring.class);
		director.corruption();
	}

	

}
