/**
 * 
 */
package ec.com.taxinet.webapp.model;

/**
 * @author Juan Campos
 *
 */
public class Device {
	
	private int idDevice;
    private String imei;
    private int idModel;
    private String serial;
    private String mobile;
    private int idCity;
    private int idUserSession;
    private String sessionToken;

	/**
	 * 
	 */
	public Device() {
		// TODO Auto-generated constructor stub
	}

	public int getIdDevice() {
		return idDevice;
	}

	public void setIdDevice(int idDevice) {
		this.idDevice = idDevice;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public int getIdModel() {
		return idModel;
	}

	public void setIdModel(int idModel) {
		this.idModel = idModel;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getIdCity() {
		return idCity;
	}

	public void setIdCity(int idCity) {
		this.idCity = idCity;
	}

	public int getIdUserSession() {
		return idUserSession;
	}

	public void setIdUserSession(int idUserSession) {
		this.idUserSession = idUserSession;
	}

	public String getSessionToken() {
		return sessionToken;
	}

	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}

	@Override
	public String toString() {
		return "Device [idDevice=" + idDevice + ", imei=" + imei + ", idModel=" + idModel + ", serial=" + serial
				+ ", mobile=" + mobile + ", idCity=" + idCity + ", idUserSession=" + idUserSession + ", sessionToken="
				+ sessionToken + "]";
	}

	

}
