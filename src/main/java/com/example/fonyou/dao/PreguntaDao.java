package com.example.fonyou.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.fonyou.entity.Pregunta;

public interface PreguntaDao extends CrudRepository<Pregunta, Integer> {
	
	@Query(value = "Select p from Pregunta p where p.timeZone = timeZone")
	public List<Pregunta> getExamenByTimeZone(String timeZone);
	
}

