package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.website.Entity.Tuvung_min_;

public interface TuvungminRepository extends CrudRepository<Tuvung_min_, Integer> {
	@Query(value = "FROM Tuvung_min_ e where e.idtvmin = ?1")
	Tuvung_min_ findByIDTuVungMin(Integer ID);
	//get by ID
		@Query(value = "select t.idtvmin  ,t.nghiatvmin , t.tvjpmin ,m.tenmina, m.audiotumoi from Tuvung_min_ t, Mina m where t.idmina=m.idmina and m.idmina = :id")
		Iterable<Tuvung_min_> findByIDTV(@Param("id") Integer id);
}
