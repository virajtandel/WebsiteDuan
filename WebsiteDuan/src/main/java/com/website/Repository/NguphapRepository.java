package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.website.Entity.Nguphap;

public interface NguphapRepository extends CrudRepository<Nguphap, Integer> {
	@Query(value = "FROM Nguphap e where e.idnguphap = ?1")
	Nguphap findByIdNguPhap(Integer ID);
}
