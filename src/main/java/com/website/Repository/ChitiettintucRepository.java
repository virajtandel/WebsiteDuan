package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.website.Entity.Chiitiettintuc;

public interface ChitiettintucRepository extends CrudRepository<Chiitiettintuc, Integer> {
	@Query(value = "FROM Chiitiettintuc e where e.idcttintuc = ?1")
	Chiitiettintuc findByIDCTTT(Integer ID);


}
