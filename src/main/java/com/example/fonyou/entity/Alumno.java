package com.example.fonyou.entity;

import java.io.Serializable;
import java.util.List;
import java.util.TimeZone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Alumno implements Serializable {

	private static final long serialVersionUID = 8969156063258808972L;

	@Id
	private Integer id;
	
	@Column
	private String nombre;
	
	@Column
	private Integer edad;
	
	@Column
	private String ciudad;
	
	@Column
	private TimeZone zonaHoraria;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "id")
	private List<PreguntaAplicada> preguntaAplicada;

}
