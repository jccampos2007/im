/**
 * 
 */
package ec.com.taxinet.webapp.dto;

import java.io.Serializable;

import ec.com.taxinet.webapp.model.ResponseTracing;

/**
 * @author Juan Campos
 *
 */
public class tracingManagementDTO extends BaseDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ResponseTracing responseData;
	
	/**
	 * 
	 */
	public tracingManagementDTO() {
		// TODO Auto-generated constructor stub
	}

	public ResponseTracing getResponseData() {
		return responseData;
	}

	public void setResponseData(ResponseTracing responseData) {
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