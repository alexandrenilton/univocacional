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
@Table(name="pessoa")
public class Pessoa {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY) //il va générer des codes automatiquement
	private Integer id;
	
	@Column(name="nome", length=50, nullable=false)
	private String nome;
	
	@Column(name="telefone", length=15, nullable=true)
	private String telefone;
	
	@Column(name="email", length=70, nullable=false)
	private String email;
	
	
	/*
	@ManyToOne //ici, nous avons plusieurs cursos qui peut-être lié à un professeur
	@JoinColumn(name="curs_prof_codigo", referencedColumnName="codigo")
	private Professor professor;
	*/
	public Pessoa() {

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


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

}


