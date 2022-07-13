package com.example.fonyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fonyou.dao.AlumnoDao;
import com.example.fonyou.dao.ExamenDao;
import com.example.fonyou.dao.PreguntaDao;
import com.example.fonyou.dto.ExamenDto;
import com.example.fonyou.entity.PreguntaAplicada;
import com.example.fonyou.entity.Pregunta;
import com.example.fonyou.service.ExamenService;
import com.example.fonyou.util.ModelMapUtil;

@Service
public class ExamenServiceImpl implements ExamenService {
	
	@Autowired 
	private ExamenDao examenDao;
	
	@Autowired 
	private PreguntaDao preguntaDao;
	
	@Autowired 
	private AlumnoDao alumnoDao;
	
	@Autowired 
	private ModelMapUtil mapper;


	@Override
	public String newExamen(ExamenDto examenDto) {
		
		List<PreguntaAplicada> preguntasAplicadas = mapper.examenMapper(examenDto, alumnoDao.findById(examenDto.getAlumnoId()).get());
		
		examenDao.saveAll(preguntasAplicadas);
		
		return "OK";
	}


	@Override
	public String deleteExamen(Integer examenId) {
		examenDao.deleteById(examenId);
		
		return "OK";
	}


	@Override
	public ExamenDto getExamenByTimeZone(String timeZone) {
		ExamenDto dto = new ExamenDto();
		List<Pregunta> preguntas = preguntaDao.getExamenByTimeZone(timeZone);
		dto.setPreguntaList( mapper.preguntasMapper(preguntas));
		
		return dto;
	}

	@Override
	public List<PreguntaAplicada> getExamenByAlumno(Integer alumnoId) {
		return examenDao.getExamenByAlumnoId(alumnoId);
	}
	
}
