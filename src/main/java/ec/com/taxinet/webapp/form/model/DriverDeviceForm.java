package ec.com.taxinet.webapp.form.model;

public class DriverDeviceForm {
	
	private int idDriverDevice;
    private int idDriver;
    private int idDevice;
    private int  status; 
    private int idUserSession;
    private String sessionToken; 


	public DriverDeviceForm() {
		// TODO Auto-generated constructor stub
	}


	public int getIdDriverDevice() {
		return idDriverDevice;
	}


	public void setIdDriverDevice(int idDriverDevice) {
		this.idDriverDevice = idDriverDevice;
	}


	public int getIdDriver() {
		return idDriver;
	}


	public void setIdDriver(int idDriver) {
		this.idDriver = idDriver;
	}


	public int getIdDevice() {
		return idDevice;
	}


	public void setIdDevice(int idDevice) {
		this.idDevice = idDevice;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
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
		return "DriverDeviceForm [idDriverDevice=" + idDriverDevice + ", idDriver=" + idDriver + ", idDevice="
				+ idDevice + ", status=" + status + ", idUserSession=" + idUserSession + ", sessionToken="
				+ sessionToken + "]";
	}



}
