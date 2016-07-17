package com.gRandViewTech.application.runner;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.gRandViewTech.application.enviornment.ApplicationEnviorments;
import com.gRandViewTech.application.ui.screen.frames.MainFrame;
import com.gRandViewTech.application.ui.screen.frames.defaultframes.ErrorFrame;

@Configuration
@SpringBootApplication
@PropertySources(value = {@PropertySource("classpath:properties/input.properties"), @PropertySource("classpath:properties/database.properties"), @PropertySource("classpath:properties/query.properties")})
@ComponentScan(basePackages = {"com.gRandViewTech"})

public class Application implements CommandLineRunner
	{

		private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Application.class);

		static
			{
				try
					{
						Resource resource = new ClassPathResource("properties" + File.separator + "log4j.properties");
						PropertyConfigurator.configure(resource.getInputStream());
					} catch (Exception exception)
					{
						new ErrorFrame(exception.getLocalizedMessage());
						logger.error(exception.getLocalizedMessage(), exception);
					}
			}

		@Bean
		public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() throws IOException
			{
				PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
				return propertySourcesPlaceholderConfigurer;
			}

		@Override
		public void run(String... arg0) throws Exception
			{
				ApplicationEnviorments.initializeApplicationEnviorments();
				MainFrame mainFrame = new MainFrame();
			}

	}
