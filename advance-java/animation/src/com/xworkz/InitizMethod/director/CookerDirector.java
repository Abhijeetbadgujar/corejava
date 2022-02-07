package com.xworkz.InitizMethod.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.InitizMethod.Cooker;

public class CookerDirector {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("resources/spring2.xml");

		Cooker cooker = context.getBean(Cooker.class);

	}

}
