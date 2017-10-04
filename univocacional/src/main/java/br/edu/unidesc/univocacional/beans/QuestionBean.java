package br.edu.unidesc.univocacional.beans;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.unidesc.univocacional.facade.QuestionFacade;
import br.edu.unidesc.univocacional.model.AlternativeQuestion;
import br.edu.unidesc.univocacional.model.Question;
@Named
@ViewScoped
public class QuestionBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private QuestionFacade questionFacade;
	
	private Question question;
	
	private String stringTest;
	
	@PostConstruct
	public void init() {
		if (question == null ) {
			question = new Question();
		}
		testIt();
	}
	
	public void testIt() {
		AlternativeQuestion aqA = new AlternativeQuestion('a', "Alternativa A");
		AlternativeQuestion aqB = new AlternativeQuestion('b', "Alternativa B");
		AlternativeQuestion aqC = new AlternativeQuestion('c', "Alternativa C");
		AlternativeQuestion aqD = new AlternativeQuestion('d', "Alternativa D");
		AlternativeQuestion aqE = new AlternativeQuestion('e', "Alternativa E");
		AlternativeQuestion aqF = new AlternativeQuestion('f', "Alternativa F");
		
		List<AlternativeQuestion> altes = new LinkedList<AlternativeQuestion>();
		altes.add(aqA); altes.add(aqB); altes.add(aqC);altes.add(aqF);altes.add(aqE);altes.add(aqF);
		
		Question q = new Question(1, "Enunciado de teste", altes);
		
		Question temp = questionFacade.save(q);
		
		System.out.println("Temp.: "+temp.getId());
		System.out.println("Details.: "+temp.toString());
	}

	public String getStringTest() {
		return stringTest;
	}

	public void setStringTest(String stringTest) {
		this.stringTest = stringTest;
	}
	
	
}

