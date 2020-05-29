package com.demo.conrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityDemoController {

	@GetMapping("/")
	public String greet() {
		return "Welcome all";
	}
	@GetMapping("/home")// not protected
	public String homePage() {
		return "Home page";
	}
	@GetMapping("/user")// only for users
	public String users() {
		return "Only users can visit here";
	}
	@GetMapping("/admin")// only for admins
	public String admins() {
		return "Only admins can visit here";
	}
//	@GetMapping("/user-admin")// only for users & admins
}
