/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;

/**
 * @author Juan Campos
 *
 */
public class requestAttached implements Serializable {

	/**
	 * "id_request_attached": 1,
    "code": 200,
    "errorCode": 0
	 */
	private static final long serialVersionUID = 1L;
	private Long id_request_attached;
	private Long code;
	private Long errorCode;

	public requestAttached() {
		// TODO Auto-generated constructor stub
	}

	public Long getId_request_attached() {
		return id_request_attached;
	}

	public void setId_request_attached(Long id_request_attached) {
		this.id_request_attached = id_request_attached;
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
		return "requestManagement [id_request_attached=" + id_request_attached + ", code=" + code + ", errorCode=" + errorCode
				+ ", getId_request_attached()=" + getId_request_attached() + ", getCode()=" + getCode() + ", getErrorCode()="
				+ getErrorCode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
