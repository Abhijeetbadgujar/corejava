package com.xworkz.animation.director;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.animation.AnimeSpring;

public class Director {

	public static void main(String[] args) {
		String string="resources/spring.xml";
		 ApplicationContext spring=new ClassPathXmlApplicationContext(string);
		
		 AnimeSpring animeSpring=spring.getBean(AnimeSpring.class);
		 animeSpring.play();
	}

}
