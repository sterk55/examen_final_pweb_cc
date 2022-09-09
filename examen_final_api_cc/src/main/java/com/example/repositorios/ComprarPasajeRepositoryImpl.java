package com.example.repositorios;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.repositorios.model.CompraPasaje;
@Repository
@Transactional
public class ComprarPasajeRepositoryImpl implements IComprarPasajeRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public CompraPasaje buscar(Integer num) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CompraPasaje.class, num);
	}

}
