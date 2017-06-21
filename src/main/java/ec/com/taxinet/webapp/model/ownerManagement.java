/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;

/**
 * @author Juan Campos
 *
 */
public class ownerManagement implements Serializable {

	/**
	 * "id_owner": 9,
    "code": 200,
    "errorCode": 0
	 */
	private static final long serialVersionUID = 1L;
	private Long id_owner;
	private Long code;
	private Long errorCode;
	
	/**
	 * 
	 */
	public ownerManagement() {
		// TODO Auto-generated constructor stub
	}

	public Long getId_owner() {
		return id_owner;
	}

	public void setId_owner(Long id_owner) {
		this.id_owner = id_owner;
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
		return "ownerManagement [id_owner=" + id_owner + ", code=" + code + ", errorCode=" + errorCode
				+ ", getId_owner()=" + getId_owner() + ", getCode()=" + getCode() + ", getErrorCode()=" + getErrorCode()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
