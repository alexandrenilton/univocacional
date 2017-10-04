package br.edu.unidesc.univocacional.facade;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.edu.unidesc.univocacional.model.EducationLevel;
import br.edu.unidesc.univocacional.model.Person;
import br.edu.unidesc.univocacional.service.EducationLevelServiceInterface;
import br.edu.unidesc.univocacional.service.PersonServiceInterface;

public class PersonFacade implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject 
	private PersonServiceInterface personServiceInterface;
	
	public Person save(Person pessoa) {
		return personServiceInterface.save(pessoa);
	}

	public List<EducationLevel> getAllLevels() {
		return personServiceInterface.getAllLevels();
	}

}
