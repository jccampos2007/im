/**
 * 
 */
package ec.com.taxinet.webapp.dto;

import java.io.Serializable;

import ec.com.taxinet.webapp.model.paymentManagement;

/**
 * @author Juan Campos
 *
 */
public class paymentManagementDTO extends BaseDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private paymentManagement responseData;
	
	/**
	 * 
	 */
	public paymentManagementDTO() {
		// TODO Auto-generated constructor stub
	}

	public paymentManagement getResponseData() {
		return responseData;
	}

	public void setResponseData(paymentManagement responseData) {
		this.responseData = responseData;
	}

	@Override
	public String toString() {
		return "paymentManagementDTO [responseData=" + responseData + ", getResponseCode()=" + getResponseCode()
				+ ", getResponseMessage()=" + getResponseMessage() + ", getMethodName()=" + getMethodName()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}