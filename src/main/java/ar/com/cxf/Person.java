package ar.com.cxf;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ar.com.cxf.beans.Persona;
import ar.com.cxf.beans.Persona2;

@Path("persona")
@Consumes(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public interface Person  {

	/**
	 * Si voy a enviar el JSON o XML que contiene los datos de persona en el
	 * body del mensaje CXF realizará el mapeo automático al objeto.
	 * Si deseo enviar parametros de diferente tipo (HEADER, FORM) y que se integren
	 * en un bean debo utilizar @BeanParam y Media Type 'multipart/form-data'
	 **/
	
	@POST
	@Path("/")
	Response altaPersona(Persona p);
	
	/**
	 * En este caso usaremos un BeanParam que juntará dentro del objeto Persona2 3 parametros
	 * un FormParam, un HeaderParam y un PathParam
	 *
	 */
	@POST
	@Path("/{edad}")
	@Consumes(value={MediaType.MULTIPART_FORM_DATA, MediaType.APPLICATION_FORM_URLENCODED})
	Response altaPersona2(@BeanParam Persona2 p);
	
	
	@PUT
	@Path("/")
	Response updatePersona(Persona p);
	
}

