package com.rest.dao;

import org.springframework.data.repository.CrudRepository;

import com.rest.model.User;

public interface UserRepo extends CrudRepository<User, Integer>{

	public User findById(int id);
}
