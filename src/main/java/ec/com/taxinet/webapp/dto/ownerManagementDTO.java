/**
 * 
 */
package ec.com.taxinet.webapp.dto;

import java.io.Serializable;

import ec.com.taxinet.webapp.model.ownerManagement;

/**
 * @author Juan Campos
 *
 */
public class ownerManagementDTO extends BaseDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ownerManagement responseData;
	
	/**
	 * 
	 */
	public ownerManagementDTO() {
		// TODO Auto-generated constructor stub
	}

	public ownerManagement getResponseData() {
		return responseData;
	}

	public void setResponseData(ownerManagement responseData) {
		this.responseData = responseData;
	}

	@Override
	public String toString() {
		return "ownerManagementDTO [responseData=" + responseData + ", getResponseCode()=" + getResponseCode()
				+ ", getResponseMessage()=" + getResponseMessage() + ", getMethodName()=" + getMethodName()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}