package com.gRandViewTech.application.ui.miscellaneous;

import java.awt.Dimension;
import java.awt.Toolkit;

public class SystemDimensions
	{
		private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(SystemDimensions.class);

		private static Dimension screenResoltution;
		private static Dimension minimumResolutionSupported;

		static
			{
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				screenResoltution = toolkit.getScreenSize();
				logger.info("Launching  SystemDimensions");
				logger.info("Detecting Screen resolution . . . ");
				logger.info("Screen resolution . . . ( Width : " + screenResoltution.getWidth() + " X Height : " + screenResoltution.getHeight() + " )");
				int width = ((Double) (screenResoltution.getWidth() * 0.7)).intValue();
				int height = ((Double) (screenResoltution.getHeight() * 0.7)).intValue();
				minimumResolutionSupported = new Dimension(width, height);
				logger.info("Minimum Screen resolution Supported . . . ( Width : " + minimumResolutionSupported.getWidth() + " X Height : " + minimumResolutionSupported.getHeight() + " )");
			}

		public static Dimension getScreenResoltution()
			{
				int width = ((Double) screenResoltution.getWidth()).intValue();
				int height = ((Double) screenResoltution.getHeight()).intValue() - 50;
				return new Dimension(width, height);
			}

		public static Dimension getMinimumResolutionSupported()
			{
				int width = ((Double) minimumResolutionSupported.getWidth()).intValue();
				int height = ((Double) minimumResolutionSupported.getHeight()).intValue();
				return new Dimension(width, height);
			}

	}
