package br.edu.unidesc.univocacional.dao;

import java.util.List;

import br.edu.unidesc.univocacional.model.EducationLevel;
import br.edu.unidesc.univocacional.model.Person;

public interface PersonDaoInterface {
	public Person save(Person person);
	public void update(Person person);
	public void delete(Person person) ;
	public List<Person> getAll() ;
	public List<EducationLevel> getAllLevels();
}
