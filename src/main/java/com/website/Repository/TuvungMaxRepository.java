package com.website.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.website.Entity.Tuvung_max_;

public interface TuvungMaxRepository extends CrudRepository<Tuvung_max_, Integer> {
	@Query(value = "FROM Tuvung_max_ e WHERE e.idtvmax = ?1")
	Tuvung_max_ findByIDTuvungMax(Integer ID);
	@Query(value = "FROM Tuvung_max_ e WHERE e.idchude = ?1")
	List<Tuvung_max_> findByIDchuDe(Integer ID);
}
