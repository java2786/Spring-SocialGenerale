package com.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/home")
	public String homePage() {
		return "Home page";
	}
	@GetMapping("/login")
	public String loginPage() {
		return "Login Page";
	}
}
