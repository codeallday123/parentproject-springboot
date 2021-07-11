package com.ak.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ak.dependency.Route;

@Configuration
public class Config {

	@Bean(name = "router")
	public Route route() {
		return new Route();

	}

}
