package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.website.Entity.Baitest;

public interface BaitestRepository extends CrudRepository<Baitest, Integer> {
	@Query(value = "FROM Baitest e where e.idbaitest = ?1")
	Baitest findByBaiTestbyID(Integer ID);

}
