package com.example.fonyou.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.fonyou.entity.PreguntaAplicada;

public interface ExamenDao extends CrudRepository<PreguntaAplicada, Integer> {
	
	@Query(value = "Select p from PreguntaAplicada p where p.alumno.id = alumnoId")
	public List<PreguntaAplicada> getExamenByAlumnoId(Integer alumnoId);

}

