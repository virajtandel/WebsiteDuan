package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.website.Entity.Chitietnguphap;

public interface ChitietnguphapRepository extends CrudRepository<Chitietnguphap, Integer>{
	@Query(value = "FROM Chitietnguphap e where e.idctnp = ?1")
	Chitietnguphap findByIdCTNP(Integer ID);
}
