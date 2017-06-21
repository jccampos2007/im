package ec.com.taxinet.webapp.form.model;

import java.io.Serializable;

public class InfoRestablecerClave implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String email;
	private String mobilePhone;
	private String appName;
	private String userName;
	
	public InfoRestablecerClave() {
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "InfoRestablecerClave [email=" + email + ", mobilePhone=" + mobilePhone + ", appName=" + appName
				+ ", userName=" + userName + "]";
	}

}
