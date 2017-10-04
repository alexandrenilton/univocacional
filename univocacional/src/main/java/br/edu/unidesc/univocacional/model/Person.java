package br.edu.unidesc.univocacional.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="person")
public class Person {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY) //il va générer des codes automatiquement
	private Integer id;
	
	@Column(name="name", length=50, nullable=false)
	private String name;
	
	@Column(name="phone", length=15, nullable=true)
	private String phone;
	
	@Column(name="email", length=70, nullable=false)
	private String email;
	
	@OneToOne 
	private EducationLevel educationLevel;

	public EducationLevel getEducationLevel() {
		return educationLevel;
	}

	public void setNivelEscolaridade(EducationLevel educationLevel) {
		this.educationLevel = educationLevel;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setEducationLevel(EducationLevel educationLevel) {
		this.educationLevel = educationLevel;
	}
}


