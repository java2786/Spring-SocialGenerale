package com.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.entities.User;
import com.demo.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

//	@RequestMapping(value="/", method=RequestMethod.GET)
//	@RequestMapping(value="/")
//	@RequestMapping("/")
	@GetMapping("/")
	public String homePage() {
		return "home";
	}

	@RequestMapping("/signup")
	public String signupPage() {
		return "signup";
	}


//	@RequestMapping(value="/signup", method=RequestMethod.POST)
	@PostMapping("/signup")
	public String signupHandler(User user) {
		System.out.println("we are in signup handler");
		System.out.println(user);
		
		User createUser = userService.createUser(user);
		if(createUser!=null) {
			return "login";
		} else {
			return "signup";
		}
	}
	
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	@PostMapping("/login")
	public String handleLogin(@ModelAttribute User user, Model model) {
		
		User loggedInUser = userService.getLogin(user);
		
		if(loggedInUser == null) {			
			return "login";
		} else {
			model.addAttribute("userObj", loggedInUser);
			return "welcome";
		}
	}
	
	
	
//	/remove/abc@gmail.com
	@GetMapping("/remove/{email}")
	public String removeAccount(@PathVariable String email) {
		
		userService.removeAccount(email);
		
		
		
		return "home";
	}
	
	@GetMapping("/update")
	public String updatePage() {
		return "update";
	}
	
	
	@PostMapping("/update")
	public String updateAccount(User user, Model model) {
		
		User updatedUser = userService.edit(user);
		
		model.addAttribute("userObj", updatedUser);
		
		return "welcome";
	}
	
	

}
