/**
 * 
 */
package ec.com.taxinet.webapp.form.model;

/**
 * @author Juan Campos
 *
 */
public class LoginForm {
	
	private String appName;
	private String devicePushIdentifier;
	private String imei;
	private Integer mobileOS;
	private String username;
	private String password;
	private Integer version;

	/**
	 * 
	 */
	public LoginForm() {
		// TODO Auto-generated constructor stub
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getDevicePushIdentifier() {
		return devicePushIdentifier;
	}

	public void setDevicePushIdentifier(String devicePushIdentifier) {
		this.devicePushIdentifier = devicePushIdentifier;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public Integer getMobileOS() {
		return mobileOS;
	}

	public void setMobileOS(Integer mobileOS) {
		this.mobileOS = mobileOS;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "LoginForm [appName=" + appName + ", devicePushIdentifier=" + devicePushIdentifier + ", imei=" + imei
				+ ", mobileOS=" + mobileOS + ", username=" + username + ", password=" + password + ", version="
				+ version + "]";
	}

}
