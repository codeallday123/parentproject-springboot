package com.ak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ak.model.AccountInfo;
import com.ak.model.UserInfo;
import com.ak.service.Service;

/**
 * Controller component to serve all REST requests.
 */
@RestController
@RequestMapping(value = { "/**" })
public class TestController {

	@Autowired
	private Service service;

	@SuppressWarnings({ "rawtypes" })
	@RequestMapping(value = "/user/userdetails", method = RequestMethod.GET )
	public AccountInfo mainRequest(RequestEntity requestEntity, UserInfo userInfo) {

		userInfo = new UserInfo();
		userInfo.setUserId("123456");
		userInfo.setUserName("user1");
		userInfo.setUserNumber(123);
		
		return service.incomingRequest(requestEntity, userInfo);
	}
}