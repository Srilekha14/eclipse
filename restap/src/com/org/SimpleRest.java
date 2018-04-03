package com.org;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("/simple")
public class SimpleRest {
	@GET
	@Path("/content1")
	@Produces(MediaType.TEXT_PLAIN)
public Response getSomeContent1(){
	Response response=null;
	customer customer=new customer(143,"kuppa",23);
	String content=customer.getCustomerId()+";"+customer.getCustomerName()+";"+customer.getAge();
	response =Response.status(200).entity(content).build();
	return response; 
	}
	@GET
	@Path("/content2")
	@Produces(MediaType.APPLICATION_XML)
	public Response getSomeContent2(){
		Response response=null;
		customer c=new customer(143,"kuppa",23);
		//String content=customer.getCustomerId()+";"+customer.getCustomerName()+";"+customer.getAge();
		response =Response.status(200).entity(c).build();
		return response;
	
	}
}
