package br.edu.unidesc.univocacional.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="result_details")
public class ResultDetails {
	
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY) //il va générer des codes automatiquement
	private Integer id;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="letter", nullable=false)
	private String letter;
	
	@Lob
	@Column(name="description", nullable=false)
	private String description;
	
	@Column(name="areas", nullable=false)
	private String areas;
	
}
