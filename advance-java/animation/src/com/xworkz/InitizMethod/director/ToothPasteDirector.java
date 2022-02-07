package com.xworkz.InitizMethod.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.InitizMethod.ToothPaste;

public class ToothPasteDirector {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("resources/spring2.xml");
		
		ToothPaste paste=context.getBean(ToothPaste.class);
		System.out.println(paste.getCompany());
		System.out.println(paste.getPrice());
		System.out.println(paste.getOffer());
	}

}
