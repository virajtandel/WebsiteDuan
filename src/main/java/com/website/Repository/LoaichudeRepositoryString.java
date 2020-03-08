package com.website.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.website.Entity.Loaichude;

public interface LoaichudeRepositoryString extends CrudRepository<Loaichude, String> {
	//Find By ten loai chu de
	@Query("SELECT u.tenloaichude FROM Loaichude u WHERE u.tenloaichude LIKE ('%',:tenloaichude,'%')")
	List<Loaichude> findUsersWithPartOfName(@Param("tenloaichude") String tenloaichude);
}
