package com.example.repositorios;

import java.util.List;

import com.example.repositorios.model.Vuelo;

public interface IVueloRepository {
	
	
	public void insertar(Vuelo vuelo);
	public void update(Vuelo vuelo);
	public List<Vuelo> buscar(String origen, String destino, String fecha);
	
}
