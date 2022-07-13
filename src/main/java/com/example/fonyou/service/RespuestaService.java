package com.example.fonyou.service;

import java.util.List;

import com.example.fonyou.entity.Respuesta;

public interface RespuestaService {

	public Respuesta getRespuesta(Integer id);
	
	public Respuesta newRespuesta(Respuesta respuesta);
	
	public Respuesta editRespuesta(Respuesta respuesta);
	
	public String deleteRespuesta(Integer respuestaId);
	
	public List<Respuesta> getAll();
	
}
