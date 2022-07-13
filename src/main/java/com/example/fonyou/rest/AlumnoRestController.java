package com.example.fonyou.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fonyou.entity.Alumno;
import com.example.fonyou.service.AlumnoService;

@RestController
@RequestMapping("alumno")
public class AlumnoRestController {
	
	@Autowired
	private AlumnoService service;
	
	
	@GetMapping("/all")
	public List<Alumno> getAllAlumnos () {
		return service.getAll();
	}
	
	
	@GetMapping("/{alumno}")
	public Alumno getAlumnoById(@PathVariable int alumnoId) {
		
		return service.getAlumno(alumnoId);
	}
	
	@PostMapping("/new")
	public Alumno newAlumno(@RequestBody Alumno alumno) {
		
		return service.newAlumno(alumno);
	}
	
	@PostMapping("/edit/")
	public Alumno editAlumno(@RequestBody Alumno alumno) {
		return service.editAlumno(alumno);
	}
	
	@PostMapping("/delete/{alumno}")
	public String deleteAlumno(@PathVariable int alumnoId) {
		
		return service.deleteAlumno(alumnoId);
	}
}
