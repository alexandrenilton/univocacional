package br.edu.unidesc.univocacional.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.edu.unidesc.univocacional.dao.PersonDaoInterface;
import br.edu.unidesc.univocacional.model.EducationLevel;
import br.edu.unidesc.univocacional.model.Person;

public class PersonServiceImpl implements PersonServiceInterface{
	
	@Inject
	private PersonDaoInterface pessoaDaoInterface;
	
	@Transactional
	public Person save(Person pessoa) {
		return pessoaDaoInterface.save(pessoa);
	}

	@Transactional
	public void update(Person pessoa) {
		pessoaDaoInterface.update(pessoa);
	}
	
	@Override
	public void delete(Person pessoa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Person> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<EducationLevel> getAllLevels() {
		return pessoaDaoInterface.getAllLevels();
	}
}
