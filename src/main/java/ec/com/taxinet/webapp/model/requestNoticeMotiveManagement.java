/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;

/**
 * @author Juan Campos
 *
 */
public class requestNoticeMotiveManagement implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id_request_notice_motive;
	private Long code;
	private Long errorCode;

	public requestNoticeMotiveManagement() {
		// TODO Auto-generated constructor stub
	}

	public Long getId_request_notice_motive() {
		return id_request_notice_motive;
	}

	public void setId_request_notice_motive(Long id_request_notice_motive) {
		this.id_request_notice_motive = id_request_notice_motive;
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
		return "requestNoticeMotiveManagement [id_request_notice_motive=" + id_request_notice_motive + ", code=" + code
				+ ", errorCode=" + errorCode + "]";
	}

}
