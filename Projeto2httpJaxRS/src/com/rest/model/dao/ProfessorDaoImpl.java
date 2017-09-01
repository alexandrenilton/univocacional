package com.rest.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.rest.model.Professor;

public class ProfessorDaoImpl implements ProfessorDaoInterface{
	
	@PersistenceContext(unitName="cursoPU") //donner les informations sur le persistence unit
	private EntityManager entityManager;
	
	
	@Override
	public Professor save(Professor professor) {
		entityManager.persist(professor);
		return professor;
	}

	@Override
	public void update(Professor professor) {
		Professor p = entityManager.merge(professor);
		entityManager.persist(p);
	}

	@Override
	public void delete(Professor professor) {
		Professor p = entityManager.merge(professor);
		entityManager.remove(p);
	}

	@Override
	public List<Professor> getAll() {
		//Query query = entityManager.createQuery("select p from Professor order by p.codigo");
		Query query = entityManager.createNamedQuery("getAllProfessors");
		return query.getResultList();
	}

}
