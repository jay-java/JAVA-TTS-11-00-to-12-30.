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
	@GetMapping("/event-details")
	public String ED(Model m) {
		return "event-details";
	}
	@GetMapping("/rent-venue")
	public String RV(Model m) {
		return "rent-venue";
	}
	@GetMapping("/shows-events")
	public String SE(Model m) {
		return "shows-events";
	}
	@GetMapping("/ticket-details")
	public String TD(Model m) {
		return "ticket-details";
	}
	@GetMapping("/tickets")
	public String tickets(Model m) {
		return "tickets";
	}
	
}
