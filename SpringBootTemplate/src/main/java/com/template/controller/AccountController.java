package com.template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.template.model.Account;
import com.template.service.AccountService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@GetMapping("/register")
	public String register(Model model) {
		Account account = new Account();
		model.addAttribute("account",  account);
		return "register";
	}
	
	@PostMapping("/registerAccount")
	public String registerAcccuount(@ModelAttribute Account account) {
		this.accountService.saveAccount(account);
		return "redirect:/";
	}
	
//	@GetMapping("/loginAccount")
//	public String loginAccount(Model model) {
//		re
//	}
	
}
