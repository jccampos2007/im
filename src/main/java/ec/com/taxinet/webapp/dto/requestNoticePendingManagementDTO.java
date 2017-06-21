/**
 * 
 */
package ec.com.taxinet.webapp.dto;

import java.io.Serializable;
import ec.com.taxinet.webapp.model.requestNoticeMotiveManagement;

/**
 * @author Juan Campos
 *
 */
public class requestNoticePendingManagementDTO extends BaseDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private requestNoticeMotiveManagement responseData;
	
	/**
	 * 
	 */
	public requestNoticePendingManagementDTO() {
		// TODO Auto-generated constructor stub
	}

	public requestNoticeMotiveManagement getResponseData() {
		return responseData;
	}

	public void setResponseData(requestNoticeMotiveManagement responseData) {
		this.responseData = responseData;
	}

	@Override
	public String toString() {
		return "requestNoticePendingManagementDTO [responseData=" + responseData + ", getResponseCode()=" + getResponseCode()
				+ ", getResponseMessage()=" + getResponseMessage() + ", getMethodName()=" + getMethodName()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}