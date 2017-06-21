package ec.com.taxinet.webapp.dto;

import java.io.Serializable;
import java.util.List;

import ec.com.taxinet.webapp.model.CiudadanoSucre;

public class CiudadanoSucreDTO  extends BaseDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private CiudadanoSucre responseData;
	
	public CiudadanoSucreDTO(){
		
	}
	
	public CiudadanoSucre getResponseData() {
		return responseData;
	}
	public void setResponseData(CiudadanoSucre responseData) {
		this.responseData = responseData;
	}

	@Override
	public String toString() {
		return "CiudadanoSucreDTO [responseData=" + responseData + ", getResponseCode()=" + getResponseCode()
				+ ", getResponseMessage()=" + getResponseMessage() + ", getMethodName()=" + getMethodName()
				+ ", toString()=" + super.toString() + ", getErrorCode()=" + getErrorCode() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
