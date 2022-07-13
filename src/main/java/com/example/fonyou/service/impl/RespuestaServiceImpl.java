package com.example.fonyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fonyou.dao.RespuestaDao;
import com.example.fonyou.entity.Respuesta;
import com.example.fonyou.service.RespuestaService;

@Service
public class RespuestaServiceImpl implements RespuestaService {
	
	@Autowired 
	private RespuestaDao respuestaDao;

	@Override
	public Respuesta getRespuesta(Integer id) {
		return respuestaDao.findById(id).get();
	}

	@Override
	public Respuesta newRespuesta(Respuesta respuesta) {
		return respuestaDao.save(respuesta);
	}

	@Override
	public Respuesta editRespuesta(Respuesta respuesta) {
		return respuestaDao.save(respuesta);
	}

	@Override
	public String deleteRespuesta(Integer respuestaId) {
		respuestaDao.deleteById(respuestaId);
		
		return "OK";
	}

	@Override
	public List<Respuesta> getAll() {
		return (List<Respuesta>) respuestaDao.findAll();
	}
	
}
