package com.gRandViewTech.application.ui.miscellaneous;

import java.io.File;

import javax.swing.ImageIcon;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.gRandViewTech.application.ui.screen.frames.MainFrame;
import com.gRandViewTech.application.ui.screen.frames.defaultframes.ErrorFrame;

public class CustomIcons
	{

		private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(MainFrame.class);

		public static ImageIcon getMainFrameBackBroundIcon()
			{
				try
					{
						Resource icon = new ClassPathResource("icons" + File.separator + "background.jpg");
						ImageIcon imageIcon = new ImageIcon(icon.getURL());
						return imageIcon;
					} catch (Exception exception)
					{
						new ErrorFrame(exception.getLocalizedMessage());
						logger.error(exception.getLocalizedMessage(), exception);
					}
				return null;
			}
	}
