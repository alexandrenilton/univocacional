package br.edu.unidesc.univocacional.facade;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.edu.unidesc.univocacional.model.NivelEscolaridade;
import br.edu.unidesc.univocacional.service.NivelEscolaridadeServiceInterface;

public class NivelEscolaridadeFacade implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject 
	private NivelEscolaridadeServiceInterface nivelEscolaridadeServiceInterface;
	
	public NivelEscolaridade save(NivelEscolaridade nivelEscolaridade) {
		return nivelEscolaridadeServiceInterface.save(nivelEscolaridade);
	}

	public NivelEscolaridade findById(Integer id) {
		return nivelEscolaridadeServiceInterface.findById(id);
	}
	
	public List<NivelEscolaridade> getAll(){
		return nivelEscolaridadeServiceInterface.getAll();
	}
	


}
