/**
 * 
 */
package ec.com.taxinet.webapp.dto;

import java.io.Serializable;
import java.util.List;

import ec.com.taxinet.webapp.model.ordinanceList;

/**
 * @author Juan Campos
 *
 */
public class ordinanceListDTO extends BaseDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ordinanceList> responseData;
	
	/**
	 * 
	 */
	public ordinanceListDTO() {
		// TODO Auto-generated constructor stub
	}

	public List<ordinanceList> getResponseData() {
		return responseData;
	}

	public void setResponseData(List<ordinanceList> responseData) {
		this.responseData = responseData;
	}

	@Override
	public String toString() {
		return "ordinanceListDTO [responseData=" + responseData + ", getResponseCode()=" + getResponseCode()
				+ ", getResponseMessage()=" + getResponseMessage() + ", getMethodName()=" + getMethodName()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}