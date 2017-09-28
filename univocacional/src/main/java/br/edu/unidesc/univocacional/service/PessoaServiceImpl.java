package br.edu.unidesc.univocacional.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.edu.unidesc.univocacional.dao.PessoaDaoInterface;
import br.edu.unidesc.univocacional.model.NivelEscolaridade;
import br.edu.unidesc.univocacional.model.Pessoa;

public class PessoaServiceImpl implements PessoaServiceInterface{
	
	@Inject
	private PessoaDaoInterface pessoaDaoInterface;
	
	@Transactional
	public Pessoa save(Pessoa pessoa) {
		return pessoaDaoInterface.save(pessoa);
	}

	@Transactional
	public void update(Pessoa pessoa) {
		pessoaDaoInterface.update(pessoa);
	}
	
	@Override
	public void delete(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Pessoa> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NivelEscolaridade> getAllNiveis() {
		return pessoaDaoInterface.getAllNiveis();
	}
}
