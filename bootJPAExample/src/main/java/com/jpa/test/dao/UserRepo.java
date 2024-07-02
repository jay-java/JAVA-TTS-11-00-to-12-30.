package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.model.User;

public interface UserRepo extends CrudRepository<User, Integer> {

	// find ->introducer
	// ByName->critarea
	public List<User> findByName(String name);
	public List<User> findByNameAndStatus(String name,String status);
	public List<User> findByStatus(String status);
	public List<User> findByCityStartingWith(String prefix);
	
	//query can be 2 types
	//1.JPQL-> like HQL
	
	@Query("select * from user")
	public List<User> getAllUser();
	

	@Query("select u from User u where u.city =:n")
	public List<User> getUserByCity(@Param("n") String city);
	
	
	//2.native query
	@Query(value="select * from user",nativeQuery = true)
	public List<User> getAll();
}
