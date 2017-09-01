package com.rest.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import com.rest.model.Professor;
import com.rest.model.dao.ProfessorDaoInterface;

public class ProfessorServiceImpl implements ProfessorServiceInterface{

	@Inject
	private ProfessorDaoInterface professorDaoInterface;
	
	public List<Professor> getAll() {
		return professorDaoInterface.getAll();
	}
	
	@Transactional
	public Professor save(Professor professor) {
		return professorDaoInterface.save(professor);
	}

	@Transactional
	public void update(Professor professor) {
		professorDaoInterface.update(professor);
	}

	@Transactional
	public void delete(Professor professor) {
		professorDaoInterface.delete(professor);
	}

}
