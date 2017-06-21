/**
 * 
 */
package ec.com.taxinet.webapp.dto;

import java.io.Serializable;
import java.util.List;

import ec.com.taxinet.webapp.model.zoneList;

/**
 * @author Juan Campos
 *
 */
public class zoneListDTO extends BaseDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<zoneList> responseData;
	
	public zoneListDTO() {
		// TODO Auto-generated constructor stub
	}

	public List<zoneList> getResponseData() {
		return responseData;
	}

	public void setResponseData(List<zoneList> responseData) {
		this.responseData = responseData;
	}

	@Override
	public String toString() {
		return "zoneListDTO [responseData=" + responseData + ", getResponseCode()=" + getResponseCode()
				+ ", getResponseMessage()=" + getResponseMessage() + ", getMethodName()=" + getMethodName()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}