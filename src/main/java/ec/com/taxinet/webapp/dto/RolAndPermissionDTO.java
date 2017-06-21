/**
 * 
 */
package ec.com.taxinet.webapp.dto;

import java.io.Serializable;
import java.util.List;

import ec.com.taxinet.webapp.model.RoleAndPermissions;

/**
 * @author Juan Campos
 *
 */
public class RolAndPermissionDTO extends BaseDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private List<RoleAndPermissions> responseData;
	
	public RolAndPermissionDTO(){
		
	}

	/**
	 * @return the responseData
	 */
	public List<RoleAndPermissions> getResponseData() {
		return responseData;
	}

	/**
	 * @param responseData the responseData to set
	 */
	public void setResponseData(List<RoleAndPermissions> responseData) {
		this.responseData = responseData;
	}

	@Override
	public String toString() {
		return "RolAndPermissionDTO [responseData=" + responseData + ", getResponseCode()=" + getResponseCode()
				+ ", getResponseMessage()=" + getResponseMessage() + ", getMethodName()=" + getMethodName()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
	

}
