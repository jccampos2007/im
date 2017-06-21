package ec.com.taxinet.webapp.form.model;

public class AddFamilyRiderFrom {

	private Long idRider;
	private String email;
	private Long idUserSession;
	private String sessionToken;
	private String link;
	
	public AddFamilyRiderFrom(){
		
	}

	public Long getIdRider() {
		return idRider;
	}

	public void setIdRider(Long idRider) {
		this.idRider = idRider;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "AddFamilyRiderFrom [idRider=" + idRider + ", email=" + email + ", idUserSession=" + idUserSession
				+ ", sessionToken=" + sessionToken + ", link=" + link + "]";
	}

}
