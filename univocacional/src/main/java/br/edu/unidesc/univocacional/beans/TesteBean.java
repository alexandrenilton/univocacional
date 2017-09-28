package br.edu.unidesc.univocacional.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.unidesc.univocacional.facade.NivelEscolaridadeFacade;
import br.edu.unidesc.univocacional.facade.PessoaFacade;
import br.edu.unidesc.univocacional.model.NivelEscolaridade;
import br.edu.unidesc.univocacional.model.Pessoa;

@Named
@SessionScoped
public class TesteBean {
	
	private Pessoa pessoa;
	private List<NivelEscolaridade> niveis;
    
	
	@Inject
	private PessoaFacade pessoaFacade;
	
	@Inject
	private NivelEscolaridadeFacade nivelEscolaridadeFacade;

	public TesteBean() {
		pessoa = new Pessoa();
	}

	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public void iniciar() {
		FacesContext context = FacesContext.getCurrentInstance();
		pessoaFacade.save(pessoa);
		context.addMessage(null, new FacesMessage("Carregado", "Teste Iniciado"));
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	//Inicia qd criar, antes de tudo
	@PostConstruct
	public void init(){
		niveis = nivelEscolaridadeFacade.getAll();
	}

	public List<NivelEscolaridade> getNiveis() {
		return niveis;
	}

	public void setNiveis(List<NivelEscolaridade> niveis) {
		this.niveis = niveis;
	}
	
	
	

}
