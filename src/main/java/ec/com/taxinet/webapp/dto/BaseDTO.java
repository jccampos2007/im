/**
 * 
 */
package ec.com.taxinet.webapp.dto;

import java.io.Serializable;

/**
 * @author Juan Campos
 *
 */
public class BaseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer responseCode;
	private String responseMessage;
	private String methodName;
	private Integer errorCode;
	
	/**
	 * 
	 */
	public BaseDTO() {
		// TODO Auto-generated constructor stub
	}

	public Integer getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	@Override
	public String toString() {
		return "BaseDTO [responseCode=" + responseCode + ", responseMessage=" + responseMessage + ", methodName="
				+ methodName + ", errorCode=" + errorCode + "]";
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

}
