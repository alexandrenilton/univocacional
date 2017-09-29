package br.edu.unidesc.univocacional.facade;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.edu.unidesc.univocacional.model.NivelEscolaridade;
import br.edu.unidesc.univocacional.model.Pessoa;
import br.edu.unidesc.univocacional.service.NivelEscolaridadeServiceInterface;
import br.edu.unidesc.univocacional.service.PessoaServiceInterface;

public class PessoaFacade implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject 
	private PessoaServiceInterface pessoaServiceInterface;
	
	// 
	//private NivelEscolaridadeServiceInterface nivelEscolaridadeServiceInterface ;
	
	
	public Pessoa save(Pessoa pessoa) {
		return pessoaServiceInterface.save(pessoa);
	}

	public List<NivelEscolaridade> getAllNiveis() {
		//return nivelEscolaridadeServiceInterface.getAll();
		return pessoaServiceInterface.getAllNiveis();
	}

}
