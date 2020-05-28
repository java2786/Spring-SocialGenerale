package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.demo.a.b")
public class P10SpringBootMvcApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(P10SpringBootMvcApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		builder.sources(P10SpringBootMvcApplication.class);
		return super.configure(builder);
	}
	
}
