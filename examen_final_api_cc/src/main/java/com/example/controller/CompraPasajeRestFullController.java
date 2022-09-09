package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.repositorios.model.CompraPasaje;
import com.example.servicios.ICompraPasajeService;

@RestController
@RequestMapping("/compras")
@CrossOrigin("http://localhost:8085/")
public class CompraPasajeRestFullController {
	
	@Autowired
	private ICompraPasajeService compraPasajeService;
	
	@GetMapping
	public CompraPasaje buscar(Integer num) {
		return this.compraPasajeService.find(num);
	}
}
