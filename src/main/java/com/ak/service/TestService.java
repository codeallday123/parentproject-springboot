package com.ak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ak.aspect.MethodLog;
import com.ak.dependency.Route;
import com.ak.dependency.model.AccountInfo;

@Component
public class TestService {

	@Autowired
	private Route route;

	@SuppressWarnings("rawtypes")
	@MethodLog
	public AccountInfo incomingRequest() {

		return route.accountInfo();
	}
}