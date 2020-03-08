package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.website.Entity.Nguphap;

public interface NguphapRepository extends CrudRepository<Nguphap, Integer> {
	@Query(value = "FROM Nguphap e where e.idnguphap = ?1")
	Nguphap findByIdNguPhap(Integer ID);
	//get by ID
		@Query(value = "select e.idnguphap  ,e.tennguphap,e.noidungnp ,m.tenmina from Nguphap e, Mina m where e.mina=m.idmina and m.idmina = :id")
		Iterable<Nguphap> findByIDNP2(@Param("id") Integer id);
}
