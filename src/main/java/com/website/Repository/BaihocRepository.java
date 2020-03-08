package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.website.Entity.Baihoc;

public interface BaihocRepository extends CrudRepository<Baihoc, Integer> {
	@Query(value = "FROM Baihoc e where e.idbaihoc = ?1")
	Baihoc findByBaiHocbyID(Integer ID);
}
