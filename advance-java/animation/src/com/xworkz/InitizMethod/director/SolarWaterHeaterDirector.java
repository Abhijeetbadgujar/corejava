package com.xworkz.InitizMethod.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.InitizMethod.SolarWaterHeater;

public class SolarWaterHeaterDirector {

	public static void main(String[] args) {


		ApplicationContext context=new ClassPathXmlApplicationContext("resources/spring2.xml");
		SolarWaterHeater heater=context.getBean(SolarWaterHeater.class);
		
	}

}
