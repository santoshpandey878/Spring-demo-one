package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
				
				//retrive bean from spring container
				Coach theCoach = context.getBean("myCoach", Coach.class);
				
				Coach theCoach2 = context.getBean("myCoach", Coach.class);
		
				//check if the are the same
				boolean result = (theCoach == theCoach2);
				
				System.out.println("\nPointing to the same object : "+result);
				
				System.out.println("\nMemory location to the theCoach : "+theCoach);
				
				System.out.println("\nMemory location to the theCoach2 : "+theCoach2+"\n");
				
				//close the context
				context.close();
				
	}

}
