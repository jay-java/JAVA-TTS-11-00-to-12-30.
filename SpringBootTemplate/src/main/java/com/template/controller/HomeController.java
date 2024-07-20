package com.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index(Model m) {
		return "index";
	}
	@GetMapping("/about")
	public String about(Model m) {
		return "about";
	}
	@GetMapping("/registerr")
	public String register(Model m) {
		return "register";
	}
	@GetMapping("/login")
	public String login(Model m) {
		return "login";
	}
}
