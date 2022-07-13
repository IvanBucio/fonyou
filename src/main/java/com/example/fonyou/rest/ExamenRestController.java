package com.example.fonyou.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fonyou.dto.ExamenDto;
import com.example.fonyou.entity.PreguntaAplicada;
import com.example.fonyou.service.ExamenService;

@RestController
@RequestMapping("/examen")
public class ExamenRestController {
	
	@Autowired
	private ExamenService service;
	
	
	@GetMapping
	public ExamenDto getExamenByTimeZone(@PathVariable String timeZone) {
		
		return service.getExamenByTimeZone(timeZone);
	}
	
	@GetMapping("/{alumnoId}")
	public List<PreguntaAplicada> getExamenById(@PathVariable int alumnoId) {
		
		return service.getExamenByAlumno(alumnoId);
	}
	
	@PostMapping("/new")
	public String newExamen(@RequestBody ExamenDto examen) {
		
		return service.newExamen(examen);
	}
	
	
	@PostMapping("/delete/{examenId}")
	public String deleteExamen(@PathVariable int examenId) {
		
		return service.deleteExamen(examenId);
	}
}
