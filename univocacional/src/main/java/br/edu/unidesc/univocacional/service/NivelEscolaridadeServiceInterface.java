package br.edu.unidesc.univocacional.service;

import java.util.List;

import br.edu.unidesc.univocacional.model.NivelEscolaridade;
import br.edu.unidesc.univocacional.model.Pessoa;

public interface NivelEscolaridadeServiceInterface {
	public NivelEscolaridade save(NivelEscolaridade nivelEscolaridade);
	public void update(NivelEscolaridade nivelEscolaridade);
	public void delete(NivelEscolaridade nivelEscolaridade);
	public List<NivelEscolaridade> getAll();
	public NivelEscolaridade findById(Integer id);
}
