package com.demo.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dto.Message;

@Configuration
public class E01_Basic {
	
	@Bean
	public Message getMessageInstance(){
		Message message = new Message();
		message.setMessage("Hello annotation world...");
		return message;
	}
}
