package com.example.controller;

import java.lang.reflect.Method;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.repositorios.model.Vuelo;
import com.example.servicios.IVueloService;
import com.example.servicios.To.VueloTo;

@RestController
@RequestMapping("/vuelos")
@CrossOrigin("http://localhost:8085/")
public class VueloRestFullController {

	@Autowired
	private IVueloService vueloService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public String insert(@RequestBody Vuelo vuelo) {
		String msg = "Vuelo insertado";
		
		this.vueloService.insert(vuelo);
		
		return msg;
		
	}
	
	@GetMapping(path = "/disponibles")
	public List<VueloTo> buscar(@RequestParam(value = "ori")String origen, @RequestParam(value = "des")String destino, @RequestParam(value = "fecha")String fechaVuelo){
		List<VueloTo> list = this.vueloService.buscar(origen, destino, fechaVuelo);
		
		
		return list;
	}
}
