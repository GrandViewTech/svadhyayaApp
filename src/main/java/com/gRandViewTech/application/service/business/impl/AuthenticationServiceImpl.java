package com.gRandViewTech.application.service.business.impl;

import org.springframework.stereotype.Service;

import com.gRandViewTech.application.entity.bo.User;
import com.gRandViewTech.application.service.business.AuthenticationService;
@Service
public class AuthenticationServiceImpl implements AuthenticationService
	{

		private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(AuthenticationServiceImpl.class);

		@Override
		public User authenticateUser(String username, String password)
			{
				return null;
			}
	}
