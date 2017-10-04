package br.edu.unidesc.univocacional.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@NamedQueries({
	@NamedQuery(
		name = "getAllLevels",
		query = "select e from EducationLevel e order by e.name"
	), 
	@NamedQuery(
	    name = "findById",
	    query = "select e from EducationLevel e where e.id = :id"
	)
})
@Entity
@Table(name="education_level")
public class EducationLevel implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY) //il va générer des codes automatiquement
	private Integer id;
	
	@Column(name="nome", length=50, nullable=false)
	private String name;
	
	
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
	
	@Override
    public boolean equals(Object object) {
        return (object instanceof EducationLevel) && 
        		(id != null) ? id.equals(((EducationLevel) object).id) : (object == this);
    }
	
	/**getters and setters**/
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}


