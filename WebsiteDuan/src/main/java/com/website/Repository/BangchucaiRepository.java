package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.website.Entity.Bangchucai;

public interface BangchucaiRepository extends CrudRepository<Bangchucai, Integer> {
	@Query(value = "FROM Bangchucai e where e.idbang = ?1")
	Bangchucai findByIdBangChuCai(Integer ID);
}
