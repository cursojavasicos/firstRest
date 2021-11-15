package ar.com.cxf.beans;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement(name = "Parameters")
@XmlAccessorType(XmlAccessType.FIELD)
public class Parameters {

	private List<Parameter> params = new ArrayList<Parameter>();

	@JsonProperty("params")
	public List<Parameter> getParams() {
		return params;
	}

	public void setParams(List<Parameter> params) {
		this.params = params;
	}
	
	
}
