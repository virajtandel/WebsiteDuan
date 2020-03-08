package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.website.Entity.Tintuc;

public interface TintucRepository extends CrudRepository<Tintuc, Integer> {
	@Query(value = "FROM Tintuc e where e.idtintuc = ?1")
	Tintuc findByIDTinTuc(Integer ID);
}
