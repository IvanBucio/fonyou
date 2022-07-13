package com.example.fonyou.service;

import java.util.List;

import com.example.fonyou.entity.Alumno;

public interface AlumnoService {

	public Alumno getAlumno(Integer id);
	
	public Alumno newAlumno(Alumno alumno);
	
	public Alumno editAlumno(Alumno alumno);
	
	public String deleteAlumno(Integer alumnoId);
	
	public List<Alumno> getAll();
	
}
