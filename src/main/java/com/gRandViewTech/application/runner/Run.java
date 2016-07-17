package com.gRandViewTech.application.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

@Component
public class Run
	{

		public static void main(String[] args)
			{
				SpringApplication springApplication = new SpringApplication(Application.class);
				springApplication.setHeadless(false);
				springApplication.setWebEnvironment(false);
				springApplication.run(args);
			}

	}
