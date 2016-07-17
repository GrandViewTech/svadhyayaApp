package com.gRandViewTech.application.ui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.gRandViewTech.application.ui.screen.frames.MainFrame;

public class LoginListener implements KeyListener, ActionListener
	{

		private MainFrame mainFrame;

		public LoginListener(MainFrame mainFrame)
			{
				this.mainFrame = mainFrame;
			}

		@Override
		public void actionPerformed(ActionEvent actionEvent)
			{
				String username = mainFrame.getUsername();
				String password = mainFrame.getPassword();
				// if (AuthenticationService.authenticateUser(username,
				// password) != null)
				// {
				// mainFrame.dispose();
				// new GameBoard();
				// } else
				// {
				// new ErrorFrame("Invalid Username or Password");
				// }

			}

		@Override
		public void keyTyped(KeyEvent keyEvent)
			{

			}

		@Override
		public void keyPressed(KeyEvent keyEvent)
			{

			}

		@Override
		public void keyReleased(KeyEvent keyEvent)
			{

			}

	}
