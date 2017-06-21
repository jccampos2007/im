/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;

/**
 * @author Juan Campos
 *
 */
public class paymentManagement implements Serializable {

	/**
	 * "id_owner": 9,
    "code": 200,
    "errorCode": 0
	 */
	private static final long serialVersionUID = 1L;
	private Long request_payment_id;
	private Long code;
	private Long errorCode;
	
	/**
	 * 
	 */
	public paymentManagement() {
		// TODO Auto-generated constructor stub
	}

	public Long getRequest_payment_id() {
		return request_payment_id;
	}

	public void setRequest_payment_id(Long request_payment_id) {
		this.request_payment_id = request_payment_id;
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
		return "paymentManagement [request_payment_id=" + request_payment_id + ", code=" + code + ", errorCode="
				+ errorCode + ", getRequest_payment_id()=" + getRequest_payment_id() + ", getCode()=" + getCode()
				+ ", getErrorCode()=" + getErrorCode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
