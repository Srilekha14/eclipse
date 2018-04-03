package com.org;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("/test")
public class test2 {
@GET
@Path("/test1")
@Produces(MediaType.APPLICATION_XML)
	public Response get(){
		Response res=null;
		customer c=new customer(143,"kuppa",23);
		res =Response.status(200).entity(c).build();
		return res;
	}
}
