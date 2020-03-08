package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.website.Entity.Loaikhoahoc;

public interface LoaikhoahocRepository extends CrudRepository<Loaikhoahoc, Integer> {
	@Query(value = "FROM Loaikhoahoc e where e.idloaikh = ?1")
	Loaikhoahoc findByIDLoaiKH(Integer ID);
}
