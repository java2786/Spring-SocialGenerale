package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.entity.User;

@Controller
@RequestMapping("user")
public class UserController {

	@RequestMapping(value="login", method=RequestMethod.GET)
	public String loginPage() {
		return "user/login";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	// request has attribute/data/param -> email, pwd
	public String loginHandler(@ModelAttribute User user, Model model) {
		System.out.println(user);
		if(user.getEmail().equals(user.getPwd())) {
			System.out.println("valid user");
			model.addAttribute("email", user.getEmail());
			return "user/welcome";
		} else {
			System.out.println("Invalid user");
			return "user/login";
		}
//		return "user/login";
	}
}
