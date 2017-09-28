package br.edu.unidesc.univocacional.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="alternativa_questao")
public class AlternativaQuestao {

	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY) //il va g�n�rer des codes automatiquement
	private Integer id;
	
	@Column(name="letra", nullable=false)
	private char letra;
	
	@Column(name="descricao", nullable=false)
	private String descricao;
	
	@Column(name="peso", nullable=true)
	private double peso;
		
	@ManyToOne /*varias alternativas para uma questao*/
	@JoinColumn(name="questao_id", referencedColumnName="id")
	private Questao questao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Questao getQuestao() {
		return questao;
	}

	public void setQuestao(Questao questao) {
		this.questao = questao;
	}
	
	
}
