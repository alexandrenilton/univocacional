package com.rest.model.service;

import java.util.List;

import com.rest.model.Professor;

public interface ProfessorServiceInterface {
	public Professor save(Professor professor);
	public void update(Professor professor);
	public void delete(Professor professor);
	public List<Professor> getAll();
}
