package com.rest.model.dao;

import java.util.List;

import com.rest.model.Professor;

public interface ProfessorDaoInterface {
	public Professor save(Professor professor);
	public void update(Professor professor);
	public void delete(Professor professor);
	public List<Professor> getAll();
}
