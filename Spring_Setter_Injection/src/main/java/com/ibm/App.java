package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
    ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
    
    
    Employee employee =(Employee)context.getBean("empObject");
    
    System.out.println(employee);
    
    ((ClassPathXmlApplicationContext) context).close();
    }
}