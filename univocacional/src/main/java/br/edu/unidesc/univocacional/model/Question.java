package br.edu.unidesc.univocacional.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@NamedQueries({
	@NamedQuery(
		name = "Question.getAll",
		query = "select q from Question q order by q.sequence"
	),
	@NamedQuery(
		name = "Question.findById",
		query = "select q from Question q where q.id = :id"
	)
})
@Entity
@Table(name="question")
public class Question {
	
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY) 
	private Integer id;
	
	@Column(name="sequence", nullable=false)
	private Integer sequence;
	
	@Column(name="title", nullable=false)
	private String title;
	
	@OneToMany (mappedBy = "question", fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	private List<AlternativeQuestion> alternatives;

	public Question() {
		
	}
	
	public Question(Integer sequence, String title, List<AlternativeQuestion> alternatives) {
		this.sequence = sequence;
		this.title = title;
		this.alternatives = alternatives;
	}
	
	/** Testar isso **/
	public void addToQuestion(List<AlternativeQuestion> alternatives) {
		if (alternatives != null ) {
			for (AlternativeQuestion alternativeQuestion : alternatives) {
				alternativeQuestion.setQuestion(this);
				this.alternatives.addAll(alternatives);
			}
		}
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSequence() {
		return sequence;
	}
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<AlternativeQuestion> getAlternatives() {
		return alternatives;
	}
	public void setAlternatives(List<AlternativeQuestion> alternatives) {
		this.alternatives = alternatives;
	}
}
