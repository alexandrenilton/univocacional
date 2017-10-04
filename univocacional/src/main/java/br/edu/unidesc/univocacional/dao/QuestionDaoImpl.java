package br.edu.unidesc.univocacional.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.edu.unidesc.univocacional.model.EducationLevel;
import br.edu.unidesc.univocacional.model.Person;
import br.edu.unidesc.univocacional.model.Question;

public class QuestionDaoImpl implements QuestionDaoInterface{
	
	@PersistenceContext(unitName="vocacionalPU")
	private EntityManager entityManager;
	
	public List<Question> getAll() {
		Query query = entityManager.createNamedQuery("Question.getAll");
		List<Question> questions = query.getResultList();
		return questions;
	}

	@Override
	public Question save(Question question) {
		entityManager.persist(question);
		return question;
	}

	@Override
	public void update(Question question) {
		Question q = entityManager.merge(question);
		entityManager.persist(q);
	}

	@Override
	public void delete(Question question) {
		Question q = entityManager.merge(question);
		entityManager.remove(q);
	}

	@Override
	public Question findById(Long id) {
		Query query = entityManager.createNamedQuery("Question.findById").setParameter("id", id);
		Question question = (Question) query.getResultList().get(0);
		return question;
	}
}


