package br.edu.unidesc.univocacional.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="alternative_question")
public class AlternativeQuestion {

	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY) //il va générer des codes automatiquement
	private Integer id;
	
	@Column(name="letter", nullable=false)
	private char letter;
	
	@Column(name="description", nullable=false)
	private String description;
	
	@ManyToOne (cascade = CascadeType.ALL) /*varias alternativas para uma questao*/
	@JoinColumn(name="question_id", referencedColumnName="id")
	private Question question;
	
	public AlternativeQuestion() {
		
	}
	
	public AlternativeQuestion(char letter, String description) {
		this.letter = letter;
		this.description = description;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestao(Question question) {
		this.question = question;
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
}
