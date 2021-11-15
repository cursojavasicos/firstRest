package ar.com.cxf.providers;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class ExceptionHandler implements ExceptionMapper<WebApplicationException> {

	@Override
	public Response toResponse(WebApplicationException exception) {
		ExceptionResponse exc = new ExceptionResponse();
		exc.setHttpCode(String.valueOf(exception.getResponse().getStatus()));
		exc.setMessage(exception.getMessage());
		
		return Response.status(exception.getResponse().getStatus()).type(exception.getResponse().getMediaType()).entity(exc).build();
	}

}
