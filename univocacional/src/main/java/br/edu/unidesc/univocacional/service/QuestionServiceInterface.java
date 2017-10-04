package br.edu.unidesc.univocacional.service;

import java.util.List;

import br.edu.unidesc.univocacional.model.Question;

public interface QuestionServiceInterface {
	public List<Question> getAll();
	public Question save(Question question);
	public void update(Question question);
	public void delete(Question question);
	public Question findById(Long id);
}
