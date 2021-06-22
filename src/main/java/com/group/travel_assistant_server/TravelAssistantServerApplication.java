package com.group.travel_assistant_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.group.travel_assistant_server.entities", "com.group.travel_assistant_server.repositories", "com.group.travel_assistant_server.controller"})
public class TravelAssistantServerApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(TravelAssistantServerApplication.class, args);
	}

}
