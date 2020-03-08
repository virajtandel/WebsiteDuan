package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.website.Entity.Chitietthanhtoan;

public interface ChitietthanhtoanRepository extends CrudRepository<Chitietthanhtoan, Integer> {
	@Query(value = "FROM Chitietthanhtoan e where e.idcttt = ?1")
	Chitietthanhtoan findByIdCTNP(Integer ID);
}
