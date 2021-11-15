package ar.com.cxf.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement(name = "CalculoResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class CalculoResponse {

	private String code = "0";
	
	private String message = "Success";

	private ResultadoData data;

	public CalculoResponse() {}

	public CalculoResponse(ResultadoData d) {
		this.setData(d);
	}
	
	@JsonProperty("data")
	public ResultadoData getData() {
		return data;
	}

	public void setData(ResultadoData data) {
		this.data = data;
	}

	@JsonProperty("code")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@JsonProperty("message")
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
