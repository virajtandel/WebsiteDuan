package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.website.Entity.Chitietbaihoc;

public interface ChitietbaihocRepository extends CrudRepository<Chitietbaihoc, Integer> {
	@Query(value = "FROM Chitietbaihoc e where e.idctbh = ?1")
	Chitietbaihoc findByIDCTBH(Integer ID);

}
