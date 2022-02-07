package com.xworkz.InitizMethod.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.InitizMethod.Ups;

public class UpsDirector {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("resources/spring2.xml");
		
		Ups ups=context.getBean(Ups.class);
		System.out.println(ups.getCompany());
		System.out.println(ups.getType());
		System.out.println(ups.getWeight());
	}

}
