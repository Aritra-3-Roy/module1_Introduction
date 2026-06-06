package com.aritra.module1_Introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner{

//	@Autowired
	final NotificationService notificationService; //dependency injection

	public Module1IntroductionApplication(NotificationService notificationService){
		this.notificationService = notificationService;  // Constructor Dependency Injection (Preferred)
	}

	public static void main(String[] args) {
		SpringApplication.run(Module1IntroductionApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		notificationService.send("hello");
	}

}
