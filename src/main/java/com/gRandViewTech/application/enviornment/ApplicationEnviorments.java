package com.gRandViewTech.application.enviornment;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class ApplicationEnviorments
	{
		private final static String OUT_PUT_FOLDER = "output";
		private final static String LOG_FOLDER = "logs";

		private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ApplicationEnviorments.class);

		public static void initializeApplicationEnviorments() throws Exception
			{
				try
					{
						File outputFolder = new File(OUT_PUT_FOLDER);
						if (outputFolder.isDirectory() == false)
							{
								FileUtils.forceMkdir(outputFolder);
							}
						File logsFolder = new File(OUT_PUT_FOLDER + File.separator + LOG_FOLDER);
						if (logsFolder.isDirectory() == false)
							{
								FileUtils.forceMkdir(outputFolder);
							}
					} catch (Exception exception)
					{
						logger.error(exception.getLocalizedMessage(), exception);
						throw exception;
					}
			}
	}
