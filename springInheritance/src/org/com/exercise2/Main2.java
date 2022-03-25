//Change above program to show employee name , employee age and its contact number.

package org.com.exercise2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext2.xml");
		Employee2 emp = (Employee2) appContext.getBean("employeeBean");
		System.out.println("Employee name: " + emp.getName());
		System.out.println("Employee Age: " + emp.getEmployeeAge());
		System.out.println("Employee Contact number: " + emp.getEmployeeContact());
		
	}

}
