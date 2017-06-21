/**
 * 
 */
package ec.com.taxinet.webapp.model;

import java.io.Serializable;

/**
 * @author Juan Campos
 *
 */
public class deleteRequestOwner implements Serializable {

	/**
	 * "id_owner": 1,
      "name_owner": "JUAN CARLOS",
      "email_owner": "JUANC@GMAIL.COM",
      "owner_id": "13564508",
      "nationality_owner": "V",
      "phone_owner": "02127899081",
      "mobile_owner": "O4164223567"
	 */
	private static final long serialVersionUID = 1L;
	private Integer code;
	private Integer errorCode;
	
	/**
	 * 
	 */
	public deleteRequestOwner() {
		// TODO Auto-generated constructor stub
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	@Override
	public String toString() {
		return "deleteRequestOwner [code=" + code + ", errorCode=" + errorCode + "]";
	}
	
}
