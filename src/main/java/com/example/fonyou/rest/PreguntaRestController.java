package com.example.fonyou.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fonyou.entity.Pregunta;
import com.example.fonyou.service.PreguntaService;

@RestController
@RequestMapping("pregunta")
public class PreguntaRestController {
	
	@Autowired
	private PreguntaService service;
	
	@GetMapping("/all")
	public List<Pregunta> getAllPregunta () {
		return service.getAll();
	}
	
	
	@GetMapping("/{preguntaId}")
	public Pregunta getPreguntaById(@PathVariable Integer preguntaId) {
		
		return service.getPregunta(preguntaId);
	}
	
	@PostMapping("/new")
	public Pregunta newPregunta(@RequestBody Pregunta pregunta) {
		
		return service.newPregunta(pregunta);
	}
	
	@PostMapping("/edit/")
	public Pregunta editPregunta(@RequestBody Pregunta pregunta) {
		return service.editPregunta(pregunta);
	}
	
	@PostMapping("/delete/{preguntaId}")
	public String deletePregunta(@PathVariable Integer preguntaId) {
		
		return service.deletePregunta(preguntaId);
	}
}
