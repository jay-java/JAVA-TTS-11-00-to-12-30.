package com.rest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rest.dao.UserRepo;
import com.rest.model.User;

@Component
public class UserService {
	@Autowired
	private UserRepo userRepo;
//	private static List<User> list = new ArrayList<>();
//	static {
//		list.add(new User(1, "user1", "abc"));
//		list.add(new User(2, "user2", "abc"));
//		list.add(new User(3, "user3", "abc"));
//	}
	
	public List<User> getAllUser(){
//		return list;
		List<User> list = (List<User>) this.userRepo.findAll();
		return list;
	}
	
	public User getUserById(int id) {
//		User user = null;
//		user = list.stream().filter(u-> u.getId() == id).findFirst().get();
//		return user;
		User user = this.userRepo.findById(id);
		return user;
	}
	
	public User addUser(User user) {
//		list.add(user);
//		return user;
		this.userRepo.save(user);
		return user;
	}
	
	public void deleteUser(int id) {
//		 list = list.stream().filter(u->u.getId()!=id).collect(Collectors.toList());
//		 return list;
		this.userRepo.deleteById(id);
	}
	
	public void updateUser(User user,int id) {
//		list = list.stream().map(u->{
//			if(u.getId() == id) {
//				u.setName(user.getName());
//				u.setAddress(user.getAddress());
//			}
//			return u;
//		}).collect(Collectors.toList());
//		return user;
		user.setId(id);
		this.userRepo.save(user);
	}
}

