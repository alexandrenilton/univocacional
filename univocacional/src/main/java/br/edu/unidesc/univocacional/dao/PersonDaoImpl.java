package br.edu.unidesc.univocacional.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.edu.unidesc.univocacional.model.EducationLevel;
import br.edu.unidesc.univocacional.model.Person;

public class PersonDaoImpl implements PersonDaoInterface{
	
	@PersistenceContext(unitName="vocacionalPU")
	private EntityManager entityManager;
	
	public Person save(Person person) {
		entityManager.persist(person);
		return person;
	}
	
	public void update(Person person) {
		Person p = entityManager.merge(person);
		entityManager.persist(p);
	}
	
	public void delete(Person person) {
		Person p = entityManager.merge(person);
		entityManager.remove(p);
	}
	
	public List<Person> getAll(){
		Query query = entityManager.createNamedQuery("getPeople");
		return query.getResultList();
	}

	@Override
	public List<EducationLevel> getAllLevels() {
		Query query = entityManager.createNamedQuery("getAllLevels");
		List<EducationLevel> ne = query.getResultList();
		return ne;
	}

}


