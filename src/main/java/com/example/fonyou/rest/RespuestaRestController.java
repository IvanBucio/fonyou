package com.example.fonyou.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fonyou.entity.Respuesta;
import com.example.fonyou.service.RespuestaService;

@RestController
@RequestMapping("respuesta")
public class RespuestaRestController {
	
	@Autowired
	private RespuestaService service;
	
	@GetMapping("/all")
	public List<Respuesta> getAllRespuesta () {
		return service.getAll();
	}
	
	
	@GetMapping("/{respuestaId}")
	public Respuesta getRespuestaById(@PathVariable Integer respuestaId) {
		
		return service.getRespuesta(respuestaId);
	}
	
	@PostMapping("/new")
	public Respuesta newRespuesta(@RequestBody Respuesta respuesta) {
		
		return service.newRespuesta(respuesta);
	}
	
	@PostMapping("/edit/")
	public Respuesta editRespuesta(@RequestBody Respuesta respuesta) {
		return service.editRespuesta(respuesta);
	}
	
	@PostMapping("/delete/{respuestaId}")
	public String deleteRespuesta(@PathVariable Integer respuestaId) {
		
		return service.deleteRespuesta(respuestaId);
	}
}
