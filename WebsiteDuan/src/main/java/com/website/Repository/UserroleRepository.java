package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.website.Entity.UsersRole;

public interface UserroleRepository extends CrudRepository<UsersRole, Integer> {
	@Query(value = "FROM UsersRole e where e.id = ?1")
	UsersRole findByIDUserRole(Integer ID);
}
