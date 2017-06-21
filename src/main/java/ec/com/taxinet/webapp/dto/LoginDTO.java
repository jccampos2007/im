/**
 * 
 */
package ec.com.taxinet.webapp.dto;

import java.io.Serializable;

import ec.com.taxinet.webapp.model.Login;

/**
 * @author Juan Campos
 *
 */
public class LoginDTO extends BaseDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Login responseData;

	/**
	 * 
	 */
	public LoginDTO() {
		// TODO Auto-generated constructor stub
	}

	public Login getResponseData() {
		return responseData;
	}

	public void setResponseData(Login responseData) {
		this.responseData = responseData;
	}

	@Override
	public String toString() {
		return "LoginDTO [responseData=" + responseData + ", getResponseCode()=" + getResponseCode()
				+ ", getResponseMessage()=" + getResponseMessage() + ", getMethodName()=" + getMethodName()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
