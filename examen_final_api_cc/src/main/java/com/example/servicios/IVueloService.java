package com.example.servicios;

import java.util.List;

import com.example.repositorios.model.Vuelo;
import com.example.servicios.To.VueloTo;

public interface IVueloService {

	
	public void insert(Vuelo vuelo);
	public List<VueloTo> buscar(String origen, String destino, String fechaVuelo);
}
