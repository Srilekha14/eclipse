package com.org;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Demo") 
public class DemoRest {
	@Path("/Simple")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String Test(){
	System.out.println("test() is called");
	return"<greeting><Hello RESTful></greeting>";
}
	@GET
	@Path("/getcustomer")
	@Produces(MediaType.APPLICATION_XML)
	public customer sendCustomer() {
		System.out.println("sendCustomer is called");
		customer c = new customer(111, "Rahul", 34);
		return c;
	}

}
