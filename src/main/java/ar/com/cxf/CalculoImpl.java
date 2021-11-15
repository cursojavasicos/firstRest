package ar.com.cxf;

import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import ar.com.cxf.beans.CalculoResponse;
import ar.com.cxf.beans.Parameter;
import ar.com.cxf.beans.Parameters;
import ar.com.cxf.beans.ResultadoData;

public class CalculoImpl implements Calculo {

	@Override
	public CalculoResponse suma(int v1, int v2) {
		return new CalculoResponse(new ResultadoData(v1 + v2));
	}

	@Override
	public Response suma2(int v1, int v2) {
		
		return Response.ok(new ResultadoData(v1 + v2)).build();
	}

	@Override
	public Response sumaQuery(int v1, int v2) {
		return Response.ok(new ResultadoData(v1 + v2)).build();
	}

	@Override
	public Response sumaQuery2(UriInfo uriInfo) {
		Parameters parameters = new Parameters();
		for (Map.Entry<String, List<String>> entry: uriInfo.getQueryParameters().entrySet()) {
			parameters.getParams().add(new Parameter(entry.getKey(), entry.getValue().get(0)));
		}
		
		return Response.ok(parameters).build();
	}

	@Override
	public Response sumaForm(int v1, int v2) {
		return Response.ok(new ResultadoData(v1 + v2)).build();
	}

	@Override
	public Response sumaMatrix(int v1, int v2) {
		return Response.ok(new ResultadoData(v1 + v2)).build();
	}

}

