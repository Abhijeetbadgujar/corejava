package com.xworkz.animation.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.animation.CoronaSpring;

public class CoronaDirector {

	public static void main(String[] args) {
		
		String string="resources/spring.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(string);
		
		CoronaSpring coronaSpring=applicationContext.getBean(CoronaSpring.class);
		coronaSpring.happy();
		
	}

}
//constructor----setter------init-----destrory
