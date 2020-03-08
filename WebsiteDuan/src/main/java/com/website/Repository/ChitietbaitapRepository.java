package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.website.Entity.Chitietbaitap;

public interface ChitietbaitapRepository extends CrudRepository<Chitietbaitap, Integer> {
	@Query(value = "FROM Chitietbaitap e where e.idctbt = ?1")
	Chitietbaitap findByIdCTbt(Integer ID);
}
