package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.demo.dto.Item;

@SpringBootApplication
public class P12SpringBootRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(P12SpringBootRestApplication.class, args);
	}
	
//	@Bean
//	@Scope("prototype")
//	public Item getItem() {
//		Item item = new Item();
//		item.setId(0);
//		return item;
//	}
	

}
