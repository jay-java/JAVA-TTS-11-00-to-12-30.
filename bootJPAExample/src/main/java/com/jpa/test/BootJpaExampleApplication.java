package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepo;
import com.jpa.test.model.User;

@SpringBootApplication
public class BootJpaExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootJpaExampleApplication.class, args);
//		System.out.println("started");
		UserRepo userRepo = context.getBean(UserRepo.class);
		
		//1. create object of user
		User user = new User();
		user.setName("user2");
		user.setCity("delhi");
		user.setStatus("from delhi");
		User java = new User();
		java.setName("java");
		java.setCity("delhi");
		java.setStatus("from delhi");
//		saving single user
//		User user1 =  userRepo.save(user);
//		System.out.println(user1);
//		List<User> allUsers = List.of(user,java);
//		//save multiple users
//		Iterable<User> res = userRepo.saveAll(allUsers);
//		res.forEach(u->{
//			System.out.println("users : "+u);
//		});
		
		
		
		
		
		// 2. update the user of id ->52
//		Optional<User> optional = userRepo.findById(52);
//		User u = optional.get();
//		u.setName("python");
//		User updatedUser = userRepo.save(u);
//		System.out.println("new data"+updatedUser);
		
		
		//fetch all User
//		Iterable<User> iterable = userRepo.findAll();
		//standard way
//		Iterator<User> itr = iterable.iterator();
//		while(itr.hasNext()) {
//			User u = itr.next();
//			System.out.println(u);
//		}
		
		//by for each
//		iterable.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//		});
		
		//by lambda
//		iterable.forEach(u->System.out.println(u));

		
		
		
		
		//3. delete data
//		userRepo.deleteById(53);
//		System.out.println("deleted");
		
//		Iterable<User> iterable = userRepo.findAll();
//		iterable.forEach(user->System.out.println(user));
//		userRepo.deleteAll(iterable);
		
		
//		List<User> list = userRepo.findByCityStartingWith("d");
//		list.forEach(u->System.out.println(u));
		
		
		//search for spring data support keywords
//		List<User> list = userRepo.getAllUser();
//		list.forEach(u->{
//			System.out.println(u);
//		});
		
//		List<User> list= userRepo.getUserByCity("delhi");
//		list.forEach(u->{
//			System.out.println(u);
//		});
		
//		userRepo.getAll().forEach(u->{System.out.println(u);});
	}

}
