package ec.com.taxinet.webapp.form.model;

public class DeleteDriverTaxiForm {
	
	private int idDriver;
    private int idTaxi;
    private int idUserSession;
    private String sessionToken;

	public DeleteDriverTaxiForm() {
		// TODO Auto-generated constructor stub
	}

	public int getIdDriver() {
		return idDriver;
	}

	public void setIdDriver(int idDriver) {
		this.idDriver = idDriver;
	}

	public int getIdTaxi() {
		return idTaxi;
	}

	public void setIdTaxi(int idTaxi) {
		this.idTaxi = idTaxi;
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
		return "DeleteDriverTaxiForm [idDriver=" + idDriver + ", idTaxi=" + idTaxi + ", idUserSession=" + idUserSession
				+ ", sessionToken=" + sessionToken + "]";
	}

}
