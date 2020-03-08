package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.website.Entity.Thanhtoan;


public interface ThanhtoanRepository extends CrudRepository<Thanhtoan, Integer> {
	@Query(value = "FROM Thanhtoan e where e.idthanhtoan = ?1")
	Thanhtoan findByIdHinhThucTT(Integer ID);
}
