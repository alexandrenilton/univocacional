package br.edu.unidesc.univocacional.beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.FlowEvent;

import br.edu.unidesc.univocacional.facade.QuestionFacade;
import br.edu.unidesc.univocacional.model.Question;


@Named
@ViewScoped
public class TesteWizardBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Question> questions;
	
	@Inject
	private QuestionFacade questionFacade;
	
	@PostConstruct
	public void init(){
		System.out.println("Carregou TesteWizard.init()");
		if (questions == null ) {
			questions = questionFacade.getAll();
			System.out.println("Carregado..");
		}
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
	public String onFlowProcess(FlowEvent event) {
		return event.getNewStep();
    }
}

