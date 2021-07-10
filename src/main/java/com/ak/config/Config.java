package com.ak.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ak.Route;

@Configuration
public class Config {

	@Bean(name = "nemesisRouter")
	public Route route() {
		return new Route();

	}

}
