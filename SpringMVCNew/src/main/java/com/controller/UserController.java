package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
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
	public String homePage(Model m) {
		List<User> list = this.dao.getAllUser();
		m.addAttribute("list", list);
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
	public String createAccount(@ModelAttribute User u,Model m) {
		System.out.println("updated : "+u);
		dao.inserOrupdateUser(u);
		List<User> list = this.dao.getAllUser();
		m.addAttribute("list", list);
		return "home";
	}
	
	@RequestMapping(value="/edit/{id}")
	public ModelAndView editUser(@PathVariable("id") int id) {
		User u= dao.getUserById(id);
		ModelAndView m = new ModelAndView();
		m.addObject("user", u);
		m.setViewName("update");
		return m;
	}
	
	@RequestMapping(value="/delete/{id}")
	public String deleteUser(@PathVariable("id") int id,Model m) {
		dao.deleteUser(id);
		List<User> list = this.dao.getAllUser();
		m.addAttribute("list", list);
		return "home";
	}
	
}
