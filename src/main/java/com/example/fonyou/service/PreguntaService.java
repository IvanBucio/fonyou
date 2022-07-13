package com.example.fonyou.service;

import java.util.List;

import com.example.fonyou.entity.Pregunta;

public interface PreguntaService {

	public Pregunta getPregunta(Integer id);

	public Pregunta newPregunta(Pregunta pregunta);

	public Pregunta editPregunta(Pregunta pregunta);

	public String deletePregunta(Integer preguntaId);

	public List<Pregunta> getAll();
}
