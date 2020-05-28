package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.demo.a.b")
public class P11SpringBootMvcApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(P11SpringBootMvcApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		builder.sources(P11SpringBootMvcApplication.class);
		return super.configure(builder);
	}
	
}
