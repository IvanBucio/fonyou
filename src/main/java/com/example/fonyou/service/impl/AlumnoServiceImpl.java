package com.example.fonyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fonyou.dao.AlumnoDao;
import com.example.fonyou.entity.Alumno;
import com.example.fonyou.service.AlumnoService;
import com.example.fonyou.util.ModelMapUtil;

@Service
public class AlumnoServiceImpl implements AlumnoService {
	
	@Autowired 
	private AlumnoDao alumnoDao;
	
	@Autowired 
	private ModelMapUtil mapper;

	@Override
	public Alumno getAlumno(Integer id) {
		return alumnoDao.findById(id).get();
	}

	@Override
	public Alumno newAlumno(Alumno alumno) {
		return alumnoDao.save(alumno);
	}

	@Override
	public Alumno editAlumno(Alumno alumno) {
		return alumnoDao.save(alumno);
	}

	@Override
	public String deleteAlumno(Integer alumnoId) {
		alumnoDao.deleteById(alumnoId);
		
		return "OK";
	}

	@Override
	public List<Alumno> getAll() {
		return (List<Alumno>) alumnoDao.findAll();
	}
	
}
