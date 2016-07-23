package com.gRandViewTech.application.enviornment;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class SystemInformationService
	{
		private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(SystemInformationService.class);

		@PostConstruct
		public void getCommandLineExecuted()
			{
				try
					{
						Process process = Runtime.getRuntime().exec("date");
						StringBuffer output = new StringBuffer();
						BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

						String line = "";
						while ((line = reader.readLine()) != null)
							{
								output.append(line + "\n");
							}
						logger.info("Process : " + line);

					}
				catch (Exception exception)
					{
						logger.error(exception.getLocalizedMessage(), exception);
					}
			}
	}
