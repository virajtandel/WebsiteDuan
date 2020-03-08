package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.website.Entity.Cauhoi;

public interface CauhoiRepository extends CrudRepository<Cauhoi, Integer>{
	@Query(value = "FROM Cauhoi e where e.idcauhoi = ?1")
	Cauhoi findByIdCauHoi(Integer ID);

}
