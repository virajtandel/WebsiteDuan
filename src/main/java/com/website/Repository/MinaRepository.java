package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.website.Entity.Mina;

public interface MinaRepository extends CrudRepository<Mina, Integer> {
	@Query(value = "FROM Mina e where e.idmina = ?1")
	Mina findByIdBangMina(Integer ID);
}
