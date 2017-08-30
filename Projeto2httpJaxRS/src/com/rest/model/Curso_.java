package com.rest.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-08-30T10:51:33.354-0300")
@StaticMetamodel(Curso.class)
public class Curso_ {
	public static volatile SingularAttribute<Curso, Integer> codigo;
	public static volatile SingularAttribute<Curso, String> descricao;
	public static volatile SingularAttribute<Curso, String> diashorarios;
	public static volatile SingularAttribute<Curso, Professor> professor;
}
