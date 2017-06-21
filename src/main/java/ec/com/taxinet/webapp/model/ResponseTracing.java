/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;

/**
 * @author Juan Campos
 *
 */
public class ResponseTracing implements Serializable {

	/**
	 * "id_request": 9,
    "code": 200,
    "errorCode": 0
	 */
	private static final long serialVersionUID = 1L;
	private Long id_tracing;
	private Long code;
	private Long errorCode;

	public ResponseTracing() {
		// TODO Auto-generated constructor stub
	}

	public Long getId_tracing() {
		return id_tracing;
	}

	public void setId_tracing(Long id_tracing) {
		this.id_tracing = id_tracing;
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
		return "ResponseTracing [id_tracing=" + id_tracing + ", code=" + code + ", errorCode=" + errorCode
				+ ", getId_tracing()=" + getId_tracing() + ", getCode()=" + getCode() + ", getErrorCode()="
				+ getErrorCode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
