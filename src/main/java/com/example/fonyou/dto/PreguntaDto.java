package com.example.fonyou.dto;

import java.util.List;

import lombok.Data;

@Data
public class PreguntaDto {

	private Integer preguntaId;
	private List<RespuestaDto> respuestas;
	private String respuesta;
}
