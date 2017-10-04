package br.edu.unidesc.univocacional.facade;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.edu.unidesc.univocacional.model.EducationLevel;
import br.edu.unidesc.univocacional.service.EducationLevelServiceInterface;

public class EducationLevelFacade implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject 
	private EducationLevelServiceInterface educationLevelServiceInterface;
	
	public EducationLevel save(EducationLevel nivelEscolaridade) {
		return educationLevelServiceInterface.save(nivelEscolaridade);
	}

	public EducationLevel findById(Integer id) {
		return educationLevelServiceInterface.findById(id);
	}
	
	public List<EducationLevel> getAll(){
		return educationLevelServiceInterface.getAll();
	}
	


}
