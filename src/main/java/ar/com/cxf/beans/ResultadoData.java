package ar.com.cxf.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement(name = "ResultadoData")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResultadoData {

	private int resultado;
	
	public ResultadoData() {}
	
	public ResultadoData(int r) {
		this.setResultado(r);
	}

	@JsonProperty("resultado")
	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
}
