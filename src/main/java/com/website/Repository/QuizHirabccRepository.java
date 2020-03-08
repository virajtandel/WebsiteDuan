package com.website.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.website.Entity.QuizHirabcc;

public interface QuizHirabccRepository extends CrudRepository<QuizHirabcc, Integer>{
	@Query(value = "FROM QuizHirabcc e where e.id = ?1")
	QuizHirabcc FindByIdQuiz(Integer ID);
}
