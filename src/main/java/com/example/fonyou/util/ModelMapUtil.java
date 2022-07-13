package com.example.fonyou.util;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.fonyou.dto.ExamenDto;
import com.example.fonyou.dto.PreguntaDto;
import com.example.fonyou.dto.RespuestaDto;
import com.example.fonyou.entity.Alumno;
import com.example.fonyou.entity.PreguntaAplicada;
import com.example.fonyou.entity.Pregunta;
import com.example.fonyou.entity.Respuesta;

import lombok.Data;

@Component
@Data
public class ModelMapUtil {
	
	private ModelMapper mapper;
	
	public ModelMapUtil() {
		this.mapper = new ModelMapper();
	}
	
	public List<PreguntaDto> preguntasMapper(List<Pregunta> preguntas) {
		
		return preguntas.stream().map(this::preguntaMapper).toList();
	}
	
	public PreguntaDto preguntaMapper(Pregunta pregunta) {
		PreguntaDto dto = new PreguntaDto();
		
		dto.setPreguntaId(pregunta.getId());
		dto.setRespuestas(pregunta.getRespuestaList().stream().map(this::respuestaMapper).toList());
		return dto;
	}
	
	public RespuestaDto respuestaMapper(Respuesta respuesta) {
		RespuestaDto dto = new RespuestaDto();
		dto.setRespuestaId(respuesta.getId());
		dto.setRespuesta(respuesta.getRespuesta());
		return dto;
	}
	
	public List<PreguntaAplicada> examenMapper(ExamenDto dto, Alumno alumno) {
		List<PreguntaAplicada> examenAplicado = new ArrayList<>();
		
		for(PreguntaDto preguntaDto : dto.getPreguntaList()) {
			PreguntaAplicada preguntaAplicada = new PreguntaAplicada();
			
			preguntaAplicada.setAlumno(alumno);
			preguntaAplicada.setPregunta(new Pregunta(preguntaDto.getPreguntaId()));
			preguntaAplicada.setRespuesta(preguntaDto.getRespuesta());
			examenAplicado.add(preguntaAplicada);
		}
		
		return examenAplicado;
	}
	
}
