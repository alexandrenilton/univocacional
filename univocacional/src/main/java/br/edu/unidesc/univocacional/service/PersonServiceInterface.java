package br.edu.unidesc.univocacional.service;

import java.util.List;

import br.edu.unidesc.univocacional.model.EducationLevel;
import br.edu.unidesc.univocacional.model.Person;

public interface PersonServiceInterface {
	public Person save(Person pessoa);
	public void update(Person pessoa);
	public void delete(Person pessoa);
	public List<Person> getAll();
	public List<EducationLevel> getAllLevels();
}
