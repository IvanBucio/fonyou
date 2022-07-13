package com.example.fonyou.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Data
public class PreguntaAplicada implements Serializable {

	private static final long serialVersionUID = 2257034874884505056L;

	@Id
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "alumnoId", nullable = false, updatable = true)
	@JsonBackReference("alumno")
	private Alumno alumno;
	
	@ManyToOne
	@JoinColumn(name = "preguntaId", nullable = false, updatable = true)
	@JsonBackReference("pregunta")
	private Pregunta pregunta;
	
	@Column
	private String respuesta;
}
