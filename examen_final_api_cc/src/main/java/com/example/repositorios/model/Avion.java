package com.example.repositorios.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="avion")
public class Avion implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "avio_id")
	private Integer id;
	
	@Column(name = "avio_capacidades_asientos")
	private Integer CapacidadDeAsientos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCapacidadDeAsientos() {
		return CapacidadDeAsientos;
	}

	public void setCapacidadDeAsientos(Integer capacidadDeAsientos) {
		CapacidadDeAsientos = capacidadDeAsientos;
	}
	
	
}
