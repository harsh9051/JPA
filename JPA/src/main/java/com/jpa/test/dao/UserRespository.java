package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.User;

public interface UserRespository extends CrudRepository<User, Integer>{
	public List<User> findByName(String name);
	public List<User> findByNameStartingWith(String name);
	
	
	//This are query that are made by programmer to get the data from database
	@Query("select u FROM User u")
	public List<User> getAllUser();
	
	@Query("select u FROM User u where u.name=:n")
	public List<User> getUserByName(@Param("n") String name);
}
