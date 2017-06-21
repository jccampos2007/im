/**
 * 
 */
package ec.com.taxinet.webapp.dto;

import java.io.Serializable;
import java.util.List;

import ec.com.taxinet.webapp.model.typeUseList;

/**
 * @author Juan Campos
 *
 */
public class typeUseListDTO extends BaseDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<typeUseList> responseData;
	
	/**
	 * 
	 */
	public typeUseListDTO() {
		// TODO Auto-generated constructor stub
	}

	public List<typeUseList> getResponseData() {
		return responseData;
	}

	public void setResponseData(List<typeUseList> responseData) {
		this.responseData = responseData;
	}

	@Override
	public String toString() {
		return "typeUseListDTO [responseData=" + responseData + ", getResponseCode()=" + getResponseCode()
				+ ", getResponseMessage()=" + getResponseMessage() + ", getMethodName()=" + getMethodName()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}