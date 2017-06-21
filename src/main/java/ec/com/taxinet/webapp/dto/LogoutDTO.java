package ec.com.taxinet.webapp.dto;

import java.io.Serializable;

public class LogoutDTO extends BaseDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public LogoutDTO() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "LogoutDTO [getResponseCode()=" + getResponseCode()
				+ ", getResponseMessage()=" + getResponseMessage() + ", getMethodName()=" + getMethodName()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
