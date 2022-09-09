package com.example.servicios;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repositorios.IVueloRepository;
import com.example.repositorios.model.Vuelo;
import com.example.servicios.To.VueloTo;

@Service
public class VueloServiceImpl implements IVueloService{

	@Autowired
	private IVueloRepository vueloRepository;
	
	
	@Override
	public void insert(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.vueloRepository.insertar(vuelo);
		
	}

	@Override
	public List<VueloTo> buscar(String origen, String destino, String fechaVuelo) {
		// TODO Auto-generated method stub
		
		List<Vuelo> lista = this.vueloRepository.buscar(origen, destino, fechaVuelo);
		List<VueloTo> listTo = lista.stream().map(vuelo -> this.convertirVueloTo(vuelo)).collect(Collectors.toList());
		
		
		return listTo;
	}
	
	private VueloTo convertirVueloTo(Vuelo vuelo ) {
		VueloTo aux = new VueloTo();
		aux.setDestino(vuelo.getDestino());
		aux.setOrigen(vuelo.getOrigen());
		aux.setFechaVuelo(vuelo.getFechaVuelo());
		aux.setCategoria(vuelo.getCategoria());
		aux.setNombre(vuelo.getNombre());
		aux.setValor(vuelo.getValorAsiento());
		aux.setNumero(vuelo.getNumero());
		
		return aux;
	}

}
