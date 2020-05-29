package com.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = "local")
class MyComponent4 implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("In local");
	}
}
