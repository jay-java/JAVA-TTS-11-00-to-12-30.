package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.dao.UserDao;
import com.model.User;

@Controller
public class UserController {
	@Autowired
	private UserDao dao;
	
	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}
	
	@RequestMapping("/home")
	public String homePage() {
		return "home";
	}
	
	@RequestMapping("/register")
	public String registerPage() {
		return "register";
	}
//	@RequestMapping(value="/create",method = RequestMethod.GET)
//	public void createAccount(
//			@RequestParam("name") String name,
//			@RequestParam("contact") long contact,
//			@RequestParam("address") String address
//			
//			) {
//		User u = new User();
//		u.setName(name);
//		u.setContact(contact);
//		u.setAddress(address);
//		System.out.println(u);
//	}
//	
	@RequestMapping(value="/create",method = RequestMethod.GET)
	public void createAccount(@ModelAttribute User u) {
		dao.inserOrupdateUser(u);
	}
	
}
