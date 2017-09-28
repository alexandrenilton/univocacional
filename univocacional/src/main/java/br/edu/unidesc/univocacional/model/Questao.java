package br.edu.unidesc.univocacional.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="questao")
public class Questao {
	
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY) //il va g�n�rer des codes automatiquement
	private Integer id;
	
	@Column(name="numero", nullable=false)
	private Integer numero;
	
	@Column(name="enunciado", nullable=false)
	private String enunciado;
	
	@OneToMany /*Uma questao para varias alternativas*/
	private List<AlternativaQuestao> alternativas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public List<AlternativaQuestao> getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(List<AlternativaQuestao> alternativas) {
		this.alternativas = alternativas;
	}
	
	
}
