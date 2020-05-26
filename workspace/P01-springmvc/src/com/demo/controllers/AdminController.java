package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("admin")
public class AdminController {

//	localhost:8888/P01-springmvc/mvc/admin/*
	@RequestMapping("greet")
	public ModelAndView adminHandler() {
		ModelAndView mav = new ModelAndView("admin/welcome");
		mav.addObject("data", 1256);
		return mav;
	}
}
