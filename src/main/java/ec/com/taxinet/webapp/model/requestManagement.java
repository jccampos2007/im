/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;

/**
 * @author Juan Campos
 *
 */
public class requestManagement implements Serializable {

	/**
	 * "id_request": 9,
    "code": 200,
    "errorCode": 0
	 */
	private static final long serialVersionUID = 1L;
	private Long id_request;
	private Long code;
	private Long errorCode;

	public requestManagement() {
		// TODO Auto-generated constructor stub
	}

	public Long getId_request() {
		return id_request;
	}

	public void setId_request(Long id_request) {
		this.id_request = id_request;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public Long getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Long errorCode) {
		this.errorCode = errorCode;
	}

	@Override
	public String toString() {
		return "requestManagement [id_request=" + id_request + ", code=" + code + ", errorCode=" + errorCode
				+ ", getId_request()=" + getId_request() + ", getCode()=" + getCode() + ", getErrorCode()="
				+ getErrorCode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
