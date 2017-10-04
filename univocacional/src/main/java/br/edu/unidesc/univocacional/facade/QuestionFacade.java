package br.edu.unidesc.univocacional.facade;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.edu.unidesc.univocacional.model.Question;
import br.edu.unidesc.univocacional.service.QuestionServiceInterface;

public class QuestionFacade implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject 
	private QuestionServiceInterface questionServiceInterface;
	
	public List<Question> getAll() {
		return questionServiceInterface.getAll();
	}
	
	public Question save(Question question) {
		return questionServiceInterface.save(question);
	}

}
