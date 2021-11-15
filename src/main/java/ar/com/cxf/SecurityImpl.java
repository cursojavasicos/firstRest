package ar.com.cxf;

import java.util.List;
import java.util.Map;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

import ar.com.cxf.beans.Parameter;
import ar.com.cxf.beans.Parameters;

public class SecurityImpl implements Security {

	@Override
	public Response autenticar(String token) {
		if("1234".equals(token)) {
			return Response.ok("OK").build();
		}else {
			return Response.ok("UNAUTHORIZED").status(Response.Status.UNAUTHORIZED).build();
		}
	}

	@Override
	public Response autenticar2(HttpHeaders headers) {
		Parameters parameters = new Parameters();
		for (Map.Entry<String, List<String>> entry: headers.getRequestHeaders().entrySet()) {
			parameters.getParams().add(new Parameter(entry.getKey(), entry.getValue().get(0)));
		}
		
		return Response.ok(parameters).build();
	}

}

