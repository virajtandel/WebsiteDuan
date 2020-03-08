package com.website.Repository;




import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.website.Entity.Loaichude;

public interface LoaichudeRepository extends CrudRepository<Loaichude, Integer> {
	//Find By Id	
	@Query(value = "FROM Loaichude e where e.idloaichude = ?1")
	Loaichude findByIdLoaiChuDe(Integer ID);
	//Find Data Loai chu De (Rest Controller)
	@Query(value = "SELECT d.idloaichude, d.tenloaichude FROM Loaichude d")
	Iterable <Loaichude> findAllApiLoaiChuDe();

	
}
