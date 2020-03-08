package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.website.Entity.Khoahoc;

public interface KhoahocRepository extends CrudRepository<Khoahoc, Integer> {
	@Query(value = "FROM Khoahoc e where e.idkhoahoc = ?1")
	Khoahoc findByIDKhoaHoc(Integer ID);
}
