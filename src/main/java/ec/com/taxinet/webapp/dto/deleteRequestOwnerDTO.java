/**
 * 
 */
package ec.com.taxinet.webapp.dto;

import java.io.Serializable;
import java.util.List;

import ec.com.taxinet.webapp.model.deleteRequestOwner;
import ec.com.taxinet.webapp.model.ownerFind;

/**
 * @author Juan Campos
 *
 */
public class deleteRequestOwnerDTO extends BaseDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private deleteRequestOwner responseData;
	
	/**
	 * 
	 */
	public deleteRequestOwnerDTO() {
		// TODO Auto-generated constructor stub
	}

	public deleteRequestOwner getResponseData() {
		return responseData;
	}

	public void setResponseData(deleteRequestOwner responseData) {
		this.responseData = responseData;
	}

	@Override
	public String toString() {
		return "deleteRequestOwnerDTO [responseData=" + responseData + ", getResponseCode()=" + getResponseCode()
				+ ", getResponseMessage()=" + getResponseMessage() + ", getMethodName()=" + getMethodName()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}