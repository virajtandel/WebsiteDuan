package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.website.Entity.Hocthu;

public interface HocthuRepository extends CrudRepository<Hocthu, Integer> {
	@Query(value = "FROM Hocthu e where e.idhocthu = ?1")
	Hocthu FindByIdHocThu(Integer ID);
}
