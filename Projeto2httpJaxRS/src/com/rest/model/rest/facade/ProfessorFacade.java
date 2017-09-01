package com.rest.model.rest.facade;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.model.Professor;
import com.rest.model.service.ProfessorServiceInterface;

@Path("/professores")
@Produces({ MediaType.APPLICATION_JSON, 
		MediaType.APPLICATION_XML } )
@Consumes(MediaType.APPLICATION_JSON)
public class ProfessorFacade {
	
	/* --  direto sem uso de service e interface
	@Inject 
	private ProfessorDaoImpl professorDaoImpl;
	*/
	
	@Inject
	private ProfessorServiceInterface professorServiceInterface;
	
	/*Constructor */
	public ProfessorFacade() {
	
	}
	
	@GET
	public List<Professor> getProfessores() {
		return professorServiceInterface.getAll();
	}
	
	@POST
	public Professor save(Professor professor) {
		return professorServiceInterface.save(professor);
	}
	
	@PUT
	public void update(Professor professor) {
		professorServiceInterface.update(professor);
	}
	
	@DELETE
	@Path("/{codigoProfessor}")
	public void delete(@PathParam("codigoProfessor") Integer codigoProfessor) {
		Professor professorTemp = new Professor();
		professorTemp.setCodigo(codigoProfessor);
		professorServiceInterface.delete(professorTemp);
	}
}
