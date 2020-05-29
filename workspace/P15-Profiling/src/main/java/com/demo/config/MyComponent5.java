package com.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = { "dev & local" })
class MyComponent5 implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("In development and local");
	}
}
