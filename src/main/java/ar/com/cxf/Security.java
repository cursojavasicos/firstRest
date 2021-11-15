package ar.com.cxf;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("security")
@Consumes(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public interface Security  {

	@GET
	@Path("login")
	Response autenticar(@HeaderParam("authorization") String token);

	@GET
	@Path("headers")
	Response autenticar2(@Context HttpHeaders headers);
	
}

