package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}




	public void setEmailAddress(String emailAddress) {
		System.out.println("cricketcoach : inside setEmailAddress");
		this.emailAddress = emailAddress;
	}




	public String getTeam() {
		return team;
	}




	public void setTeam(String team) {
		System.out.println("cricketcoach : inside setTeam");
		this.team = team;
	}




	//create a no argument constructor
	public CricketCoach(){
		System.out.println("cricketcoach : inside no argument constructor");
	}
	
	
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("cricketcoach : inside setter method");
		this.fortuneService = fortuneService;
	}




	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice test bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
