package com.ibm;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee employee1=(Employee)factory.getBean("empBean1");
		employee1.display();
		
		
		
		
		/* 
		 * ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 * 
		 *  // get the required bean Employee
		 *  employee=(Employee)context.getBean("empBean1"); employee.display();
		 *  
		 *  
		 *  ((ClassPathXmlApplicationContext) context().close();
		 */
	}

}
