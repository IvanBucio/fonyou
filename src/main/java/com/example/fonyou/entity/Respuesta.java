package com.example.fonyou.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Data
public class Respuesta implements Serializable {

	private static final long serialVersionUID = 6671379076876064641L;

	@Id
	private Integer id;
	
	@Column
	private String respuesta;
	
	@Column
	private Boolean esCorrecta;
	
	@ManyToOne
	@JoinColumn(name = "preguntaId", nullable = false, updatable = true)
	@JsonBackReference("pregunta")
	private Pregunta pregunta;

}
