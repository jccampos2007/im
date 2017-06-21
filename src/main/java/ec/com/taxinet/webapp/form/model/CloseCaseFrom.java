package ec.com.taxinet.webapp.form.model;

public class CloseCaseFrom {

	private String detail;
	private Long idCasePanic;
	private Long idPanic;
	private Long idStaff;
	private Long idUserSession;
	private String sessionToken;
	
	public CloseCaseFrom(){
		
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Long getIdCasePanic() {
		return idCasePanic;
	}

	public void setIdCasePanic(Long idCasePanic) {
		this.idCasePanic = idCasePanic;
	}

	public Long getIdPanic() {
		return idPanic;
	}

	public void setIdPanic(Long idPanic) {
		this.idPanic = idPanic;
	}

	public Long getIdStaff() {
		return idStaff;
	}

	public void setIdStaff(Long idStaff) {
		this.idStaff = idStaff;
	}

	public Long getIdUserSession() {
		return idUserSession;
	}

	public void setIdUserSession(Long idUserSession) {
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
		return "CloseCaseFrom [detail=" + detail + ", idCasePanic=" + idCasePanic + ", idPanic=" + idPanic
				+ ", idStaff=" + idStaff + ", idUserSession=" + idUserSession + ", sessionToken=" + sessionToken + "]";
	}
	
}