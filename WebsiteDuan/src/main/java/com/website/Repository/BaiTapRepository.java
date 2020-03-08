package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.website.Entity.Baitap;

public interface BaiTapRepository extends CrudRepository<Baitap, Integer>{
	@Query(value = "FROM Baitap e where e.idbaitap = ?1")
	Baitap findByBaiTapbyID(Integer ID);
}
