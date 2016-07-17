package com.gRandViewTech.application.ui.screen.frames;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.gRandViewTech.application.ui.listeners.LoginListener;
import com.gRandViewTech.application.ui.miscellaneous.CustomIcons;
import com.gRandViewTech.application.ui.miscellaneous.SystemDimensions;

public class MainFrame extends JFrame
	{
		private static final long serialVersionUID = 1L;

		private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(MainFrame.class);

		private JLabel backgroundImage = new JLabel();
		private JLabel usernameLabel = new JLabel("Username : ");
		private JLabel passwordLabel = new JLabel("Password  :");
		private JTextField username = new JTextField(10);
		private JPasswordField password = new JPasswordField(10);
		private JButton login = new JButton("Login");
		private JPanel panel = new JPanel();
		private GridBagLayout gridBagLayout = new GridBagLayout();
		private GridBagConstraints gridBagConstraints = new GridBagConstraints();
		private LoginListener loginListener = new LoginListener(this);

		public MainFrame()
			{

				logger.info("Initiating MainFrame");
				panel.setLayout(gridBagLayout);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Dimension preferredSize = SystemDimensions.getScreenResoltution();
				setPreferredSize(preferredSize);
				setVisible(true);
				setExtendedState(JFrame.MAXIMIZED_BOTH);
				setMinimumSize(SystemDimensions.getMinimumResolutionSupported());
				setResizable(true);
				ImageIcon imageIcon = CustomIcons.getMainFrameBackBroundIcon();
				if (imageIcon != null)
					{
						backgroundImage.setBounds(0, 0, preferredSize.width, preferredSize.height);
						backgroundImage.setIcon(imageIcon);
						setContentPane(backgroundImage);
					}
				// Defining Padding
				gridBagConstraints.insets = new Insets(5, 5, 5, 5);
				//
				gridBagConstraints.gridx = 1;
				gridBagConstraints.gridy = 1;
				gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
				usernameLabel.setForeground(Color.WHITE);
				panel.add(usernameLabel, gridBagConstraints);
				//
				gridBagConstraints.gridx = 2;
				gridBagConstraints.gridy = 1;
				gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
				// username.setPreferredSize(new Dimension(20, 100));
				panel.add(username, gridBagConstraints);
				//
				gridBagConstraints.gridx = 1;
				gridBagConstraints.gridy = 3;
				gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
				passwordLabel.setForeground(Color.WHITE);
				panel.add(passwordLabel, gridBagConstraints);
				//
				gridBagConstraints.gridx = 2;
				gridBagConstraints.gridy = 3;
				// password.setPreferredSize(new Dimension(20, 100));
				gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
				panel.add(password, gridBagConstraints);
				//
				gridBagConstraints.gridx = 1;
				gridBagConstraints.gridy = 5;
				gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
				login.addActionListener(loginListener);
				panel.add(login, gridBagConstraints);
				//
				panel.setPreferredSize(preferredSize);
				panel.setBounds(800, 400, 300, 200);
				panel.setBackground(new Color(0, 0, 0, 95));
				Container container = getContentPane();
				container.add(panel);
				container.revalidate();
				container.repaint();
			}

		public String getUsername()
			{
				return username.getText();
			}

		public String getPassword()
			{
				char[] passwordArray = password.getPassword();
				String passwordStr = String.valueOf(passwordArray);
				return passwordStr;
			}

	}
