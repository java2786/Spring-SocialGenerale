package com.demo.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.dto.Person1;

@Configuration
@Import(E11_Config.class)
public class E11_Import {

	@Bean(initMethod="init", destroyMethod="destroy")
	public Person1 getPersonBean() {
		return new Person1();
	}
}
