/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;

/**
 * @author Juan Campos
 *
 */
public class requestNoticePendingManagement implements Serializable {

	/**
	 * "id_request": 9,
    "code": 200,
    "errorCode": 0
	 */
	private static final long serialVersionUID = 1L;
	private Long id_request_notice_pending;
	private Long code;
	private Long errorCode;

	public requestNoticePendingManagement() {
		// TODO Auto-generated constructor stub
	}

	public Long getId_request_notice_pending() {
		return id_request_notice_pending;
	}

	public void setId_request_notice_pending(Long id_request_notice_pending) {
		this.id_request_notice_pending = id_request_notice_pending;
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
		return "requestNoticePendingManagement [id_request_notice_pending=" + id_request_notice_pending + ", code="
				+ code + ", errorCode=" + errorCode + "]";
	}
	
	
}
