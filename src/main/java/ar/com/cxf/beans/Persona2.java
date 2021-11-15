package ar.com.cxf.beans;

import javax.ws.rs.FormParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PathParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Bean creado para probar la recepcion de parametros de múltiples tipos centralizados 
 * en un BeanParam
 *
 */

@XmlRootElement(name = "Persona2")
@XmlAccessorType(XmlAccessType.FIELD)
public class Persona2 {

	@FormParam("nombre")
	private String nombre;
	
	@HeaderParam("apellido")
	private String apellido;
	
	@PathParam("edad")
	private int edad;

	@JsonProperty("nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@JsonProperty("apellido")
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@JsonProperty("edad")
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
