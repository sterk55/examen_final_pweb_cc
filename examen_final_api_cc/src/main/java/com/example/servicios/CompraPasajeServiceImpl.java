package com.example.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repositorios.IComprarPasajeRepository;
import com.example.repositorios.model.CompraPasaje;

@Service
public class CompraPasajeServiceImpl implements ICompraPasajeService{

	@Autowired
	private IComprarPasajeRepository comprarPasajeRepository;
	
	
	@Override
	public CompraPasaje find(Integer num) {
		// TODO Auto-generated method stub
		return this.comprarPasajeRepository.buscar(num);
	}

}
