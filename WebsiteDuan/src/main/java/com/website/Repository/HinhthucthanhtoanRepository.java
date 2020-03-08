package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.website.Entity.Hinhthucthanhtoan;

public interface HinhthucthanhtoanRepository extends CrudRepository<Hinhthucthanhtoan, Integer> {
	@Query(value = "FROM Hinhthucthanhtoan e where e.idhinhthuctt = ?1")
	Hinhthucthanhtoan findByIdHinhThucTT(Integer ID);
}
