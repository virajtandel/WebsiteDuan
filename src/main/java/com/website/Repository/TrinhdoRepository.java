package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.website.Entity.Trinhdo;

public interface TrinhdoRepository extends CrudRepository<Trinhdo, Integer> {
	@Query(value = "FROM Trinhdo e where e.idtrinhdo = ?1")
	Trinhdo findByIDTrinhDo(Integer ID);
}
