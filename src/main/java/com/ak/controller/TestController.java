package com.ak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ak.dependency.model.AccountInfo;
import com.ak.service.Service;

/**
 * Controller component to serve all REST requests.
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

	@Autowired
	private Service service;

	@RequestMapping(value = "/account",method = RequestMethod.GET)
	public AccountInfo mainRequest() {
		System.out.println("Controller");
		return service.incomingRequest();
	}
}