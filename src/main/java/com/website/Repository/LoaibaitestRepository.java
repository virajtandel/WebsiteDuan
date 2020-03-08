package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.website.Entity.Loaibaitest;

public interface LoaibaitestRepository extends CrudRepository<Loaibaitest, Integer> {
	@Query(value = "FROM Loaibaitest e where e.idloaibaitest = ?1")
	Loaibaitest findByIDLoaiBaiTest(Integer ID);
}
