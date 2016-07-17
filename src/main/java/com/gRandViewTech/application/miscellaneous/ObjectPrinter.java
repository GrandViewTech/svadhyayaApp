package com.gRandViewTech.application.miscellaneous;

import java.io.File;
import java.io.FileWriter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class ObjectPrinter
	{
		private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ObjectPrinter.class);

		final private static String JSON_FOLDER_LOCATION = "json";

		public static void printObject(Object object, String fileName)
			{
				try
					{
						if (object == null || fileName == null || fileName.trim().equals(""))
							{
								return;
							}
						ObjectMapper objectMapper = new ObjectMapper();
						ObjectWriter objectWriter = objectMapper.writerWithDefaultPrettyPrinter();
						String jsonObject = objectWriter.writeValueAsString(object);
						File file = new File(JSON_FOLDER_LOCATION + File.separator + fileName + ".txt");
						file.createNewFile();
						FileWriter writer = new FileWriter(file);
						writer.write(jsonObject);
						writer.flush();
						writer.close();
					} catch (Exception exception)
					{
						logger.error(exception.getLocalizedMessage(), exception);
					}
			}
	}
