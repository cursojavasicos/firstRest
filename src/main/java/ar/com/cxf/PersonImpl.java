package ar.com.cxf;

import javax.ws.rs.core.Response;

import ar.com.cxf.beans.Persona;
import ar.com.cxf.beans.Persona2;

public class PersonImpl implements Person {

	@Override
	public Response altaPersona(Persona p) {
		System.out.println(p.getNombre());
		System.out.println(p.getApellido());
		System.out.println(p.getEdad());
		
		return Response.ok("OK").build();
	}

	@Override
	public Response updatePersona(Persona p) {
		/**
		 * Comportamiento de ejemplo sugerido
		 * 
		 * 		
		 Persona aux = dao.getPersona(p.getDni());
		
		if (aux == null) {
			return Response.ok("NOT FOUND").status(Response.Status.NO_CONTENT).build();
		} else {
			dao.update(p);
			
			return Response.ok("OK").build();
		}

		 * 
		 */
		
		return Response.ok("OK").build();
	}

	@Override
	public Response altaPersona2(Persona2 p) {
		System.out.println(p.getNombre());
		System.out.println(p.getApellido());
		System.out.println(p.getEdad());
		
		return Response.ok("OK").build();
	}

}

