package com.xworkz.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopDirector {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("resources/spring.xml");
		
		Laptop laptop=context.getBean(Laptop.class);
		
		Camera camera=context.getBean(Camera.class);
		camera.capture();
		
		
	}

}
