package org.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Country countryObj = (Country) appContext.getBean("country");
		System.out.println("Capital Name:" + countryObj.getCapitalName("capital"));
	}
}
