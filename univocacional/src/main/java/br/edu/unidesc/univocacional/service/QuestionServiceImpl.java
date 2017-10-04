package br.edu.unidesc.univocacional.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.edu.unidesc.univocacional.dao.QuestionDaoInterface;
import br.edu.unidesc.univocacional.model.Question;

public class QuestionServiceImpl implements QuestionServiceInterface{
	
	@Inject
	private QuestionDaoInterface questionDaoInterface;
	
	@Transactional
	public List<Question> getAll() {
		return questionDaoInterface.getAll();
	}

	@Transactional
	public Question save(Question question) {
		return questionDaoInterface.save(question);
	}

	@Transactional
	public void update(Question question) {
		questionDaoInterface.update(question);
	}

	@Transactional
	public void delete(Question question) {
		questionDaoInterface.delete(question);
	}

	@Transactional
	public Question findById(Long id) {
		return questionDaoInterface.findById(id);
	}
}
