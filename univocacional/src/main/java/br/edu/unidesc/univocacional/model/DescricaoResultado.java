package br.edu.unidesc.univocacional.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="descricao_resultado")
public class DescricaoResultado {
	
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY) //il va générer des codes automatiquement
	private Integer id;
	
	@Column(name="nome", nullable=false)
	private String nome;
	
	@Column(name="letra", nullable=false)
	private String letraMaiorOcorrencia;
	
	@Lob
	@Column(name="descricao", nullable=false)
	private String email;
	
	@Column(name="cursos", nullable=false)
	private String cursos;
	
	
	public String getLetraMaiorOcorrencia() {
		return letraMaiorOcorrencia;
	}

	public void setLetraMaiorOcorrencia(String letraMaiorOcorrencia) {
		this.letraMaiorOcorrencia = letraMaiorOcorrencia;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCursos() {
		return cursos;
	}

	public void setCursos(String cursos) {
		this.cursos = cursos;
	}
	
}
