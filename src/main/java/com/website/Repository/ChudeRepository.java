package com.website.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.website.Entity.Chude;

public interface ChudeRepository extends CrudRepository<Chude, Integer> {
	@Query(value = "FROM Chude e WHERE e.idchude = ?1")
	Chude findIDChuDe(Integer id);
	@Query(value = "FROM Chude e WHERE e.loaichude.idloaichude = ?1")
	List <Chude> findByIdLoaiChudDe(Integer id);
}
