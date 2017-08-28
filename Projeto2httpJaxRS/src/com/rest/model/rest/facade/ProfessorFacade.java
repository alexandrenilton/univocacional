package com.rest.model.rest.facade;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.model.Professor;

@Path("/professores")
@Produces({ MediaType.APPLICATION_JSON, 
		MediaType.APPLICATION_XML } )
@Consumes(MediaType.APPLICATION_JSON)
public class ProfessorFacade {
	static List<Professor> listProfessores = new ArrayList<Professor>();
	
	static {
		listProfessores.add(new Professor(1, "Alexandre Six", "alexandrenilton@gmail.com", "(61) 3627-2657"));
		listProfessores.add(new Professor(2, "Bernardo Six", "alexandrenilton@gmail.com", "(61) 3627-2657"));
		listProfessores.add(new Professor(3, "Catherine Six", "alexandrenilton@gmail.com", "(61) 3627-2657"));
		listProfessores.add(new Professor(4, "Sullivan Six", "alexandrenilton@gmail.com", "(61) 3627-2657"));
		listProfessores.add(new Professor(5, "Cobby Six", "alexandrenilton@gmail.com", "(61) 3627-2657"));
		
	}
	
	@GET
	public List<Professor> getProfessores() {
		return listProfessores;
	}
	
	@POST
	public Professor save(Professor professor) {
		professor.setCodigo(listProfessores.get(listProfessores.size()-1).getCodigo()+1);
		listProfessores.add(professor);
		return professor;
	}
	
	@DELETE
	@Path("/{codigoProfessor}")
	public void delete(@PathParam("codigoProfessor") Integer codigoProfessor) {
		Professor professor= new Professor();
		professor.setCodigo(codigoProfessor);
		listProfessores.remove(professor);
	}
}
