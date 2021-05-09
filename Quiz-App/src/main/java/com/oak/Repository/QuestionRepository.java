package com.oak.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.oak.dto.Question;
import com.oak.dto.Question_Options;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Integer> {

	List<Question> findAll();
	
}