package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.website.Entity.Chitietbaitest;

public interface ChitietbaitestRepository extends CrudRepository<Chitietbaitest, Integer> {
	@Query(value = "FROM Chitietbaitest e where e.idctbaitest = ?1")
	Chitietbaitest findByCTBT(Integer ID);

}
