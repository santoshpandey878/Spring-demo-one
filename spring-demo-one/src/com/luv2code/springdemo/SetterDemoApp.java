package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
	
		
		// load the spring configuration file
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
				
				
				//retrive bean from spring container
				CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
			
				
				//or
				
				Coach theCoach2 = context.getBean("myCricketCoach", Coach.class);
				
				
				//call method on the bean
				System.out.println(theCoach.getDailyWorkout());
				System.out.println(theCoach.getDailyFortune());
				System.out.println(theCoach2.getDailyWorkout());
				System.out.println(theCoach2.getDailyFortune());
				
				//call our new methods to get the literal values
				System.out.println(theCoach.getEmailAddress());
				System.out.println(theCoach.getTeam());
				
				//close the context
				context.close();


	}

}
