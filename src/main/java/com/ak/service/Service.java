package com.ak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;

import com.ak.dependency.Route;
import com.ak.dependency.model.AccountInfo;
import com.ak.model.UserInfo;

public class Service {

	@Autowired
	private Route route;

	@SuppressWarnings("rawtypes")
	public AccountInfo incomingRequest(RequestEntity requestEntity, UserInfo userInfo) {

		return route.accountInfo();
	}
}