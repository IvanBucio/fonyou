package com.example.fonyou.dto;

import java.util.List;

import lombok.Data;

@Data
public class ExamenDto {

	private Integer alumnoId;
	private List<PreguntaDto> preguntaList;
}
