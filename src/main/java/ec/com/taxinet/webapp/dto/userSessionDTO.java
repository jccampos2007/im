/**
 * 
 */
package ec.com.taxinet.webapp.dto;

import java.io.Serializable;
import java.util.List;

import ec.com.taxinet.webapp.model.userSession;

/**
 * @author Juan Campos
 *
 */
public class userSessionDTO extends BaseDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private List<userSession> responseData;
	
	public userSessionDTO(){
		// TODO Auto-generated constructor stub
	}

	public List<userSession> getResponseData() {
		return responseData;
	}

	public void setResponseData(List<userSession> responseData) {
		this.responseData = responseData;
	}

	@Override
	public String toString() {
		return "userSessionDTO [responseData=" + responseData + ", getResponseCode()=" + getResponseCode()
				+ ", getResponseMessage()=" + getResponseMessage() + ", getMethodName()=" + getMethodName()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
	

}
