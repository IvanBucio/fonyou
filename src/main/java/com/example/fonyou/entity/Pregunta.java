package com.example.fonyou.entity;

import java.io.Serializable;
import java.util.List;
import java.util.TimeZone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Data
public class Pregunta implements Serializable {

	private static final long serialVersionUID = 1971997515023180010L;

	@Id
	private Integer id;
	
	@Column
	private String nombreTest;
	
	@Column
	private TimeZone timeZone;
	
	@Column
	private String pregunta;
	
	@Column
	private Integer porcentaje;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH, mappedBy = "id")
	private List<Respuesta> respuestaList;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH, mappedBy = "id")
	private List<PreguntaAplicada> preguntaAplicadaList;
	
	public Pregunta(int id) {
		this.id = id;
	}

}
