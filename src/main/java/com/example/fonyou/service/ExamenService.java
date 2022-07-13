package com.example.fonyou.service;

import java.util.List;

import com.example.fonyou.dto.ExamenDto;
import com.example.fonyou.entity.PreguntaAplicada;

public interface ExamenService {

	public String newExamen(ExamenDto examen);
	
	public String deleteExamen(Integer examenId);
	
	public ExamenDto getExamenByTimeZone(String timeZone);
	
	public List<PreguntaAplicada> getExamenByAlumno(Integer alumnoId);
	
}
