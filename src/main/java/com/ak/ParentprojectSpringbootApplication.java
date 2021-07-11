package com.ak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.ak.*" })
//@SpringBootApplication
public class ParentprojectSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParentprojectSpringbootApplication.class, args);
	}

}
