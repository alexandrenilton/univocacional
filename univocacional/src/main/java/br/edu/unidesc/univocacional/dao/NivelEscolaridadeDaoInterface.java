package br.edu.unidesc.univocacional.dao;

import java.util.List;

import br.edu.unidesc.univocacional.model.NivelEscolaridade;
import br.edu.unidesc.univocacional.model.Pessoa;

public interface NivelEscolaridadeDaoInterface {
	public NivelEscolaridade save(NivelEscolaridade nivelEscolaridade);
	public void update(NivelEscolaridade nivelEscolaridade);
	public void delete(NivelEscolaridade nivelEscolaridade) ;
	public List<Pessoa> getAll() ;
	public List<NivelEscolaridade> getAllNiveis();
	public NivelEscolaridade findById(Integer id);
}
