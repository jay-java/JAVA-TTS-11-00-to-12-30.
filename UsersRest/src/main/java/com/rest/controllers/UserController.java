package com.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.User;
import com.rest.service.UserService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return this.userService.getAllUser();
	}
	
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable("id") int id) {
		 User user = this.userService.getUserById(id);
		 return user;
	}
	
	@PostMapping("/users")
	public List<User> addUser(@RequestBody User u) {
		User user = this.userService.addUser(u);
		return userService.getAllUser();
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable("id") int id) {
		this.userService.deleteUser(id);
	}
	
	@PutMapping("/users/{id}")
	public void updateUser(@PathVariable("id") int id, @RequestBody User u) {
		this.userService.updateUser(u, id);
	}
	
}
