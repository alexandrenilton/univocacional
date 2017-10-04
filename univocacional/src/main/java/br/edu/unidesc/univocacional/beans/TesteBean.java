package br.edu.unidesc.univocacional.beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.unidesc.univocacional.facade.PersonFacade;
import br.edu.unidesc.univocacional.model.EducationLevel;
import br.edu.unidesc.univocacional.model.Person;

@Named
@ViewScoped
public class TesteBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private PersonFacade personFacade;
	
	private Person person;
	private List<EducationLevel> educationLevels;
    
	public Person getPerson() {
		return person;
	}
	
	public String iniciar() {
		FacesContext context = FacesContext.getCurrentInstance();
		personFacade.save(person);
		context.addMessage(null, new FacesMessage("Loaded", "The test has inicialized"));
		return "/etapa2";
	}

	public void setPerson(Person pessoa) {
		this.person = pessoa;
	}
	
	@PostConstruct
	public void init(){
		if (person == null )
			person = new Person();
		if (educationLevels == null ) {
			educationLevels = personFacade.getAllLevels();
			System.out.println("Carregou..");
		}
	}

	public PersonFacade getPersonFacade() {
		return personFacade;
	}

	public void setPersonFacade(PersonFacade personFacade) {
		this.personFacade = personFacade;
	}

	public List<EducationLevel> getEducationLevels() {
		return educationLevels;
	}

	public void setEducationLevels(List<EducationLevel> educationLevels) {
		this.educationLevels = educationLevels;
	}
}
