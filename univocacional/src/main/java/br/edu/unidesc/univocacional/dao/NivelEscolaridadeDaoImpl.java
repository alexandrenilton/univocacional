package br.edu.unidesc.univocacional.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.edu.unidesc.univocacional.model.NivelEscolaridade;

public class NivelEscolaridadeDaoImpl implements NivelEscolaridadeDaoInterface{
	
	@PersistenceContext(unitName="vocacionalPU")
	private EntityManager entityManager;
	
	public NivelEscolaridade save(NivelEscolaridade nivelEscolaridade) {
		entityManager.persist(nivelEscolaridade);
		return nivelEscolaridade;
	}
	
	public void update(NivelEscolaridade nivelEscolaridade) {
		NivelEscolaridade ne = entityManager.merge(nivelEscolaridade);
		entityManager.persist(ne);
	}
	
	public void delete(NivelEscolaridade nivelEscolaridade) {
		NivelEscolaridade ne = entityManager.merge(nivelEscolaridade);
		entityManager.remove(ne);
	}
	

	public List<NivelEscolaridade> getAll() {
		Query query = entityManager.createNamedQuery("getAllNiveis");
		List<NivelEscolaridade> ne = query.getResultList();
		return ne;
	}

	@Override
	public NivelEscolaridade findById(Integer id) {
		Query query = entityManager.createNamedQuery("findById").setParameter("id", id);
		return (NivelEscolaridade) query.getResultList().get(0);
	}

}


