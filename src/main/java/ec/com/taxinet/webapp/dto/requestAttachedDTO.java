/**
 * 
 */
package ec.com.taxinet.webapp.dto;

import java.io.Serializable;

import ec.com.taxinet.webapp.model.requestAttached;

/**
 * @author Juan Campos
 *
 */
public class requestAttachedDTO extends BaseDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private requestAttached responseData;
	
	/**
	 * 
	 */
	public requestAttachedDTO() {
		// TODO Auto-generated constructor stub
	}

	public requestAttached getResponseData() {
		return responseData;
	}

	public void setResponseData(requestAttached responseData) {
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