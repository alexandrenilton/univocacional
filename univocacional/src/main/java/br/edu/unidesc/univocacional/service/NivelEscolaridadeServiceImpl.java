package br.edu.unidesc.univocacional.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.edu.unidesc.univocacional.dao.NivelEscolaridadeDaoInterface;
import br.edu.unidesc.univocacional.model.NivelEscolaridade;

@RequestScoped
public class NivelEscolaridadeServiceImpl implements NivelEscolaridadeServiceInterface{
	
	@Inject
	private NivelEscolaridadeDaoInterface nivelEscolaridadeDaoInterface;
	
	@Transactional
	public NivelEscolaridade save(NivelEscolaridade nivelEscolaridade) {
		return nivelEscolaridadeDaoInterface.save(nivelEscolaridade);
	}
	
	@Transactional
	public void update(NivelEscolaridade nivelEscolaridade) {
		nivelEscolaridadeDaoInterface.update(nivelEscolaridade);
	}
	
	@Override
	public void delete(NivelEscolaridade nivelEscolaridade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<NivelEscolaridade> getAll() {
		return nivelEscolaridadeDaoInterface.getAllNiveis();
	}

	@Override
	public NivelEscolaridade findById(Integer id) {
		return nivelEscolaridadeDaoInterface.findById(id);
	}

	

}
