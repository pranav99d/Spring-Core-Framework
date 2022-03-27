package org.com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorExampleMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Country countryObj = (Country) appContext.getBean("country");
		System.out.println("Country Name: " + countryObj.getCountryName());
		appContext.registerShutdownHook();
	}
}