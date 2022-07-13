package com.example.fonyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fonyou.dao.PreguntaDao;
import com.example.fonyou.entity.Pregunta;
import com.example.fonyou.service.PreguntaService;

@Service
public class PreguntaServiceImpl implements PreguntaService {
	
	@Autowired 
	private PreguntaDao preguntaDao;

	@Override
	public Pregunta getPregunta(Integer id) {
		return preguntaDao.findById(id).get();
	}

	@Override
	public Pregunta newPregunta(Pregunta pregunta) {
		return preguntaDao.save(pregunta);
	}

	@Override
	public Pregunta editPregunta(Pregunta pregunta) {
		return preguntaDao.save(pregunta);
	}

	@Override
	public String deletePregunta(Integer preguntaId) {
		preguntaDao.deleteById(preguntaId);
		
		return "OK";
	}

	@Override
	public List<Pregunta> getAll() {
		return (List<Pregunta>) preguntaDao.findAll();
	}
	


}
