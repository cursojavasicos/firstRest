package ar.com.cxf.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement(name = "Parameter")
@XmlAccessorType(XmlAccessType.FIELD)
public class Parameter {

	private String clave;
	
	private String valor;
	
	public Parameter() {}


	public Parameter(String c, String v) {
		this.setClave(c);
		this.setValor(v);
	}

	@JsonProperty("clave")
	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@JsonProperty("valor")
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
}
