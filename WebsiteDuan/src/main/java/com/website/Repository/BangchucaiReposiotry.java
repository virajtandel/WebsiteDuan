package com.website.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.website.Entity.Bangchucai;


public interface BangchucaiReposiotry extends CrudRepository<Bangchucai, Integer> {
	@Query(value = "FROM Bangchucai e where e.idbang = ?1")
	Bangchucai findByIdBCC(Integer ID);
	@Query(value = "FROM Bangchucai e where e.idbang = :id")
	Optional<Bangchucai> findbyIDBCC1(@Param("id") Integer id);
	@Query(value = "FROM Bangchucai h WHERE h.loaibang = 'hiragana'")
	List<Bangchucai> FindByHiragana();
	@Query(value = "FROM Bangchucai e where e.loaibang = 'katakana'")
	List<Bangchucai> FindByKatakana();
	
}
