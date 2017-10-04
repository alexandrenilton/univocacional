package br.edu.unidesc.univocacional.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.edu.unidesc.univocacional.dao.EducationLevelDaoInterface;
import br.edu.unidesc.univocacional.model.EducationLevel;

public class EducationLevelServiceImpl implements EducationLevelServiceInterface{
	
	@Inject
	private EducationLevelDaoInterface nivelEscolaridadeDaoInterface;
	
	@Transactional
	public EducationLevel save(EducationLevel nivelEscolaridade) {
		return nivelEscolaridadeDaoInterface.save(nivelEscolaridade);
	}
	
	@Transactional
	public void update(EducationLevel nivelEscolaridade) {
		nivelEscolaridadeDaoInterface.update(nivelEscolaridade);
	}
	
	@Override
	public void delete(EducationLevel nivelEscolaridade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EducationLevel> getAll() {
		return nivelEscolaridadeDaoInterface.getAll();
	}

	@Override
	public EducationLevel findById(Integer id) {
		return nivelEscolaridadeDaoInterface.findById(id);
	}

	

}
