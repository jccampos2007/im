package ec.com.taxinet.webapp.dto;

import java.io.Serializable;
import java.util.List;

import ec.com.taxinet.webapp.model.ResponseRequestList;

public class ResponseRequestListDTO extends BaseDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<ResponseRequestList> responseData;
	
	public ResponseRequestListDTO(){
		
	}

	public List<ResponseRequestList> getResponseData() {
		return responseData;
	}

	public void setResponseData(List<ResponseRequestList> responseData) {
		this.responseData = responseData;
	}

	@Override
	public String toString() {
		return "ResponseRequestListDTO [responseData=" + responseData + ", getResponseCode()=" + getResponseCode()
				+ ", getResponseMessage()=" + getResponseMessage() + ", getMethodName()=" + getMethodName()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
	
}
