package br.edu.unidesc.univocacional.service;

import java.util.List;

import br.edu.unidesc.univocacional.model.NivelEscolaridade;
import br.edu.unidesc.univocacional.model.Pessoa;

public interface PessoaServiceInterface {
	public Pessoa save(Pessoa pessoa);
	public void update(Pessoa pessoa);
	public void delete(Pessoa pessoa);
	public List<Pessoa> getAll();
	public List<NivelEscolaridade> getAllNiveis();
}
