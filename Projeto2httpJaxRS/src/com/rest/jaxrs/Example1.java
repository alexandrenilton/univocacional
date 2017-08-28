package com.rest.jaxrs;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/examplewsrs")
public class Example1 {

	@GET
	public String show() {
		return "I've runned a get command!";
	}
	
	@POST
	public String post() {
		return "This is a POST request";
	}
	
	@DELETE
	public String delete() {
		return "THis is a DELETE request";
	}
	
	@PUT
	public String put() {
		return "This is a put request";
	}
	
}
