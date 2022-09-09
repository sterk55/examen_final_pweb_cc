package com.example.servicios.To;

import java.io.Serializable;

import org.springframework.hateoas.RepresentationModel;

public class VueloTo extends RepresentationModel<VueloTo> implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer numero;
	private String categoria;
	private String nombre;
	private Double valor;
	private String origen;
	private String destino;
	private String fechaVuelo;
	
	
	
	
	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}


	public String getOrigen() {
		return origen;
	}
	

	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getFechaVuelo() {
		return fechaVuelo;
	}
	public void setFechaVuelo(String fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}
	
	
}
