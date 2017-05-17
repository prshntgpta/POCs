/**
 * 
 */
package org.prshntgpta.jaxrsapp;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Prashant Gupta
 *
 */

@Path("/jaxrs/")
public class JAXRSService {
	
	
	@GET
	@Path("/getString")
	@Produces(MediaType.APPLICATION_JSON)
	public String getRecordInString() {

		Record record = new Record(1,"Shubhi","TechMahindra");		
		return record.toString();

	}
	
	@GET
	@Path("/getJson")
	@Produces(MediaType.APPLICATION_JSON)
	public Record getRecordInJSON() {

		Record record = new Record(1,"Shubhi","TechMahindra");		
		return record;

	}
	
	
	@GET
	@Path("/getXml")
	@Produces(MediaType.APPLICATION_XML)
	public Record getRecordInXML() {

		Record record = new Record(1,"Shubhi","TechMahindra");		
		return record;

	}
	
	
	@POST
	@Path("/postJson")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createRecordInJSON(Record record){
		
		String result = "Employee saved : " + record.toString();
		return Response.status(201).entity(result).build();
	}
	
	
	@POST
	@Path("/postXml")
	@Consumes(MediaType.APPLICATION_XML)
	public Response createRecordInXml(Record record){
		
		String result = "Employee saved : " + record.toString();
		return Response.status(201).entity(result).build();
	}

}
