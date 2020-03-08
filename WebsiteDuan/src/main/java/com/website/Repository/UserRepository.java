package com.website.Repository;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;

import com.website.Entity.User;

//
public interface UserRepository extends CrudRepository<User, Integer> {
	@Query(value = "FROM User e WHERE e.id = ?1")
	User findByIDUser(Integer ID);
	@Query(value = "Select u FROM User u where u.username = ?1")
	User findIDByUserName(String u);
	@Query(value = "Select u FROM User u where u.username = ?1")
	User findByName(String us);

	//exist usernamex
//	
//	
//	@Query(value = "FROM User e where e.idusers = ?1")
//	User findUserbyID(Integer ID);
//	User findByUserName(String username);
}
