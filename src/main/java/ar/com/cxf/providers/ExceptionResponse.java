package ar.com.cxf.providers;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


@XmlRootElement(name = "ExceptionResponse")
@JsonInclude(value = JsonInclude.Include.NON_EMPTY)
public class ExceptionResponse {

	private String httpCode = "401";

	private String message = "Unautorized";

	@JsonProperty("httpCode")
	public String getHttpCode() {
		return httpCode;
	}

	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
	}

	@JsonProperty("message")
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
