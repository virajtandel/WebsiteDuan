package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.website.Entity.Role;

public interface QuyenRepository extends CrudRepository<Role, Integer> {
	@Query(value = "FROM Role e where e.id = ?1")
	Role findByIDQuyen(Integer ID);
	@Query(value = "select r FROM Role r  where r.name = 'ROLE_USER'")
	Role findIDbyname();
}
