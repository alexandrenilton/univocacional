package br.edu.unidesc.univocacional.service;

import java.util.List;

import br.edu.unidesc.univocacional.model.EducationLevel;
import br.edu.unidesc.univocacional.model.Person;

public interface EducationLevelServiceInterface {
	public EducationLevel save(EducationLevel nivelEscolaridade);
	public void update(EducationLevel nivelEscolaridade);
	public void delete(EducationLevel nivelEscolaridade);
	public List<EducationLevel> getAll();
	public EducationLevel findById(Integer id);
}
