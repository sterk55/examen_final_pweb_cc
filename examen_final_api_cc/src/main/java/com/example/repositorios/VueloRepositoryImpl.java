package com.example.repositorios;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.repositorios.model.Vuelo;

@Repository
@Transactional
public class VueloRepositoryImpl implements IVueloRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vuelo);
	}

	@Override
	public void update(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.entityManager.merge(vuelo);

	}

	@Override
	public List<Vuelo> buscar(String origenD, String destinoD, String fechaD) {
		// TODO Auto-generated method stub
		TypedQuery<Vuelo> myQuery = this.entityManager.createQuery(
				"SELECT p from Vuelo p WHERE p.origen =: origenD AND p.destino =: destinoD AND p.fechaVuelo =: fechaD",
				Vuelo.class);
		myQuery.setParameter("origenD", origenD);
		myQuery.setParameter("destinoD", destinoD);
		myQuery.setParameter("fechaD", fechaD);
		

		return myQuery.getResultList();
	}

}
