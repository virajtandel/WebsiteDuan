package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.website.Entity.Giaotrinh;

public interface GiaotrinhRepository extends CrudRepository<Giaotrinh, Integer> {
	@Query(value = "FROM Giaotrinh e where e.idgiaotrinh = ?1")
	Giaotrinh findByIdGiaoTrinh(Integer ID);
}
