package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.website.Entity.Dapan;

public interface DapanRepository extends CrudRepository<Dapan,Integer>{
	@Query(value = "FROM Dapan e where e.iddapan = ?1")
	Dapan findByIDDapAn(Integer ID);
}
