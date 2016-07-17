package com.gRandViewTech.application.service.business;

import com.gRandViewTech.application.entity.bo.User;

public interface AuthenticationService
	{

		User authenticateUser(String username, String password);

	}
