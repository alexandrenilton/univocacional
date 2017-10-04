package br.edu.unidesc.univocacional.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.edu.unidesc.univocacional.model.EducationLevel;

public class EducationLevelDaoImpl implements EducationLevelDaoInterface{
	
	@PersistenceContext(unitName="vocacionalPU")
	private EntityManager entityManager;
	
	public EducationLevel save(EducationLevel educationLevel) {
		entityManager.persist(educationLevel);
		return educationLevel;
	}
	
	public void update(EducationLevel educationLevel) {
		EducationLevel ne = entityManager.merge(educationLevel);
		entityManager.persist(ne);
	}
	
	public void delete(EducationLevel educationLevel) {
		EducationLevel ne = entityManager.merge(educationLevel);
		entityManager.remove(ne);
	}
	

	public List<EducationLevel> getAll() {
		Query query = entityManager.createNamedQuery("getAllLevels");
		List<EducationLevel> ne = query.getResultList();
		return ne;
	}

	@Override
	public EducationLevel findById(Integer id) {
		Query query = entityManager.createNamedQuery("findById").setParameter("id", id);
		return (EducationLevel) query.getResultList().get(0);
	}

}


