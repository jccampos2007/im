/**
 * 
 */
package ec.com.taxinet.webapp.dto;

import java.io.Serializable;

import ec.com.taxinet.webapp.model.ownerManagement;
import ec.com.taxinet.webapp.model.requestManagement;

/**
 * @author Juan Campos
 *
 */
public class requestManagementDTO extends BaseDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private requestManagement responseData;
	
	/**
	 * 
	 */
	public requestManagementDTO() {
		// TODO Auto-generated constructor stub
	}

	public requestManagement getResponseData() {
		return responseData;
	}

	public void setResponseData(requestManagement responseData) {
		this.responseData = responseData;
	}

	@Override
	public String toString() {
		return "requestManagementDTO [responseData=" + responseData + ", getResponseCode()=" + getResponseCode()
				+ ", getResponseMessage()=" + getResponseMessage() + ", getMethodName()=" + getMethodName()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}