package com.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
class MyComponent1 implements CommandLineRunner {
	@Autowired
	private Environment environment;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Active profiles: " + Arrays.toString(environment.getActiveProfiles()));
	}
}
