/*Change above program to get below output

	Employee name:YourName
	Employee number:1111*/

package org.com.exercise1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext1.xml");
		Employee1 emp = (Employee1) appContext.getBean("employeeBean");
		System.out.println("Employee name:" + emp.getName());
		System.out.println("Employee number:" + emp.getEmployeeNumber());
	}
}
