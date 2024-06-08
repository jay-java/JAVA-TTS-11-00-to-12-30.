package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("/")
	public String indexPage(HttpServletRequest request) {
		request.setAttribute("id", 1);
		request.setAttribute("name", "java");
		request.setAttribute("contact", 98765231l);
		return "index";
	}
	
	@RequestMapping("/home")
	public String homePage() {
		return "home";
	}
	
	@RequestMapping("/contact")
	public String contactPage() {
		return "contact";
	}
	
}
