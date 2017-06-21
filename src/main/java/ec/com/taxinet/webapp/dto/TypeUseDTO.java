package ec.com.taxinet.webapp.dto;

import java.io.Serializable;

import ec.com.taxinet.webapp.model.TypeUse;

public class TypeUseDTO  extends BaseDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private TypeUse responseData;
	
	public TypeUseDTO(){
		
	}
	
	public TypeUse getResponseData() {
		return responseData;
	}
	
	public void setResponseData(TypeUse responseData) {
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
