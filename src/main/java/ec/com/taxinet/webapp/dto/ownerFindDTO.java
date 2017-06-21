/**
 * 
 */
package ec.com.taxinet.webapp.dto;

import java.io.Serializable;
import java.util.List;

import ec.com.taxinet.webapp.model.ownerFind;

/**
 * @author Juan Campos
 *
 */
public class ownerFindDTO extends BaseDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ownerFind> responseData;
	
	/**
	 * 
	 */
	public ownerFindDTO() {
		// TODO Auto-generated constructor stub
	}

	public List<ownerFind> getResponseData() {
		return responseData;
	}

	public void setResponseData(List<ownerFind> responseData) {
		this.responseData = responseData;
	}

	@Override
	public String toString() {
		return "ownerFindDTO [responseData=" + responseData + ", getResponseCode()=" + getResponseCode()
				+ ", getResponseMessage()=" + getResponseMessage() + ", getMethodName()=" + getMethodName()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}