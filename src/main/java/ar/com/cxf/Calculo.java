package ar.com.cxf;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import ar.com.cxf.beans.CalculoResponse;

@Path("calculo")
@Consumes(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public interface Calculo  {

	/**
	 * Este servicio es similar al siguiente.  En este caso devuelve un objeto previamente generado y propio.
	 * 
	 * URL -> http://localhost:8080/firstRest/calculo/suma/10/20
	 */
	@GET
	@Path("suma/{valor1}/{valor2}")
	CalculoResponse suma(@PathParam("valor1") int v1, @PathParam("valor2") int v2);

	/**
	 * Aqui, en lugar de utilizar un objeto propio, utilizo un objeto de JAVA WS RS.
	 * 
	 * URL -> http://localhost:8080/firstRest/calculo/suma2/10/20
	 */
	@GET
	@Path("suma2/{valor1}/{valor2}")
	Response suma2(@PathParam("valor1") int v1, @PathParam("valor2") int v2);

	/**
	 * En lugar de recibir los parametros como parte del path (PathParam), viajan como QueryParams (despues del ? y separados por &)
	 * 
	 * URL -> http://localhost:8080/firstRest/calculo/sumaQuery?valor1=10&valor2=20
	 */
	@GET
	@Path("sumaQuery")
	Response sumaQuery(@QueryParam("valor1") int v1, @QueryParam("valor2") int v2);

	/**
	 * Cuando estoy utilizando QueryParams pero no sé que cantidad de parametros voy a recibir
	 * 
	 * URL -> http://localhost:8080/firstRest/calculo/sumaQuery2?p1=10&p2=20&p3=40 .....
	 */
	@GET
	@Path("sumaQuery2")
	Response sumaQuery2(@Context UriInfo uriinfo);

	/**
	 * Los parametros viajan igual que los QueryParams pero separados por ;
	 * 
	 * URL -> http://localhost:8080/firstRest/calculo/sumaMatriz;valor1=10;valor2=20
	 */
	@GET
	@Path("sumaMatrix")
	Response sumaMatrix(@MatrixParam("valor1") int v1, @MatrixParam("valor2") int v2);
	
	/**
	 * Cuando necesito que los parametros (idem QueryParams) viajen en el body del mensaje.  El verbo siempre será un POST/PUT/PATCH, no un GET
	 * 
	 * Importante, observar que el servicio debe recibir los dato si o si con Content Type 'multipart/form-data'
	 */
	@POST
	@Path("sumaForm")
	@Consumes(value={MediaType.MULTIPART_FORM_DATA, MediaType.APPLICATION_FORM_URLENCODED})
	Response sumaForm(@FormParam("valor1") int v1, @FormParam("valor2") int v2);
}

