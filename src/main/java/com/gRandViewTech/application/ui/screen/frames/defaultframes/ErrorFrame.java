package com.gRandViewTech.application.ui.screen.frames.defaultframes;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ErrorFrame extends JFrame
	{

		private static final long serialVersionUID = 1L;

		public ErrorFrame(String errorMessage)
			{
				JLabel errorLabel = new JLabel(errorMessage);
				errorLabel.setBounds(10, 20, 50, 50);
				errorLabel.setToolTipText(errorMessage);
				add(errorLabel);
				setPreferredSize(new Dimension(400, 60));
				setVisible(true);
				setLocationRelativeTo(null);
				pack();
			}
	}
