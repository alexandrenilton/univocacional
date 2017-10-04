package br.edu.unidesc.univocacional.dao;

import java.util.List;

import br.edu.unidesc.univocacional.model.EducationLevel;

public interface EducationLevelDaoInterface {
	public EducationLevel save(EducationLevel educationLevel);
	public void update(EducationLevel educationLevel);
	public void delete(EducationLevel educationLevel) ;
	public List<EducationLevel> getAll() ;
	public EducationLevel findById(Integer id);
}
