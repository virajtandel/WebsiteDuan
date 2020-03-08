package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.website.Entity.Chitietkhoahoc;

public interface ChitietkhoahocRepository extends CrudRepository<Chitietkhoahoc, Integer>{
	@Query(value = "FROM Chitietkhoahoc e where e.idctkh = ?1")
	Chitietkhoahoc findByIdCtKH(Integer ID);
}
