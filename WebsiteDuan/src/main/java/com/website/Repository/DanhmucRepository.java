package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.website.Entity.Danhmuc;

public interface DanhmucRepository extends CrudRepository<Danhmuc, Integer> {
	@Query(value = "FROM Danhmuc e where e.iddanhmuc = ?1")
	Danhmuc findByIdDanhMuc(Integer ID);
}
