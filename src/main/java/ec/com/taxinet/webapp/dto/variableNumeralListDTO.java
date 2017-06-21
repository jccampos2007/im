/**
 * 
 */
package ec.com.taxinet.webapp.dto;

import java.io.Serializable;
import java.util.List;

import ec.com.taxinet.webapp.model.variableNumeralList;

/**
 * @author Juan Campos
 *
 */
public class variableNumeralListDTO extends BaseDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<variableNumeralList> responseData;
	
	public variableNumeralListDTO() {
		// TODO Auto-generated constructor stub
	}

	public List<variableNumeralList> getResponseData() {
		return responseData;
	}

	public void setResponseData(List<variableNumeralList> responseData) {
		this.responseData = responseData;
	}

	@Override
	public String toString() {
		return "variableNumeralListDTO [responseData=" + responseData + ", getResponseCode()=" + getResponseCode()
				+ ", getResponseMessage()=" + getResponseMessage() + ", getMethodName()=" + getMethodName()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}