package com.gRandViewTech.application.ui.screen.frames;

import java.awt.Dimension;

import javax.swing.JFrame;

import com.gRandViewTech.application.ui.miscellaneous.SystemDimensions;

public class GameBoard extends JFrame
	{

		private static final long serialVersionUID = -6790063431806783223L;

		public GameBoard()
			{
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Dimension preferredSize = SystemDimensions.getScreenResoltution();
				setPreferredSize(preferredSize);
				setVisible(true);
				setExtendedState(JFrame.MAXIMIZED_BOTH);
				setMinimumSize(SystemDimensions.getMinimumResolutionSupported());
				setResizable(true);
			}

	}
