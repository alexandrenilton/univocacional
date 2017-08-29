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

import com.rest.model.Curso;
import com.rest.model.Professor;

@Path("/cursos")
@Produces({ MediaType.APPLICATION_JSON, 
		MediaType.APPLICATION_XML } )
@Consumes(MediaType.APPLICATION_JSON)
public class CursoFacade {
	
	static List<Curso> listCursos = new ArrayList<Curso>();
	static Professor professor = new Professor();
	
	static {
		professor = new Professor(5, "Cobby Six", "alexandrenilton@gmail.com", "(61) 3627-2657");
		
		listCursos.add(new Curso(1, "Curso de Java", "Terças 19h", 
				new Professor(1, "Alexandre Six", "alexandrenilton@gmail.com", "(61) 36272657")));
		listCursos.add(new Curso(2, "Curso de Java Web", "Quartas 19h", 
				new Professor(2, "Français Karl", "alexandrenilton@gmail.com", "(61) 36272657")));
		listCursos.add(new Curso(3, "Curso de Java Android", "Segundas 19h",
				new Professor(3, "Terrèce Dupoint", "terrece.du.point@gmail.com", "(61) 36272657")));
		listCursos.add(new Curso(4, "Curso de Java Swing", "Quintas 19h", 
				new Professor(4, "Teresa Mayer", "tmayer@gmail.com", "(61) 36272657")));
		listCursos.add(new Curso(5, "Spring Framework", "Sabados 09h", 
				new Professor(5, "Claudionor Ferreira", "claudionor_ferreira@gmail.com", "(61) 36272657")));
		listCursos.add(new Curso(6, "Curso de Javascript", "Sextas 19h", 
				new Professor(1, "William Passos", "william.passos@gmail.com", "(61) 36272657")));
		listCursos.add(new Curso(7, "Curso de AngularJS", "Sabados 13h", 
				new Professor(2, "Antonio Cercado", "cercado@gmail.com", "(61) 36272657")));
		
	}
	
	@GET
	public List<Curso> getCursos() {
		return listCursos;
	}
	
	@POST
	public Curso save(Curso curso) {
		professor.setCodigo(listCursos.get(listCursos.size()-1).getCodigo()+1);
		listCursos.add(curso);
		return curso;
	}
	
	@DELETE
	@Path("/{codigoCurso}")
	public void delete(@PathParam("codigoCurso") Integer codigoCurso) {
		Curso curso = new Curso();
		curso.setCodigo(codigoCurso);
		listCursos.remove(curso);
	}
}
