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
		name = "getAllNiveis",
		query = "select ne from NivelEscolaridade ne order by ne.nome"
	), 
	@NamedQuery(
	    name = "findById",
	    query = "select ne from NivelEscolaridade ne where ne.id = :id"
	) 
})
@Entity
@Table(name="nivel_escolaridade")
public class NivelEscolaridade implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY) //il va générer des codes automatiquement
	private Integer id;
	
	@Column(name="nome", length=50, nullable=false)
	private String nome;
	
	
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
	
	/**getters and setters**/
	
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
	
	
}


